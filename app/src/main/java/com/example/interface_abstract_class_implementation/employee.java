package com.example.interface_abstract_class_implementation;

public class employee implements employeinterface {
    private String name;
    private int age;
    private String designation;

    // Constructor
    public employee(String name, int age, String designation) {
        this.name = name;
        this.age = age;
        this.designation = designation;
    }

    // Getters and setters


    public String getName() {
        return name;
    }


    public int getAge() {
        return age;
    }

    @Override
    public String getdepartment() {
        return null;
    }

    @Override
    public void updatedepartment(String newdepartment) {

    }

    public String getDesignation() {
        return designation;
    }


    public void updateDesignation(String newDesignation) {
        this.designation = newDesignation;
    }
}
