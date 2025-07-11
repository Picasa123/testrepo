package Automation_tester13x_Task.Task7_Abstract_interface;
/* Abstract Class with Constructor


Description: Show that abstract class can have constructor. Print message from constructor and method.

🔶Expected Output:

Abstract class constructor called

Method from abstract class*/
abstract class car{
         abstract  void car();
         abstract void car_info();
    abstract  void  car(int a);
} class company extends car{

    @Override
    void car() {
        System.out.println(" Constructor from abtract class car");
    }

    @Override
    void car_info() {
        System.out.println(" method from the class ");
    }

    @Override
    void   car(int a) {

        System.out.println( "pc");
    }
}
public class Task73Program {
    public static void main(String[] args) {
        company c1= new company();
        c1.car();
        c1.car(7);
        c1.car_info();
    }
}
