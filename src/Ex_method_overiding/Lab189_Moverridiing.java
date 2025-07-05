package Ex_method_overiding;

public class Lab189_Moverridiing {
    public static void main(String[] args) {
        dog d1=new dog();
        d1.sound();
    }
}
class animal{


    void sound(){

        System.out.println("default sound");
    }
}class dog extends animal{// same method name from chils class nad parent class clalled method overiding
@Override
   void sound(){

       System.out.println(" bark");
    }
    // method overloading
    int sound(int a)
    {
        return a;
    } int sound(int a,int b)
    {
        return a+b;
    }
}