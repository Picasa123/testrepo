package Ex_18_oops_constructor;

public class Lab178_ConstructorOverload {
    public static void main(String[] args) {
        Person1 p1=new Person1("aditya",92344,"lig");
        Person1 p2=new Person1("aditya",456);
        Person1 p3=new Person1("adity123");

        p1.eat();
        p2.eat();
        p3.eat();

    }

}
class Person1{
    String name;
    long phone;
    String address;


    Person1(String Name_user,long phone_user,String address_user){

        this.name=Name_user;
        this.address=address_user;
        this.phone= phone_user;
    }
    Person1(String Name_user,long phone_user) {

        this.name = Name_user;
        this.phone = phone_user;
    }
    Person1(String Name_user) {

        this.name = Name_user;
    }

void eat (){

    System.out.println(" is eating");
}
}