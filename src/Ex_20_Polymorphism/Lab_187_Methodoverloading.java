package Ex_20_Polymorphism;

public class Lab_187_Methodoverloading {
    public static void main(String[] args) {
        mathoperation d1=new mathoperation();
        d1.add(5,56,7);
        d1.add(45,56);
        d1.add(34.766,56.6556);
        System.out.println(d1.add(5,56,7));
        System.out.println(d1.add(45,56));
        System.out.println(d1.add(34.766,56.6556));
        System.out.println(" / In the same class, When you have a method wit same\n" +
                "    // Same name methods but different arguments and different return type.");
    }

}

class mathoperation{
    // In the same class, When you have a method wit same
    // Same name methods but different arguments and different return type.
    int add (int a,int b)
    {
       return a+b;
    }
    int add (int d,int t,int c)
    {
        return d+t+c;
    }

     double add(double a,double b)
    {
        return a+b;
    }
}
