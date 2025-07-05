package Ex_method_overiding;

public class Lab190_metodoveriding {
    public static void main(String[] args) {
        chrome c1= new chrome();
        c1.Open_browser();
        firefox f1= new firefox();
        f1.Open_browser();
        commom_to_all ct=new commom_to_all();
        ct.Open_browser();

        // dynamic dispatch
        commom_to_all dp=new edge();
        dp.Open_browser();
    }

}
class commom_to_all{

   void Open_browser(){
       System.out.println("open with iE broseer");
    }
}
class chrome extends commom_to_all{
    @Override
    void Open_browser(){
        System.out.println("open with chrome broseer");
    }

}class firefox extends  commom_to_all{
    @Override
    void Open_browser(){
        System.out.println("open with firefox browser");
    }
}class edge extends commom_to_all{
    @Override
    void Open_browser(){
        System.out.println("open with edge browser");
    }
}
