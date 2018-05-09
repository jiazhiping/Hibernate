package com.sinosoft.demo;

/**
 * @Title: Testhibernate
 * @Description: ${description}
 * @Copyright: Copyright (c) 2018
 * @Company: sinosoft
 * @Create: 2018-05-08 14:33
 * @Author: 贾治平
 * @Version: 1.0
 **/
public class EmpEntity {
    private int empid;
    private int orgid;
    private String empcode;
    private String empname;
    private String sex;
    //private Date birthday;
    private String postcode;
    private String address;
    private String phone;
    private Double wage;

    //多对一关系映射 多个成员对应部门
    private OrgEntity orgEntity;

    public OrgEntity getOrgEntity() {
        return orgEntity;
    }

    public void setOrgEntity(OrgEntity orgEntity) {
        this.orgEntity = orgEntity;
    }

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public String getEmpcode() {
        return empcode;
    }

    public void setEmpcode(String empcode) {
        this.empcode = empcode;
    }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    /*public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
*/
    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Double getWage() {
        return wage;
    }

    public void setWage(Double wage) {
        this.wage = wage;
    }

    public int getOrgid() {
        return orgid;
    }

    public void setOrgid(int orgid) {
        this.orgid = orgid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmpEntity empEntity = (EmpEntity) o;

        if (empid != empEntity.empid) return false;
        if (empcode != null ? !empcode.equals(empEntity.empcode) : empEntity.empcode != null) return false;
        if (empname != null ? !empname.equals(empEntity.empname) : empEntity.empname != null) return false;
        if (sex != null ? !sex.equals(empEntity.sex) : empEntity.sex != null) return false;
        if (postcode != null ? !postcode.equals(empEntity.postcode) : empEntity.postcode != null) return false;
        if (address != null ? !address.equals(empEntity.address) : empEntity.address != null) return false;
        if (phone != null ? !phone.equals(empEntity.phone) : empEntity.phone != null) return false;
        if (wage != null ? !wage.equals(empEntity.wage) : empEntity.wage != null) return false;
        return orgEntity != null ? orgEntity.equals(empEntity.orgEntity) : empEntity.orgEntity == null;
    }

    @Override
    public int hashCode() {
        int result = empid;
        result = 31 * result + (empcode != null ? empcode.hashCode() : 0);
        result = 31 * result + (empname != null ? empname.hashCode() : 0);
        result = 31 * result + (sex != null ? sex.hashCode() : 0);
        result = 31 * result + (postcode != null ? postcode.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        result = 31 * result + (wage != null ? wage.hashCode() : 0);
        result = 31 * result + (orgEntity != null ? orgEntity.hashCode() : 0);
        return result;
    }
}
