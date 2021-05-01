package Array;
import java.util.Scanner;
public class AverageArray {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();
        System.out.println("Enter the array : ");
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        /* this is Display the array
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }*/
        int avg =0;
        for(int i=0;i<n;i++)
        {
            avg += arr[i]; 
        }
        avg = avg/n;
        System.out.println("average is : "+avg);
    }
    
}
