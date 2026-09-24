// File: AbstractDemo.java

// Abstract class
abstract class Vehicle {
    // Abstract method (does not have a body)
    abstract void startEngine();

    // Concrete method
    void displayType() {
        System.out.println("This is a motorized vehicle.");
    }
}

// Subclass implementing the abstract method
class Car extends Vehicle {
    @Override
    void startEngine() {
        System.out.println("Car engine started with a push button.");
    }
}

public class AbstractDemo {
    public static void main(String[] args) {
        // Vehicle v = new Vehicle(); // Error: Cannot instantiate abstract class

        Vehicle myCar = new Car();
        myCar.displayType();
        myCar.startEngine();
    }
}