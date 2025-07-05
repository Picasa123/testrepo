package Automation_tester13x_Task;

public class task37overidejuly {
   /* Description:
    Create a class Employee with method role() printing “General Employee”.
    Create child classes Manager, Clerk, Tester, each overriding role() to print their specific roles.
    Call role() on each object to show how overriding helShow employee roles with overridden methods
    ps in specialization.
*/
   public static void main(String[] args) {
       Employee e1= new Employee();
       e1.role();
       Manager m1=new Manager();
       m1.role();
       Clerk c1= new Clerk();
       c1.role();
       tester t1= new tester();
       t1.role();
   }

}class Employee{
    void role(){
        System.out.println("Gerneral manager");
    }
}class Manager extends Employee{
    @Override
    void role(){
        System.out.println(" Manager manage the grienvaces and the project");
    }
}class Clerk extends Employee{
    @Override
    void role(){
        System.out.println(" clerk amange the data entry and the clerk lavel work");
    }
}class tester extends Employee{
    @Override
    void role(){
        System.out.println("tester the finds out bugs ");
    }
}
