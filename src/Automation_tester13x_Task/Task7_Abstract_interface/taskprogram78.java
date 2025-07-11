package Automation_tester13x_Task.Task7_Abstract_interface;
/*
 🔶 Objective
Learn how interfaces support polymorphism – calling the same method on different implementations.
🔶 Steps:
Create an interface Playable with method play().
Create two classes: Guitar and Piano, both implement Playable.
Implement the play() method in both classes with different messages.
In main(), declare a reference of type Playable and assign it objects of Guitar and Piano one by one
Call play() on each.

🔶 Expected Output:

Playing Guitarinter

Playing Piano*/
interface Playable{
  void  play();
} class guitar implements Playable{

    @Override
    public void play() {
        System.out.println(" play with guitaar");
    }
}class Piano implements Playable{
    @Override
    public void play() {
        System.out.println(" play with Piano");
    }
}
public class taskprogram78 {
    public static void main(String[] args) {
        Playable p1=new guitar();
        p1.play();
        Playable p2= new Piano();
        p2.play();
    }
}
