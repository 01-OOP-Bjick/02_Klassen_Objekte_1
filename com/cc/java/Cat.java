package com.cc.java;

public class Cat {
    
    private String name;
    private String furColor;
    private int age;

    public Cat(String name, String furColor, int age) {
        this.name = name;
        this.furColor = furColor;
        this.age = age;
    }

    public String getName() {
    if (checkPermission()) {
        return name;
    } else {
        return "Sorry, NO permission!";
    }
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getFurColor() {
        return furColor;
    }
    public void setFurColor(String furColor) {
        if (checkPermission()){
        this.furColor = furColor;
        }
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    private boolean checkPermission() {
        return false;
    }
}