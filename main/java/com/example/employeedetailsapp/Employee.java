package com.example.employeedetailsapp;

public class Employee {

    String id, name, position, salary;

    public Employee() {}

    public Employee(String id, String name, String position, String salary) {
        this.id = id;
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public String getPosition() { return position; }
    public String getSalary() { return salary; }
}
