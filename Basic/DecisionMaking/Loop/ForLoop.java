package DecisionMaking.Loop;
import java.util.Scanner;
public class ForLoop {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        // HEllo World Print
       /* for(int i=1;i<=100;i++)
        {
            System.out.println("Hello World");
        }
        */

        //Factorial Of Number
       /* int n = sc.nextInt();
        int fact =1;
        for(int i = n;i>=1;i--)
        {
             fact = fact*i;
        } 
        System.out.println("Factorial Number is : "+ fact);
        */

      // Series Print 1+1/2+1/3+......+1/n

      /* float n = sc.nextFloat();
       float Series_Sum = 0;
       for(float i=1;i<=n;i++)
       {
            Series_Sum += 1/i;
                
       }
       System.out.println(Series_Sum);

       */


      // Series Print 1-1/2+1/3-1/4+1/5-....1/n
       float n = sc.nextFloat();
       float Series_sum =0;
       for(float i=1;i<=n;i++)
       {
           if(i%2==0)
           {
               Series_sum -= 1/i;
               System.out.println(Series_sum);
           }
           else{
            Series_sum += 1/i;
            System.out.println(Series_sum);
           }
           System.out.println(Series_sum);
           


       }
    
    }

    
    
}
