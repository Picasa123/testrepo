package Automation_tester13x_Task;

public class task31poly {
    public static void main(String[] args) {
        calculator c1=new calculator();
      int me1=  c1.add( 4,7);
       double me2= c1.add(45.56,65.989);
        System.out.println(me1);
        System.out.println(me2);
    }
}
class calculator {

    int add(int a, int b) {

        return a + b;
    }

    double add(double a, double b) {

        return a + b;
    }
}