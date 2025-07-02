package Ex16_Array;

import java.util.Arrays;

public class Lab150_array_read {
    public static void main(String[] args) {
        int mark[] = {77, 86, 100, 28, 67, 54};

        boolean[] is_male_data = new boolean[2];
        is_male_data[0] = true;
        is_male_data[1] = false;

        for (int i = 0; i < mark.length; i++) {

           // System.out.println(mark[i]);
        }
        Arrays.sort(mark);
        for (int i = 0; i < mark.length; i++)
            System.out.println(mark[i]);
    }
}