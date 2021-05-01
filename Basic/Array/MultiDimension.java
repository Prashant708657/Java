package Array;
import java.util.Scanner;
public class MultiDimension {
   public static void main(String[] args)
   {
       Scanner sc = new Scanner(System.in);
       System.out.println("enter the value of m: ");
       int m = sc.nextInt();

       System.out.println("enter the value of n: ");
       int n = sc.nextInt();

       System.out.println("enter the array : ");
       String arr[][] = new String[m][n];

       for(int i =0;i<m;i++)
       { 
           for(int j=0;j<n;j++)
       {
           arr[i][j] = sc.nextLine();
        } 
        } 
   for(int i =0;i<m;i++)
   { 
    for(int j=0;j<n;j++)
    {
       System.out.println(arr[i][j]);
     }
    }
}
}