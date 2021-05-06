package Array;

import java.util.Arrays;

public class ArrayToString {
    public static void main(String[] args)
    {
        int a[] = {1,2,3,4};
        boolean b[] = {true,false,true,false};
        char c[] =  {'a','b','c','d'};
        double d[] = {1.3,3.4,5.4};
       
        System.out.println("integer to String"+ Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(c));
        System.out.println(Arrays.toString(d)); 

    }
    
}
