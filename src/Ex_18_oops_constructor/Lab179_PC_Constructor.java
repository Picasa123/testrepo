package Ex_18_oops_constructor;

public class Lab179_PC_Constructor {
    public static void main(String[] args) {
        Person p1= new Person("shivam",9504,"lig 52");
        System.out.println(p1.address);
        System.out.println(p1.name);
    }
}

class Person{
    String name;
    long phone;
    String address;

    Person(String Name_user,long phone_user,String address_user)
    {
        this.name=Name_user;
        this.address=address_user;
        this.phone= phone_user;


    }


}