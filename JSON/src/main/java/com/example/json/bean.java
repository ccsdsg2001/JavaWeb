package com.example.json;

/**
 * @author cc
 * @date 2022年08月28日 20:18
 */
public class bean {
    private String name;
    private Integer id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public bean() {
    }

    public bean(String name, Integer id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "bean{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
