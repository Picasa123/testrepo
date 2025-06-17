package Ex_09_switch;

import java.util.Scanner;

public class Lab0085_switch_with_Break{
    public static void main(String[] args) {
        //take  input from the user  1 t0 7 and print the day
        // 1 --monday,2 tuesday---------7 sunday

            Scanner scanner = new Scanner(System.in);
            System.out.println("enter the number 1 to 7");
            int day = scanner.nextInt();
            switch (day) {
                case 1:
                    System.out.println("its monday");
                    break;

                case 2:
                    System.out.println(" its tuesday");
                    break;

                case 3:
                    System.out.println(" its wednesday");
                   break;
                case 4:
                    System.out.println(" its thursday");
                    break;
                case 5:
                    System.out.println(" its fri");
                    break;
                case 6:
                    System.out.println(" its saturda");
                    break;

                case 7:
                    System.out.println(" its sunday");
                    break;

                default:
                    System.out.println("not allowed");


            }
        }
    }



