package org.example.Collections.ListTask;

import java.util.LinkedList;

public class StudentManager {

       public static LinkedList<Student> studentList = new LinkedList<>();

       public static LinkedList<Student> addStudent(Student student) {
           studentList.add(student);
           return studentList;
       }

       public static void printAllStudents() {
           if (studentList.isEmpty()) {
               System.out.println("The students list is empty.");
           } else {
               System.out.println("All students: ");
               for (Student s : studentList) {
                   System.out.println(s);
               }
           }
       }

       public static LinkedList<Student> removeStudent() {
           for (Student student : studentList) {
               if(student.getRating() < 3) {
                   studentList.remove(student);
               }
           }
           return studentList;
       }


}
