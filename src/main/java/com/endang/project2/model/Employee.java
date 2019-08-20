package com.endang.project2.model;

public class Employee {
    private String name;
    private String position;
    private String office;
    private Integer age;

    public Employee() {
    }

    public Employee(String name, String position, String office, Integer age) {
        this.name = name;
        this.position = position;
        this.office = office;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
