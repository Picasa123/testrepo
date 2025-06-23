package Automation_tester13x_Task;

import java.util.Scanner;

//program if a person is eligible for vote or not
public class Task_23_5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter your age");
        int age=scanner.nextInt();
       if(age>=18)
           System.out.println("you can vote");
       else
           System.out.println("you cannot vote");

       }
    }

