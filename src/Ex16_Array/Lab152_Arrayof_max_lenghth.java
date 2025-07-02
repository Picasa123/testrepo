package Ex16_Array;

import java.util.Arrays;

public class Lab152_Arrayof_max_lenghth {
    public static void main(String[] args) {
        int a[] = {54, 56, 98, 77, 56, 34, 24, 78};
        int maxVaue = give_me_maxValue(a);
        System.out.println(maxVaue);
/*
           // System.out.println(a[i]);
            Arrays.sort(a);
            System.out.println(a[a.length-1])

 */
    }

    static int give_me_maxValue(int a[])
    {
        int max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];

            }

        }
        return max;
    }

}