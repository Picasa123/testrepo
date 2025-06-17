package Ex_09_switch;

public class Lab092_Switch_duplicatecase {
    public static void main(String[] args) {

        int a = 10;
        switch (a) {
            case 10:

                System.out.println("TEn");
                break;
           // case 10:duplicate is not duplicate
                //System.out.println("ad");
            default:
                System.out.println(" jai sri ram");// output unreachable statement

        }
    }
}



