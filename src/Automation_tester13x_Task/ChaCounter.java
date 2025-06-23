package Automation_tester13x_Task;

import javax.swing.*;
import java.util.Scanner;

public class ChaCounter {
    public static void main(String[] args) {

// taking the input from the scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the string");
        String input = scanner.nextLine();
        // converting the any upper character to lower on
        input = input.toLowerCase();
        int vowels = 0, consonants = 0, digits = 0, spaces = 0, specialChars = 0;

        for (int i = 0; i <= input.length(); i++) {

            char ch = input.charAt(i);
            if (Character.isLetter(ch)) {
                // Check for vowels
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            } else if (Character.isDigit(ch)) {
                digits++;
            } else if (Character.isWhitespace(ch)) {
                spaces++;
            } else {
                specialChars++;
            }
        }

        // Output results
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Digits: " + digits);
        System.out.println("Spaces: " + spaces);
        System.out.println("Special Characters: " + specialChars);

        scanner.close();
    }
}

