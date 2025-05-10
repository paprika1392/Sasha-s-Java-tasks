package org.example.OOP.SubClassesOfEmployee;

import org.example.OOP.Employee;

public class Manager extends Employee {
    public double bonus;

    public Manager(String name, double baseSalary, double bonus) {
        super(name, baseSalary);
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return baseSalary + bonus;
    }
}
