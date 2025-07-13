package Automation_tester13x_Task.Task11JulyArraylist;
/*Create an ArrayList of student names. Add the following 5 students:
Dipak, Ravi, Sneha, Priya, Anjali.
Then display all names using a loop.
✅ Expected Output:
Student List:

Dipak

Ravi

Sneha

Priya

Anjali*/
import java.util.ArrayList;
import java.util.Iterator;

public class Task11Program1 {
    public static void main(String[] args) {
        ArrayList Studlist = new ArrayList();
        Studlist.add("deeapk");
        Studlist.add("Ravi");
        Studlist.add("Sneha");
        Studlist.add("Priya");
        Studlist.add("ekta");
        System.out.println(Studlist.size());

        for (int i = 1; i <= Studlist.size(); i++) {
            System.out.println(Studlist.get(i));

        }
        System.out.println("--------");

        Iterator iterator = Studlist.iterator();
        while (iterator.hasNext()) {

            System.out.println(iterator.next());
        }
    }
}