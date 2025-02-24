package org.example.Overwrite.SubClassefOfVehicle;

import org.example.Overwrite.Vehicle;

public class Bicycle extends Vehicle {

    @Override public void move() {
        System.out.println("The bicycle is moving");
    }
}
