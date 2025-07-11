package Automation_tester13x_Task.Task7_Abstract_interface;
/*
Multiple Inheritance Using Interfaces

🔶 Objective:
Show how a class in Java can implement multiple interfaces to achieve multiple inheritance.
🔶 Steps:
Create two interfaces: Printable and Showable.
Each interface should have a method: print() and show() respectively.
Create a class Document that implements both interface
Implement both methods in the Document class
In the main() method, create a Document object and call both methods.
🔶 Expected Output:

Printing Document

Showing Document*/
interface printable{
 void  print();
 void showe();

}interface Showable{
    void print();
    void showe();
}
class documents implements printable,Showable{

    @Override
    public void print() {
        System.out.println(" printig document");
    }
    @Override
    public void showe() {
        System.out.println(" showinng document");
    }
}
public class task75programinterface {
    public static void main(String[] args) {
        documents d1=new documents();
        d1.print();
        d1.showe();
    }
}
