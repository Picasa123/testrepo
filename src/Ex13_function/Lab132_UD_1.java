package Ex13_function;

public class Lab132_UD_1 {
    public static void main(String[] args) {
        wp_wr();
        String msg = Greet_Hello_without_p_with_Return();
        System.out.println(msg);
        withparameter_without_return("aditya", 34, 2400000);
        withparameter_without_return("atharav", 6, 950000000);
        int sum = WithPara_with_Return(65, 76);
        int sum2 = WithPara_with_Return(54, 56, 66, 68);
        System.out.println(sum);
        System.out.println(sum2);
        System.out.println(" Type 4 ----- with parametr with return");

    }

    static void wp_wr() // without parameter and without return type
    {
        System.out.println("type 1---wthout parameter without return");
        System.out.println(" how are you");
    }

    static String Greet_Hello_without_p_with_Return() {// without parameter with return
        System.out.println(" type 2 without parameter with return type ");
        System.out.println("HI");
        return "hi are you";
    }

    static void withparameter_without_return(String name, int age, float salary) {
        System.out.println(" Type 3----- with parameter without return ");// with parameter without return
        System.out.println("enter the name " + age + "\nenter the salary__>" + salary + "\n enter the age" + age);


    }

    static int WithPara_with_Return(int a, int b) {
        return a + b;
    }

    static int WithPara_with_Return(int a, int b, int c, int d) {
        return a + b + c + d;

    }
}