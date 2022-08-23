package com.example.eljstl;

import java.util.List;
import java.util.Map;

/**
 * @author cc
 * @date 2022年08月23日 12:22
 */
public class person {
    private String name;
    private String[] phones;
    private List<String> cities;
    private Map<String,Object> map;

    public person() {
    }

    public person(String name, String[] phones, List<String> cities, Map<String, Object> map) {
        this.name = name;
        this.phones = phones;
        this.cities = cities;
        this.map = map;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getPhones() {
        return phones;
    }

    public void setPhones(String[] phones) {
        this.phones = phones;
    }

    public List<String> getCities() {
        return cities;
    }

    public void setCities(List<String> cities) {
        this.cities = cities;
    }

    public Map<String, Object> getMap() {
        return map;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }
}
