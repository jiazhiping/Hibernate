package com.sinosoft.demo;

/**
 * @Title: Testhibernate
 * @Description: ${description}
 * @Copyright: Copyright (c) 2018
 * @Company: sinosoft
 * @Create: 2018-05-09 10:31
 * @Author: 贾治平
 * @Version: 1.0
 **/
public class StudentEntity {
    private int sid;
    private String sname;
    private String sex;
    private GradeEntity gradeByGid;

    public StudentEntity(String sname, String sex) {
        this.sname = sname;
        this.sex = sex;
    }

    public StudentEntity() {
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StudentEntity that = (StudentEntity) o;

        if (sid != that.sid) return false;
        if (sname != null ? !sname.equals(that.sname) : that.sname != null) return false;
        if (sex != null ? !sex.equals(that.sex) : that.sex != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = sid;
        result = 31 * result + (sname != null ? sname.hashCode() : 0);
        result = 31 * result + (sex != null ? sex.hashCode() : 0);
        return result;
    }

    public GradeEntity getGradeByGid() {
        return gradeByGid;
    }

    public void setGradeByGid(GradeEntity gradeByGid) {
        this.gradeByGid = gradeByGid;
    }
}
