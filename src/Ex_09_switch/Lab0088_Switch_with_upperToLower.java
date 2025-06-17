package Ex_09_switch;

import java.util.Scanner;

public class Lab0088_Switch_with_upperToLower {
    public static void main(String[] args) {
    Scanner scanner= new Scanner(System.in);
        System.out.println("enter the browser name");
        String browser= scanner.next();
        browser= browser.toLowerCase();// it will convert alll upper case character to lower case
        switch (browser)
        {
            case "chrome":
                System.out.println("enter the chrome browser");
                break;
            case "edge":
                System.out.println("edege browser");
                break;
            case "safari":
                System.out.println("enter the browser");
                break;
            case "firefox":
                System.out.println("enter the browser");
                break;
            default:
                System.out.println("this is not allowed");
        }


    }
}

