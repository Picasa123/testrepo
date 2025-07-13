package Automation_tester13x_Task.Task11JulyArraylist;

import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Iterator;

/*Description:
Create an ArrayList of cities: Mumbai, Delhi, Pune.
Check if Pune is present in the list. Print a message accordingly. (you can use If Condition to check the Pune city and you can take the City name from User)

✅ Expected Output:

Pune is in the list.*/
public class Task11Program4 {
    public static void main(String[] args) {

        ArrayList <String > list=new ArrayList<String>();
        list.add("Mumbai");
        list.add("Pune");
        list.add("delhi");
        System.out.println(list.size());
        for(int i=0;i< list.size();i++)
        {
            if(list.add("Pune")==true){
                System.out.println(" Pune is present in the list");
                break;
            }


        }
    }
}
