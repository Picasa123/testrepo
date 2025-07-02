package Ex16_Array;

public class Pa_Declaration_of_array {
    //declaration of array
   /* add value into the array
    find tyhe size of array
    read the single value of an array
    read the multiple value from the array
sout
    */
    public static void main(String[] args) {

int b[]= new int[5];
b[0]= 23;
b[1]=45;
b[2]=65;
b[3]=75;
int a[] = {20, 40, 40, 60};
//find the lenght of an array
//        System.out.println("lenghth of an array--->+"+a.length);
//        System.out.println(b.length);
//        // read the single value of an array
//        System.out.println(a[0]);
//        System.out.println(a[3]);
//        System.out.println(a[1]);

// read multiple value from the array
   /*     for (int i =0;i<b.length;i++)
        {
            System.out.println(b[i]);
        }
        */
        for(int x: b)
        {
            System.out.println(x);
        }
    }

}
