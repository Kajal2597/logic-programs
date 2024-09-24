package com.bridgelabz.logicprogram.solidprinciple;

public class Liskovs_principle {
    class Vehicle {
        public void startEngine() {
            // start engine of the vehicle
        }
    }

    class Car extends Vehicle {
        @Override
        public void startEngine() {
            // Start Engine
        }
    }

    class Bicycle extends Vehicle {
        @Override
        public void startEngine(){
            throw new UnsupportedOperationException("Bicycle doesn't have engine");
        }
    }
}
