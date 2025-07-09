package Task4july12;
/*Program 1: Access parent class constructor using super()
Program 2: Access parent class method using super
Program 3: Access parent class variable using super
Program 4: Create a Program to Access the private access modifier
Program 5: default (no modifier) access - same package only

📝 Instructions:
Create a class Student with a method showDetails() without any access modifier (default).

In the same file or same package, create a class TestDefault.

In main(), create an object of Student and call the showDetails() method */
public class Task4julyaccess {
    public static void main(String[] args) {
        Test_default t1=new Test_default(10);// calling parametriged constructor

        t1.show_details();

    }
}
class student{
int gold =234;

    public student() {
        System.out.println(" parent class default constructor DC");
    }
    public student(int a) {
        System.out.println(" parameterized constructor  parent PC " + a);

    }

    void show_details(){
        System.out.println(" parent method");
    }
}class Test_default extends student{

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    private int gold=100;
    public Test_default() {
        super();
        System.out.println(" child default constructor");
    }
    public Test_default(int b) {

       super(10);

    }
    @Override void show_details(){
       
        System.out.println(super.gold);
        System.out.println(this.gold);
        System.out.println(" hi overide");
    }

}