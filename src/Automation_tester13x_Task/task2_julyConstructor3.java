package Automation_tester13x_Task;

public class task2_julyConstructor3 {
    public static void main(String[] args) {
        SuperAdmin s1=new SuperAdmin();
        s1.shutdownSystem();
       s1.login();
       s1.accessAdminPanel();
    }
   // Create a class User with a method login().
   // Extend it with a class AdminUser that adds a method accessAdminPanel().
  //  Then create a SuperAdmin class that extends AdminUser and adds a method shutdownSystem().

   // Use an object of SuperAdmin to call all three methods.
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