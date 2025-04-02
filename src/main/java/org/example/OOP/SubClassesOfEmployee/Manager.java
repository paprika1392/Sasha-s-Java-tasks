package org.example.OOP.SubClassesOfEmployee;

import org.example.OOP.Employee;

public class Manager extends Employee {
    public double bonus;

    @Override public double calculateSalary() {
        return baseSalary + bonus;
    }
}
