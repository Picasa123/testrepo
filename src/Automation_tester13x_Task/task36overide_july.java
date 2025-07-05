package Automation_tester13x_Task;

public class task36overide_july {
    public static void main(String[] args) {
        Vehicle_start v1= new Vehicle_start();
        v1.start();
        bike b1=new bike();
        b1.start();
        car c1=new car();
        c1.start();
        Vehicle_start v11= new bike();
        v11.start();
    }
}
class Vehicle_start {
   void  start()
    {
        System.out.println(" training from the the car snd bike  ");
    }
}class bike extends Vehicle_start{
    @Override
    void  start()
    {
        System.out.println(" kick the start bike  ");
    }
}class car extends Vehicle_start{
    @Override
    void  start()
    {
        System.out.println(" Turn the key to start the car ");
    }
}