package org.example.Collections.ListTask;

public class Student {

    private String name;
    private String lastName;
    private double rating;

    public Student(String name, String lastName, int rating){
        this.name = name;
        this.lastName = lastName;
        this.rating = rating;

    }

    public double getRating() {
        return rating;
    }

    public String getFullName() {
        return name + ", " + lastName;
    }

    @Override
    public String toString(){
        return getFullName() + ", rating: " + rating;
    }

}
