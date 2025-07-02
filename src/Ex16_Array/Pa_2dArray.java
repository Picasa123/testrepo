package Ex16_Array;

public class Pa_2dArray {
    public static void main(String[] args) {

        int a[][] = new int[4][5];
       // a[][],[]a[],[][]a-----> //are coreect notation---
        a[0][0] = 100;
        a[0][1] = 200;
        a[0][2] = 600;
        a[1][1] = 700;
        a[3][1] = 100;


        System.out.println(a.length);

        }
    }
