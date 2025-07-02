package Ex_17_oops;

public class Lab167_oops_p2 {    /* - Constructor is a **special method** which is invoked automatically at the time of** object creation.**
                                                         - Person p = new Person();
-                                                           It is used to **initialize the data members** (attributes) of new objects generally.
                                                                      - Constructors have the **same name as class or structure. **
                                                                      - Constructors don’t have a return type. (Not even void)
                                                                      - Constructors are only called once, at **object creation.**
                                                                         */

    public static void main(String[] args) {

        Student s1= new Student();


    }
}
class Student {

    String name;
    Long mob_no;
    Student()   ///  default constructor
    {
        System.out.println(" default constructor");
    }
    void sleep()
    {
        System.out.println("hi");
    }

}
