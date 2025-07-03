package Ex_18_oops_constructor;

public class Lab176_DC {
    public static void main(String[] args) {

        Car c1=new Car();
        c1.name="Tata";
        System.out.println(c1.model);
        System.out.println(c1.name);
        System.out.println(c1.year);

    }
}
class Car{

    String name;
    String model;
    int year;


    Car(){
        name ="Unknown mercedies ";
         model= "Claas C model";
         year=1993;


    }
}