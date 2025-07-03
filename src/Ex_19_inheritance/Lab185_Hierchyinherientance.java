package Ex_19_inheritance;

public class Lab185_Hierchyinherientance {
    public static void main(String[] args) {
        Father12 f1 = new Father12();
        Ruhani r1 = new Ruhani();

        r1.home();
        f1.home();

        Pramod p1 = new Pramod();
        p1.home();

        Lucky l1 = new Lucky();
        l1.l2();
        l1.home();

    }
}

class Father12{
    void home(){
        System.out.println("3BHK");
    }
}

class Pramod extends Father12{
    void h2(){
        System.out.println("h2 - Pramod");
    }
}

class Lucky extends Father12{

    void l2(){
        System.out.println("Aditay");
    }
}

class Ruhani extends Father12{
    void r1(){
        System.out.println("ruhani");
    }
}


