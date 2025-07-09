package Automation_tester13x_Task;

public class task4julyprogram2 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.display();
    }

    }


    class Animal12
    {
        void sound() {
            System.out.println("Animal makes a sound");
        }

    }

    class Dog  extends Animal12
    {
        void sound() {
            System.out.println("Dog barks");
        }

        void display() {
            sound();          // Calls child class method
            super.sound();    // Calls parent class method using 'super'
        }
    }

