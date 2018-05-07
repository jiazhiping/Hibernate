package com.sinosoft.demo;

/**
 * @Title: Testhibernate
 * @Description: ${description}
 * @Copyright: Copyright (c) 2018
 * @Company: sinosoft
 * @Create: 2018-05-04 16:43
 * @Author: 贾治平
 * @Version: 1.0
 **/
public class TabEntity {
    private int id;
    private String name;

    public TabEntity(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public TabEntity() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TabEntity tabEntity = (TabEntity) o;

        if (id != tabEntity.id) return false;
        if (name != null ? !name.equals(tabEntity.name) : tabEntity.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
