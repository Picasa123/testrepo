package Automation_tester13x_Task;

public class task33poly {
    public static void main(String[] args) {
        Mathoperation m1=new Mathoperation();
       long mul= m1.Multiply(65,789);
        System.out.println(mul);
      long mul3=m1.Multiply(789,345,45);
        System.out.println(mul3);

    }

}
class Mathoperation {

    int Multiply(int a, int b) {
        return a * b;
    }

    int Multiply(int a, int b, int c) {
        return a * b * c;
    }
}