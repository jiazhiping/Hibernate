package com.sinosoft.demo;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * @Title: Testhibernate
 * @Description: ${description}
 * @Copyright: Copyright (c) 2018
 * @Company: sinosoft
 * @Create: 2018-05-08 14:29
 * @Author: 贾治平
 * @Version: 1.0
 **/
public class OrgEntity implements Serializable{
    private int orgid;
    private String orgcode;
    private String orgname;
    private String orgleader;

    //映射关系  一个部门对应多个员工
    private Set<EmpEntity> emps = new HashSet<EmpEntity>(0);

    public Set<EmpEntity> getEmps() {
        return emps;
    }

    public void setEmps(Set<EmpEntity> emps) {
        this.emps = emps;
    }

    public int getOrgid() {
        return orgid;
    }

    public void setOrgid(int orgid) {
        this.orgid = orgid;
    }

    public String getOrgcode() {
        return orgcode;
    }

    public void setOrgcode(String orgcode) {
        this.orgcode = orgcode;
    }

    public String getOrgname() {
        return orgname;
    }

    public void setOrgname(String orgname) {
        this.orgname = orgname;
    }

    public String getOrgleader() {
        return orgleader;
    }

    public void setOrgleader(String orgleader) {
        this.orgleader = orgleader;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OrgEntity orgEntity = (OrgEntity) o;

        if (orgid != orgEntity.orgid) return false;
        if (orgcode != null ? !orgcode.equals(orgEntity.orgcode) : orgEntity.orgcode != null) return false;
        if (orgname != null ? !orgname.equals(orgEntity.orgname) : orgEntity.orgname != null) return false;
        if (orgleader != null ? !orgleader.equals(orgEntity.orgleader) : orgEntity.orgleader != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = orgid;
        result = 31 * result + (orgcode != null ? orgcode.hashCode() : 0);
        result = 31 * result + (orgname != null ? orgname.hashCode() : 0);
        result = 31 * result + (orgleader != null ? orgleader.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "OrgEntity{" +
                "orgid=" + orgid +
                ", orgcode='" + orgcode + '\'' +
                ", orgname='" + orgname + '\'' +
                ", orgleader='" + orgleader + '\'' +
                ", emps=" + emps +
                '}';
    }
}
