package Ex_21_Encapsulation;

public class Lab_189_ICIC_Bank {
    //- Encapsulation is a fundamental concept in object-oriented programming (OOP).
    //- Bundling of data and methods that operate on that data within a single unit.
    //- Data members should be private in nature.
    //- Methods with getter and setter only, you can access the data members / attributes.
    public static void main(String[] args) {
ICIC aditya= new ICIC("adityaavi",100);
String name =aditya.getName();
        System.out.println(name);
long bal= aditya.getBal();
        System.out.println(bal);
aditya.setBal(200,true);
long newbal= aditya.getBal();
        System.out.println(newbal);
aditya.getBal();
    }
}
class ICIC{
    private String name;
   private long bal;

    public ICIC(String name, long bal) {
        this.name = name;
        this.bal = bal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getBal() {
        return bal;
    }

    public void setBal(long bal,Boolean isCashier) {
        if(isCashier) {
            this.bal = bal;
        } else
            System.out.println("cant see the  balance");
    }
}