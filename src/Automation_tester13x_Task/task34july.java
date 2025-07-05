package Automation_tester13x_Task;

public class task34july {
    public static void main(String[] args) {
        Greet g1= new Greet();
        g1.greet("aditya ranjan pandey");
        g1.greet();
    }
}
class Greet {

   void greet()
    {
        System.out.println("hello");
    }

    String greet(String name)
    {
        System.out.println("hello" +name);
        return name;
    }
}


