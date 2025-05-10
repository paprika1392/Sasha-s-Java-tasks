package org.example.Overwrite.SubClassefOfVehicle;

import org.example.Overwrite.Vehicle;

public class Airplane extends Vehicle {

    @Override public void move() {
        System.out.println("The airplane is moving");
    }
}


