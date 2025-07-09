package Task4july12;

public class task4julyprogram6 {

    public static void main(String[] args)
    {
        Dog_2 d2 = new Dog_2();
        d2.doEat();

    }
}

class Animal_2
{
    protected void eat()
    {
        System.out.println("Animal is eating");
    }
}

class Dog_2 extends Animal_2
{
    void doEat()
    {
        super.eat();
    }
}
