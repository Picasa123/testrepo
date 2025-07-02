package Ex16_Array;

public class Lab151_reffrence_equalto
{
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,5};// == refer to refrence and the equalTo refer to the value
        int n[]={1,2,3,4,5,5};
        int[] arrp=  a;
        System.out.println(a);
        System.out.println(n);
        System.out.println (a== arrp);// refrence are point out the same thats its true
        System.out.println(a.equals(n));// in array the eqails to method refer to object(references ) thats why its show false becaus object ar diffrent
          String s1="aditya";
          String s2="aditya";
        System.out.println(s1.equals(s2));// becasue string ios class--content
    }
}

