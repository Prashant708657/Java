package Array;
import java.util.Scanner;
public class BasicArray {
    public static void main(String[] args)
    {
       /* int marks[] = {1,2,3,45,5};
        // System.out.println(marks[0]);
        // OR 
        for(int i=0;i<marks.length;i++)
        {
            System.out.println(marks[i]);
        }
       */
    Scanner sc = new Scanner(System.in);
       /* int n = sc.nextInt();
       int marks[];
       marks = new int[5];
       for(int i=0;i<n;i++)
       {
        marks[i] = sc.nextInt();
       }
       for(int i =0;i<n;i++)
       {
           System.out.println(marks[i]);
       }
        */
     // for each loop

      int marks[] = {1,2,3,45,5};
        for(int num : marks)
        {
         System.out.println(num);
        }

       


        
    }
    
}
