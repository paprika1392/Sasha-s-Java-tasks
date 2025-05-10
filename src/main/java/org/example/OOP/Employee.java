package org.example.OOP;

public class Employee {
    public String name;
    public double baseSalary;

    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public double calculateSalary() {
        return baseSalary;
    }

    public void displayEmployeeInfo() {
        System.out.println("Employee: " + name + " , Salary: " + calculateSalary());
    }
}