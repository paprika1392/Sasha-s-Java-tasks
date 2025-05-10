package org.example.Overwrite.SubClassefOfVehicle;

import org.example.Overwrite.Vehicle;

public class Car extends Vehicle {

    @Override public void move() {
        System.out.println("The car is moving");
    }
}
