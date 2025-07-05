package Ex_21_Encapsulation;

public class Lab_189_encapsulation {
    public static void main(String[] args) {
        VWOLogin VWOLogin= new VWOLogin("Admin","pas123");


        Good_VWOLogin Good_VWOLogin= new Good_VWOLogin("admin","pass232");
        String pass = Good_VWOLogin.getPassword();
        System.out.println(pass);
        Good_VWOLogin.setPassword("password",true);
       String p1= Good_VWOLogin.getPassword();
        System.out.println(p1);
    }
}
class VWOLogin{

   public  String username;// everey instance variable//Data variable//Attribute//fields//properties
   public String Password;

    public VWOLogin(String username, String password ) {// parameteriged constructor
        this.username = username;
       this. Password = password;

    }
}
class Good_VWOLogin {
    private String username;
    private String password;
    public Good_VWOLogin(String username_args,String password_user) {
        this.username=username_args;
        this.password=password_user;

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password, boolean isAdmin) {
        if(isAdmin) {
            this.password = password;
        } else
            System.out.println(" password cannot be change");
    }

}