package org.example.OOP.SubClassesOfEmployee;

import org.example.OOP.Employee;

import java.util.Locale;

public class Developer extends Employee {
      public String level1;

      public Developer(String name, double baseSalary,String level1) {
            super(name, baseSalary);
            this.level1 = level1;
      }

      @Override
      public double calculateSalary() {
            double levelBonus = switch (level1.toLowerCase()) {
                  case "junior" -> 1000;
                  case "middle" -> 2000;
                  case "senior" -> 3000;
                  default -> 0;
            };
            return baseSalary + levelBonus;
      }
}
