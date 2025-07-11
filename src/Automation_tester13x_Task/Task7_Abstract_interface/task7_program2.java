package Automation_tester13x_Task.Task7_Abstract_interface;
/*    /*Bank Interest Calculation

Description: Abstract class Bank with abstract method getInterestRate(). Classes SBI and HDFC implement it.

🔶 Expected Output:

SBI Interest Rate: 6.5%

HDFC Interest Rate: 7.0%*/
   abstract class Bank{
   abstract void  getInterestRate();
   void ShowDetail(){
       System.out.println(" interest rate");
   }
}class SBI extends Bank{
       @Override
   public void  getInterestRate(){
       System.out.println("SBI Interest Rate: 6.5% ");
    }
}class HDFC extends Bank{

    @Override
    void getInterestRate() {
        System.out.println("\n" + "HDFC Interest Rate: 7.0%");

    }
}

public class task7_program2 {
    public static void main(String[] args) {
        HDFC h1=new HDFC();
        h1.getInterestRate();
        SBI s1=new SBI();
        s1.getInterestRate();
    }
}
