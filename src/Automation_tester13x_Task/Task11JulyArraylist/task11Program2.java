package Automation_tester13x_Task.Task11JulyArraylist;

import java.util.ArrayList;

public class task11Program2 {
    /*2. Remove an Element from ArrayList

📘 Description:
Create an ArrayList with these names: Amit, Neha, Suresh.
Remove the name Neha and display the updated list.

✅ Expected Output:

Names after removal:

[Amit, Suresh]*/
    public static void main(String[] args) {
        ArrayList Studlist = new ArrayList();
        Studlist.add("Amit");
        Studlist.add("Neha");
        Studlist.add("Suresh");
       // Studlist.add("Priya");

        System.out.println(Studlist);
        Studlist.remove(1);
        System.out.println(Studlist);
    }
}
