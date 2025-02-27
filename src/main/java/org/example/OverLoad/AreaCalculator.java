package org.example.OverLoad;

public class AreaCalculator {

    public static double calculateArea(double radius) { //S = П * r2
        double s1 = Math.PI * Math.pow(radius, 2);
        System.out.println("Square of the circle = " + s1);
        return s1;
    }

    public static double calculateArea(double length, double width) { // S = length * width
       double s2 = length * width;
        System.out.println("Square of the rectangle with 2 enter parameters =  " + s2);
        return s2;
    }

    public static double calculateArea(double halfOfOne, double side, double height) { //A = 1/2 × b × h
        double s3 = 0;

        if (halfOfOne == 0.5) {
            s3 = halfOfOne * side * height;
            System.out.println("Square of the rectangle with 3 enter parameters =  " + s3);
            return s3;
        } else {
            System.out.println("The first parameter " + halfOfOne + " isn't equal 0.5. " +
                    "Pleas enter 0.5 like first parameter");
        }
        return s3;

    }
}