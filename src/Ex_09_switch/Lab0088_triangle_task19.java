package Ex_09_switch;

import java.util.Scanner;

public class Lab0088_triangle_task19 {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.println("enter the the side of triangle ");
        int a= scanner.nextInt(), b= scanner.nextInt(),c= scanner.nextInt();

        if(a==b & b==c)
        {
            System.out.println("triangle is equilateral");
        } else if (a==b||b==c||c==a)
        {
            System.out.println("your traiangle is i solels triangle");

        }
        else
        {
            System.out.println("your triangle is scalene triangle");
        }
    }

}
