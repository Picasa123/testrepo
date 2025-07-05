package Automation_tester13x_Task;

public class Task32poly {
    public static void main(String[] args) {
        printer p1=new printer();
        p1.print_data(5);
        p1.print_data(4545);
        p1.print_data("aditya22");
        p1.print_data(76.89898);
    }

}
class printer{

    String print_data(String aditya)
    {
      return "aditya";
    }  int print_data(int a)
    {
        return a;
    }
    double print_data(double a)
    {
        return a;
    }
    long print_data(long c)
    {
        return c;
    }

}