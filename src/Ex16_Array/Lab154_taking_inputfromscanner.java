package Ex16_Array;

import java.util.Scanner;

public class Lab154_taking_inputfromscanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the size of an array");
        int size = scanner.nextInt();
        int a[] = new int[size];
        int mark[] = new int[size];

        for (int i = 0; i <mark.length; i++)
        {
            System.out.println("enter the mark");
            mark[i]= scanner.nextInt();

        }
for (int i=0;i<=mark.length;i++)
    System.out.println(mark[i]);
    }
}
