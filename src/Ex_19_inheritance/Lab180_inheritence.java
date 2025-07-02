package Ex_19_inheritance;

public class Lab180_inheritence {
    public static void main(String[] args) {
        fatherr f1=new fatherr();
        System.out.println(f1.gold);
        f1.bhk56();

        son1 s1=new son1();
        System.out.println("acessing the  father gold" +s1.gold);
        s1.bhk56();
        s1.bhk57();
    }

}
class fatherr {

    int gold=1000;
    void bhk56()
    {
        System.out.println("father bhak56");
    }

}
class son1 extends fatherr{

    void bhk57()
    {
        System.out.println(" son has bhk3");
    }
}