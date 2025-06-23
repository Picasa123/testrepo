package Automation_tester13x_Task;

import java.util.Scanner;
import java.lang.String;

public class Task23_4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the string");
        String it = scanner.nextLine();
        it = it.toLowerCase();

        int vowel = 0, space = 0, specialChar = 0, consonent = 0, digit = 0;
        for (int i = 0; i <= it.length(); i++) {
            char ch = it.charAt(i);
            if (Character.isLetter(ch)) {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowel++;

                } else {
                    consonent++;
                }
            } else if (Character.isDigit(ch)) {// is any any digit
                digit++;

            } else if (Character.isWhitespace(ch)) {// is there any space
                space++;
            } else {
                specialChar++;
            }

                System.out.println("vowel"+vowel);
                System.out.println(" cosonent are "+consonent);
                System.out.println("digit"+digit);
                System.out.println("whitespace"+space);
                System.out.println("specialchar"+specialChar);
                scanner.close();


        }

    }
}




