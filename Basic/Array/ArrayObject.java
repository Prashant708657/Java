package Array;
import java.lang.*;
import java.util.Arrays;
// if array of array then Arrays.equal function not Work then we use:

public class ArrayObject {
    public static void main(String[] args)
    {
        int arr[]= {1,2,3};
        int arr1[] = {1,2,3};
        Object in1[] = {arr};
        Object in2[] = {arr1};
         
    if(Arrays.deepEquals(in1,in2))
    {
       System.out.println("Same");
    }
    else{
        System.out.println("Not Same");
    }

    }

    
}
