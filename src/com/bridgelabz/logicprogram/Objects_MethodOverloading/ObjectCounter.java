package com.bridgelabz.logicprogram.Objects_MethodOverloading;

public class ObjectCounter {

    // Static variable to keep track of the number of objects created
    private static int objectCount = 0;

    // Constructor - This is invoked every time an object is created
    public ObjectCounter() {
        // Increment the counter each time the constructor is called
        objectCount++;
    }

    // Static method to get the current count of objects created
    public static int getObjectCount() {
        return objectCount;
    }

    public static void main(String[] args) {
        // Create objects of ObjectCounter class
        ObjectCounter obj1 = new ObjectCounter();
        ObjectCounter obj2 = new ObjectCounter();
        ObjectCounter obj3 = new ObjectCounter();

        // Display the total number of objects created
        System.out.println("Number of objects created: " + ObjectCounter.getObjectCount());
    }
}

/*
Explanation:
Static Variable objectCount:

A static variable objectCount is used to keep track of how many objects of the class have been created.
Since it's static, its value is shared across all instances of the class.
Constructor ObjectCounter():

The constructor is called every time a new object is created.
Each time the constructor is invoked, it increments the objectCount by 1.
Static Method getObjectCount():

This static method is used to return the current count of the objects created.
main() Method:

Inside the main() method, three objects (obj1, obj2, obj3) are created.
After creating the objects, the getObjectCount() method is called to print the total number of objects created.
 */