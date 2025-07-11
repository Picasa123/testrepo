package Automation_tester13x_Task.Task7_Abstract_interface;
//1. Animal Sound - Abstract Method Implementation
//Description: Create an abstract class Animal with an abstract method makeSound(). Extend it in Dog and Cat.
//🔶 Expected Output:

//Dog barks
//Cat meows
abstract class Animal{
   abstract void make_sound();

} class Dog extends Animal{

    @Override
    void make_sound() {
        System.out.println("bark");
    }
}class Cat extends Animal{

    @Override
    void make_sound() {
        System.out.println("meow");
    }
}
public class Task7_Abstract {
    public static void main(String[] args) {
        Dog d1=new Dog();
        d1.make_sound();
        Animal a1= new Cat();// dynamic dispatch
        a1.make_sound();
    }

}
