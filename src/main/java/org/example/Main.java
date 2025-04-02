package org.example;

import org.example.IfElse.IfElseTasks;
import org.example.OOP.SubClassesOfEmployee.Developer;
import org.example.OOP.SubClassesOfEmployee.Manager;
import org.example.OverLoad.AreaCalculator;
import org.example.Overwrite.SubClassefOfVehicle.Airplane;
import org.example.Overwrite.SubClassefOfVehicle.Bicycle;
import org.example.Overwrite.SubClassefOfVehicle.Car;
import org.example.Overwrite.Vehicle;

public class Main {
    public static void main(String[] args) {
        //1
        //IfElseTasks ifElseTasks = new IfElseTasks();
        //ifElseTasks.ifElseTask1();
        //ifElseTasks.ifElseTask2();
        //ifElseTasks.ifElseTask3();

        //2
        //Car car = new Car();
        //Bicycle bicycle = new Bicycle();
        //Airplane airplane = new Airplane();

        //Vehicle[] vehicles = new Vehicle[3];
        //vehicles[0] = car;
        //vehicles[1] = bicycle;
        //vehicles[2] = airplane;

        //for (Vehicle vehicle : vehicles) {
        //    vehicle.move();
       // }

        //3
        //AreaCalculator.calculateArea(0.5, 2,4);

        //4

        Manager manager = new Manager("Sasha", 200, 300);
        manager.displayEmployeeInfo();

        Developer junDev = new Developer("Kolya", 300, "junior");
        junDev.displayEmployeeInfo();

        Developer midDev = new Developer("Vasya", 500, "middle");
        midDev.displayEmployeeInfo();

        Developer sinDev = new Developer("Andrey", 700, "senior");
        sinDev.displayEmployeeInfo();





    }
}

