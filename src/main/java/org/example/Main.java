package org.example;

import org.example.Collections.ListTask.Student;
import org.example.Collections.ListTask.StudentManager;
import org.example.Collections.MapTask.PhoneBook;
import org.example.ExceptionsTask.FileReaderUntil;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
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

//        Manager manager = new Manager("Sasha", 200, 300);
//        manager.displayEmployeeInfo();
//
//        Developer junDev = new Developer("Kolya", 300, "junior");
//        junDev.displayEmployeeInfo();
//
//        Developer midDev = new Developer("Vasya", 500, "middle");
//        midDev.displayEmployeeInfo();
//
//        Developer sinDev = new Developer("Andrey", 700, "senior");
//        sinDev.displayEmployeeInfo();

//        //5
//
//        SetTask setArray = new SetTask();
//        int[] result = setArray.enterNumbers();
//        System.out.println("Unique numbers is: " + setArray.findUniqueElements(result));

          // 6
//
//        Student student1 = new Student("Sasha", "Sashkovich", 4);
//        Student student2 = new Student("Pasha", "Pachkovich", 5);
//        Student student3 = new Student("Petya", "Petskovich", 3);
//        Student student4 = new Student("Ilya", "Ilyich", 10);
//        Student student5 = new Student("Max", "Maximovich", 2);
//
//        StudentManager.addStudent(student1);
//        StudentManager.addStudent(student2);
//        StudentManager.addStudent(student3);
//        StudentManager.addStudent(student4);
//        StudentManager.addStudent(student5);
//
//        StudentManager.printAllStudents();
//
//        StudentManager.removeStudent();
//
//        StudentManager.printAllStudents();

        // 7

//        PhoneBook phoneBook = new PhoneBook();
//
//        phoneBook.edEntry("Sasha", "5551244");
//        phoneBook.edEntry("Kate", "5557788");
//        phoneBook.edEntry("Petya", "1111111");
//
//        phoneBook.removeEntry("Kate");
//
//        phoneBook.updateEntry("Petya", "7771266");
//
//        phoneBook.printAllEntries();

        //8

        try {
            FileReaderUntil.readFile();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }


    }
}

