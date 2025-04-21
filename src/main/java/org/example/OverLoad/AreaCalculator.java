package org.example.OverLoad;

public class AreaCalculator {

    public static double calculateArea(double radius) { //S = П * r2
        double square = Math.PI * Math.pow(radius, 2);
        System.out.println("Square of the circle = " + square);
        return square;
    }

    public static double calculateArea(double length, double width) { // S = length * width
       double square = length * width;
        System.out.println("Square of the rectangle with 2 enter parameters =  " + square);
        return square;
    }

    public static double calculateArea(double halfOfOne, double side, double height) { //A = 1/2 × b × h
        double square = 0;

        if (halfOfOne == 0.5) {
            square = halfOfOne * side * height;
            System.out.println("Square of the rectangle with 3 enter parameters =  " + square);
            return square;
        } else {
            System.out.println("The first parameter " + halfOfOne + " isn't equal 0.5. " +
                    "Pleas enter 0.5 like first parameter");
        }
        return square;

    }
}