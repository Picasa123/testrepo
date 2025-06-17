package Ex_09_switch;

import java.util.Scanner;

public class lab084_switch {

    //take  input from the user  1 t0 7 and print the day
    // 1 --monday,2 tuesday---------7 sunday
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number 1 to 7");
        int day = scanner.nextInt();
        switch (day) {
            case 1:
                System.out.println("its monday");


            case 2:
                System.out.println(" its tuesday");

            case 3:
                System.out.println(" its wednesday");

            case 4:
                System.out.println(" its thursday");

            case 5:
                System.out.println(" its fri");

            case 6:
                System.out.println(" its saturda");

            case 7:
                System.out.println(" its sunday");

            default:
                System.out.println("not allowed");


        }
    }
}