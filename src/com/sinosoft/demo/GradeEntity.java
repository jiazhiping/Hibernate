package com.sinosoft.demo;

import java.util.HashSet;
import java.util.Set;

/**
 * @Title: Testhibernate
 * @Description: ${description}
 * @Copyright: Copyright (c) 2018
 * @Company: sinosoft
 * @Create: 2018-05-09 10:31
 * @Author: 贾治平
 * @Version: 1.0
 **/
public class GradeEntity {
    private int gid;
    private String gname;
    private String gdesc;

    private Set<StudentEntity> students = new HashSet<>();

    public GradeEntity(String gname, String gdesc) {

        this.gname = gname;
        this.gdesc = gdesc;

    }

    public GradeEntity(int gid, String gname, String gdesc, Set<StudentEntity> students) {
        this.gid = gid;
        this.gname = gname;
        this.gdesc = gdesc;
        this.students = students;
    }

    public GradeEntity() {
    }

    public Set<StudentEntity> getStudents() {
        return students;
    }

    public void setStudents(Set<StudentEntity> students) {
        this.students = students;
    }

    public int getGid() {
        return gid;
    }

    public void setGid(int gid) {
        this.gid = gid;
    }

    public String getGname() {
        return gname;
    }

    public void setGname(String gname) {
        this.gname = gname;
    }

    public String getGdesc() {
        return gdesc;
    }

    public void setGdesc(String gdesc) {
        this.gdesc = gdesc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GradeEntity that = (GradeEntity) o;

        if (gid != that.gid) return false;
        if (gname != null ? !gname.equals(that.gname) : that.gname != null) return false;
        if (gdesc != null ? !gdesc.equals(that.gdesc) : that.gdesc != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = gid;
        result = 31 * result + (gname != null ? gname.hashCode() : 0);
        result = 31 * result + (gdesc != null ? gdesc.hashCode() : 0);
        return result;
    }
}
