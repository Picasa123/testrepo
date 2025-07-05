package Automation_tester13x_Task;

public class task35July {
    public static void main(String[] args) {
        Maximum m1=new Maximum();
        m1.max(67,87);
        m1.max(89,5,67);
    }
}
class Maximum {

    int max(int a, int b) {

        int max = (a > b) ? a : b;
        return max;
    }

    int max(int a, int b, int c) {

        int max = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
        return max;
    }
}

