package Automation_tester13x_Task;

public class task36july
{
    public static void main(String[] args)
    {
        Animals12 a1= new Animals12();
a1.sound();
       dog d1=new dog();
       d1.sound();
       d1.eat();

        cats1 c1=new cats1();
        c1.sound();
        c1.eat();
        Cow c2=new Cow();
        c2.sound();
        Animals12 a2= new cats1();
        a2.sound();// dynamic dispatch


    }
}
class Animals12 {
    void sound( ) {
        System.out.println(" method Fom parent animal class");
    } void eat(){
        System.out.println(" animal eats vegetable and some eats flesh");
    }
}
class dog extends Animals12{
    @Override
   void sound(){

        System.out.println("bark");
    }
}
class cats1 extends Animals12{
    @Override
    void sound()
    {
        System.out.println("meow");
    }
}class Cow extends Animals12{
    @Override
  void sound(){

        System.out.println("moo");
    }

}
