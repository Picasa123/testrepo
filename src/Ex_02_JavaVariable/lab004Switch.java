package Ex_02_JavaVariable;

public class lab004Switch {
    public static void main(String[] args) {
        int a=18;
        int b= 23;
         int c=  23 ;

         if(a==b & b==c)
        {
            System.out.println(" triangle is equilateral");
        }
        else if (a==b || b==c|| c==a)
        {
            System.out.println("traingle is isoceles triangle");
        }

        else
        {
            System.out.println("traingle is scalene traingle");
        }
    }
}
