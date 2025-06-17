package Ex_09_switch;

import java.util.Scanner;

public class Lab0087_Real_Switch_ExampleinAutomationtester {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("enter the browser name");
        String browser= scanner.next();
        switch (browser)
        {
            case "Chrome":
                System.out.println("enter the chrome browser");
                break;
            case "edge":
                System.out.println("edege browser");
            case "safari":
                System.out.println("enter the browser");
            default:
                System.out.println("this is not allowed");
        }


    }
}
