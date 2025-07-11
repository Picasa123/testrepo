package Automation_tester13x_Task.Task7_Abstract_interface;
/*
Interface with Default and Static Method

🔶 Objective:
Learn how to use default and static methods in interfaces (since Java 8).
🔶 Steps:
Create an interface Vehicle.
Add a default method start() that prints "Vehicle started".
Add a static method fuelType() that prints "Fuel type is Petrol"
Create a class Car that implements Vehicle.
In main(), create a Car object and call start().
Call Vehicle.fuelType() without creating an object.

🔶 Expected Output:
Vehicle started
Fuel type is Petrol*/
interface Vehicle {
    default void start() {
        System.out.println(" Vehicle started");
    }

    default void fuel1() {
        System.out.println(" fuel type petrol");
    }

    static void fuelType(){
        System.out.println(" aditya");
    }

    class car1 implements Vehicle {


    }

    public class Task76programinterface {
        public static void main(String[] args) {
            car1 c1 = new car1();
            c1.start();
            c1.fuel1();
            Vehicle.fuelType();// directly class with method name

        }

    }
}