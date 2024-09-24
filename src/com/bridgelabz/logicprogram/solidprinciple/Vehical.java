package com.bridgelabz.logicprogram.solidprinciple;

public class Vehical {

        public void startEngine() {
            // start engine of the vehicle
        }
    }

    class Car extends Vehical {
        @Override
        public void startEngine() {
            // Start Engine
        }
    }

    class Bicycle extends Vehical {
        @Override
        public void startEngine(){
            throw new UnsupportedOperationException("Bicycle doesn't have engine");
        }
    }

