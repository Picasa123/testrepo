package Automation_tester13x_Task;

public class task4july_program5 {
    public static void main(String[] args)
    {
        Student s = new Student();
        s.showDetails();

        TestDefault td = new TestDefault();
        td.showDetails();
    }
}

class Student
{
    void showDetails()
    {
        System.out.println("Student details");
    }
}

class TestDefault extends Student
{
    void showDetails()
    {
        super.showDetails();
        System.out.println("Test details");
    }
}
