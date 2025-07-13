package Automation_tester13x_Task.Task11JulyArraylist;

import java.util.ArrayList;

/*Reverse a LinkedList

📘 Description:
Create a LinkedList and add the following numbers:
10, 20, 30, 40.
Reverse the list and print the output.

✅ Expected Output:
Reversed List:
[40, 30, 20, 10]*/
public class Task11Progra3 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println(list.reversed());
    }
}
