package Pattern;
import java.util.Scanner;
public class Pattern3 {
 public static void main(String[] args)
 {
     Scanner scan = new Scanner(System.in);
     System.out.print("Enter the value of n : ");
     int n = scan.nextInt();
      
     // Increasing Pattern

      for(int i=1;i<=n;i++)
      {
          for(int j=i;j<=n;j++)
          {
              System.out.print(" ");
          }
          for(int j=1;j<=i;j++)
          {
              System.out.print("*");
          }
          System.out.println();
      }

      System.out.println();
      // Decreasing Pattern
      for(int i=1;i<=n;i++)
      {
          for(int j=1;j<=i;j++)
          {
              System.out.print(" ");
          }
          for(int j=i;j<=n;j++)
          {
              System.out.print("*");
          }
          System.out.println();
      }
       
      System.out.println();
      // Right Increasing Triangle
      for(int i=1;i<=n;i++)
      {
          for(int j=i;j<=n;j++)
          {
              System.out.print(" ");
          }
          for(int j=1;j<=i;j++)
          {
              System.out.print("*");
          }
          System.out.println();
      }

 }
  
}
