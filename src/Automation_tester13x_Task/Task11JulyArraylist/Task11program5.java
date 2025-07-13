package Automation_tester13x_Task.Task11JulyArraylist;

import java.util.ArrayList;

/*📘 Description:
Create a LinkedList with fruits: Apple, Banana, Mango.
Insert Orange at index 1 and print the final list.

✅ Expected Output:

Fruits List: [Apple, Orange, Banana, Mango]*/
public class Task11program5 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<String>();
        list.add("Apple");
        list.add("banana");
        list.add("Mango");
        System.out.println(list);
        list.add(1,"Orange");
        System.out.println(list);

    }
}
