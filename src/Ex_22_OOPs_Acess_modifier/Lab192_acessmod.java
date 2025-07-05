package Ex_22_OOPs_Acess_modifier;

public class Lab192_acessmod {
    public static void main(String[] args) {

    }
}
class father{

    private int gold=100;
    int car = 1;
    public int bhk=4;
}
class son extends father{
    void wecan_use(){

        System.out.println(car);
        System.out.println(bhk);
    }
}