package Automation_tester13x_Task;

import java.util.Scanner;

public class Task_23_2 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the number");
        int num=scanner.nextInt();
        if(num%2==0)
        {
            System.out.println("number is even");
        } else  {
            System.out.println("number is odd");

        }
    }
}
