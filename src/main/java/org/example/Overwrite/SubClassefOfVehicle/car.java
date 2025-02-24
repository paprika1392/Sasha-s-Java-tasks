package org.example.Overwrite.SubClassefOfVehicle;

import org.example.Overwrite.vehicle;

public class car extends vehicle {

    @Override public void move() {
        System.out.println("The car is moving");
    }

}
