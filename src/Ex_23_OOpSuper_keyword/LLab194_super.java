package Ex_23_OOpSuper_keyword;

public class LLab194_super {
    public static void main(String[] args) {
        Animal cat=new Animal();
        cat.sound();
        Animal cat1=new Animal(10);

    }
}

class God {


     God(){
         System.out.println(" god constructor");
     }
    God(int a){
      System.out.println("parameterrized constructor");

    } void  sound(){
        System.out.println(" god sound ");
    }
}

class Animal extends God{

    Animal() {
        super();
    }
    Animal(int a ){
        super(10);
    } void sound(){
        super.sound();
    }
}