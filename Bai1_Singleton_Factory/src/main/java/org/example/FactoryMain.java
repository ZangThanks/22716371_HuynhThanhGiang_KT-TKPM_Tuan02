package org.example;

import org.example.factory.Logistics;
import org.example.factory.RoadLogistics;
import org.example.factory.SeaLogistics;

public class FactoryMain {
    public static void main(String[] args) {
        Logistics logistics;

        String type = "road";

        if (type.equals("road")) {
            logistics = new RoadLogistics();
        } else {
            logistics = new SeaLogistics();
        }

        logistics.planDelivery();
    }
}
