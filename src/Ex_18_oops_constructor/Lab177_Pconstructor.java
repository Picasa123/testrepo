package Ex_18_oops_constructor;

public class Lab177_Pconstructor {
    public static void main(String[] args) {
        BabyA b1=new BabyA();
        BabyA b2= new BabyA("atharav","1969","1501",01,01);
        System.out.println(b1.Aadharnumber);
        System.out.println(b1.name);
        System.out.println(b1.month);
        System.out.println(b1.year);
        System.out.println(b2.year);
        System.out.println(b2.name);
}
} class BabyA{
    String name;
    String year;
    String Aadharnumber;
    int month;
    int day;


    BabyA()
    {
        name="aditya";
        year ="1993";
        Aadharnumber="74675";
        month= 11;
        day= 01;
    }


    BabyA(String name_user,String year_user,String Aadharnumber_user,int month_user,int day_user)
    {
        this.Aadharnumber=Aadharnumber_user;
        this.name=name_user;
        this.year=year_user;
        this.month=month_user;
        this.day=day_user;

    }

}