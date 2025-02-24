package org.example.Overwrite.SubClassefOfVehicle;

import org.example.Overwrite.vehicle;

public class bicycle extends vehicle {

    @Override public void move() {
        System.out.println("The bicycle is moving");
    }
}
