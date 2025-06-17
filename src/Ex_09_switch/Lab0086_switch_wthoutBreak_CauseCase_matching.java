package Ex_09_switch;

import java.util.Scanner;

public class Lab0086_switch_wthoutBreak_CauseCase_matching {
    public static void main(String[] args) {
        //take  input from the user  1 t0 7 and print the day
        // 1 --monday,2 tuesday---------7 sunday

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

            default:
                System.out.println("not allowed");


        }
    }
}
