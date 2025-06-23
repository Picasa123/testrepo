package Automation_tester13x_Task;

import java.util.Scanner;

public class checkPalindrome_strickcheck {

    public static void main(String[] args) {
        // taking the input from the scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the string");
        String input = scanner.nextLine();
        String original = input.toLowerCase();
        String reversed = "";

        for (int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);
        }

        if (original.equals(reversed) )
        {
            System.out.println("string is palindrome");
        } else
            System.out.println("string is not palindrome");
        scanner.close();
    }

}
