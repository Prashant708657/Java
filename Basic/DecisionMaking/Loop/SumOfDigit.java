package DecisionMaking.Loop;
import java.util.Scanner;
public class SumOfDigit {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
       /* int n = sc.nextInt();
        int r =0;
        int sum=0;
        while(n>0)
        {
          r = n%10;
          sum = sum+r;
          n = n/10;
        }
        System.out.println(sum);

       */

       // Find Number Of Digit

       int n = sc.nextInt();
       int NoOfDigit = (int) Math.log10(n)+1;
       System.out.println(NoOfDigit);
      }

    
}
