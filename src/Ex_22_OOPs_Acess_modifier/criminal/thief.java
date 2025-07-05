package Ex_22_OOPs_Acess_modifier.criminal;

import Ex_22_OOPs_Acess_modifier.cob.Cob;

public class thief {
    public static void main(String[] args) {
      Cob thief=new Cob(100);
        thief.gun=100;
       // thief.CaniShoot();// default always act as an private if remove the public from class cob ,method public void van i shhot
    }
}
