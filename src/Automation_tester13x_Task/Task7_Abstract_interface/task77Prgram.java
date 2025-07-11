package Automation_tester13x_Task.Task7_Abstract_interface;
/*
 Interface Constants
🔶 Objective:

Demonstrate how to use constants (public static final variables) in interfaces.
🔶 Steps:
Create an interface SpeedLimit with a constant MAX_SPEED = 120.
In a class Car, access and print the constant
Do not modify the constant—it should behave like a final value.
🔶 Expected Output:
Max Speed is: 120*/
interface SpeedLimit{
    int Max_speed=120;

}class car2 implements SpeedLimit{
    void Speed_show(){
        System.out.println(" speed maxis "+Max_speed);
    }

}
public class task77Prgram {
    public static void main(String[] args) {
        car2 c1=new car2();
        int a=car2.Max_speed;
        System.out.println(a);
    }
}
