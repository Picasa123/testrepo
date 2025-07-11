package Automation_tester13x_Task.Task7_Abstract_interface;
/*
Abstract vs Concrete Method
🔶 Objective:
Understand how abstract classes can contain both abstract methods (which must be implemented in the subclass)
 and concrete methods (which can be used as-is).
🔶 Steps to Create:
Create an abstract class Parent.
Define one abstract method void show().
Define one concrete method void display() that prints a message.
Create a class Child that extends Parent.
Implement the show() method inside Child.
In the main() method, create an object of Child and call both display() and show().
🔶Expected Output:
Concrete method in abstract class
Abstract method implemented*/
abstract class Parent{
   abstract void show();
   void display()
   {
       System.out.println(" display sucessfull");
   }

} class child extends Parent{
    @Override
     void show(){
        System.out.println(" abstract method from abstract class ");
    }
}
public class task74program {
    public static void main(String[] args) {
        child c1=new child();
        c1.show();
        c1.display();
    }
}
