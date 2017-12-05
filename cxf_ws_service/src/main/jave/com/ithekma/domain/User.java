package com.ithekma.domain;

public class User {
    private Integer id;
    private String nage;
    private Integer age;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNage() {
        return nage;
    }

    public void setNage(String nage) {
        this.nage = nage;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", nage='" + nage + '\'' +
                ", age=" + age +
                '}';
    }
}
