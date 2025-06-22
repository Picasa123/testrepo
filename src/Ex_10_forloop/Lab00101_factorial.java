package Ex_10_forloop;

import java.util.Scanner;

public class Lab00101_factorial {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the number");
        int number= scanner.nextInt();

        int factorial= 1;
        if(number <=0)
        {
            System.out.println(factorial);
        }else {
            for (int i = 1; i <= number; i++)
                factorial = factorial * i;
            System.out.println(factorial);
        }





    }
}
