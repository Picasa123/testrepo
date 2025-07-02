package Automation_tester13x_Task;

public class task2_July_Constructor {
    public static void main(String[] args) {
        Bike b1= new Bike();

    }

    //Create a class Vehicle with a constructor that prints "Vehicle is ready".
    //Create a class Bike that extends Vehicle and prints "Bike is ready" in its constructor.
    // Create an object of Bike in the main method and observe constructor call order.

}

class Vehicle{


    Vehicle()
    {
        System.out.println("  Vehicle is  ready -----1");
    }
}
class Bike extends Vehicle{

    Bike()
    {
        System.out.println(" Bike is ready=====2");
    }


}
