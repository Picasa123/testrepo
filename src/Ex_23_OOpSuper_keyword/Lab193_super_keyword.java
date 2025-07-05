package Ex_23_OOpSuper_keyword;

public class Lab193_super_keyword {
    public static void main(String[] args) {
        car c1= new car();
        c1.display();

    }}
class Vehicle1{
    public int maxSpeed=180;
    Vehicle1(){
        System.out.println(" DC--default constructor from the parent class ");
    }
    Vehicle1(int a){
        System.out.println(" PC--Parameteriged constructor from the parent class ");
    } void message(){
        System.out.println(" type 1 method overloading Wp_Wr");
    }void message(int a) {
        System.out.println(" type 2 method overloading Wip_Wr");
    } int  message(String name){
        System.out.println(" type 4 WiP and Wreturn");
        return 0;
    }
    void display(){
        System.out.println(" hi override from parent");
    }

}class car extends Vehicle1{
    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    private int maxSpeed=280;
    car(){
        super();
    }car( int a){

super(10);
    }
    @Override
    void display(){
        System.out.println(" hi overide");
       // System.out.println(super.maxSpeed);
       // System.out.println(this.maxSpeed);
    }

}