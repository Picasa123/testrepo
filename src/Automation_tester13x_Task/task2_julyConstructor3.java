package Automation_tester13x_Task;

public class task2_julyConstructor3 {
    public static void main(String[] args) {
        SuperAdmin s1=new SuperAdmin();
        s1.shutdownSystem();
       s1.login();
       s1.accessAdminPanel();
    }

}

class User{

   void  login()
    {
        System.out.println(" login");
    }
}class AdminUser extends User{

  void   accessAdminPanel()
    {
        System.out.println(" acess admin panel");
    }

}class SuperAdmin extends AdminUser{

    void  shutdownSystem()
    {
        System.out.println(" shut down system");
    }
    }