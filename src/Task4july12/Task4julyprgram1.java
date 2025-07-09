package Task4july12;

public class Task4julyprgram1 {
  //  Program 1: Access parent class constructor using super()

public static void main(String[] args)
{
    Car1 car = new Car1();

}
}

class Vehicle1
{
    Vehicle1()
    {
        System.out.println("Vehicale -> DC");
    }
}

class Car1 extends Vehicle1
{
    Car1()
    {
        super();
    }
}
