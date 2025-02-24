package org.example.Overwrite.SubClassefOfVehicle;

import org.example.Overwrite.vehicle;

public class airplane extends vehicle {

    @Override public void move() {
        System.out.println("The airplane is moving");
    }
}


