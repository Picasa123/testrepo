package Automation_tester13x_Task;
//largest among three
/* A>B A>C A IS LARGEST
B>A AND B>C B IS LARGEST
c>A AND C>B c IS LARGEST
 */

import java.util.Scanner;

public class Task23_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number 1 ");
        int n1 = scanner.nextInt();
        System.out.println("enter the number 2 ");
        int n2 = scanner.nextInt();
        System.out.println("enter the number 3 ");
        int n3 = scanner.nextInt();

        if (n1 > n2 && n1 > n3) {
            System.out.println("N1 is the largest number");
        } else if (n2 > n3 && n2 > n1) {
            System.out.println("N2 is the largest number");
        } else if (n3 > n2 && n3 > n1) {
            System.out.println(" N# is the largest number");
        } else
            System.out.println(" number are equal");

    }
}
