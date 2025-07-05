package Ex_22_OOPs_Acess_modifier.cob;

 public class Cob {
 public   int gun;
    String idcard;

    public  Cob(int bullet) {
        this.gun = bullet;
    }// method and behaviour
    protected void CaniShoot()
    {
        System.out.println(" you can shoot");

    }
}

