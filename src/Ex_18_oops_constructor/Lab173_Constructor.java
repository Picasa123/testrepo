package Ex_18_oops_constructor;

public class Lab173_Constructor {
    public static void main(String[] args) {
        baby b1= new baby();


    }
}
class baby{// // Attribute | Instance Variable |  Member variables, data members

    String name;
    int age ;
    String year;



    baby()// // Fetch data from the MySQL database...
    // Read from CSV File , XLSX(why we need the the constructor)
    // Open a file and read the data. (json, testdata.xlsx, txt file)
    {
        System.out.println(" decfault constructor");
    }
    void sleep() // behaviour
    {
        System.out.println(" behaviour 1");
    }
    void eat()
    {
        System.out.println(" behaviour 2");
    }
    void  play()
    {
        System.out.println(" behaviour 3");
    }
}