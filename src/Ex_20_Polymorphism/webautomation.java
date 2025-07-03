package Ex_20_Polymorphism;

public class webautomation {
    public static void main(String[] args) {
        Browser b1= new Browser();
        b1.StartBrowser("chrome");


    }

}
class Browser {

    void StartBroswser() {
        System.out.println("default brwoser");
    }

    String StartBrowser(String Browser) {
        System.out.println("i want browser" + Browser);
        return Browser;
    }
}

