package Automation_tester13x_Task;

public class Task_2july {
    // Create a base class Animal with a method makeSound().
    // Then create a derived class Cat that has a method meow().
    // In the main method, call both methods using the Cat object.
    public static void main(String[] args) {

        cat c1= new cat();
        c1.meow();
        c1.make_sound();

    }
}
class Animal{

   void make_sound()
    {
        System.out.println(" animal class which has method");
    }
} class cat extends Animal {

    void meow()
    {
        System.out.println(" meow");
    }
}
