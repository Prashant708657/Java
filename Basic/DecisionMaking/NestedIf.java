package DecisionMaking;

/* public class NestedIf {
    public static void main(String[] args)
    {
        int n = 10;
        if(n==10)
        {
            if(n>10)
            {
                System.out.println("Geeks For Geeks");
            }
            if(n<10)
            {
                System.out.println(" GFG");
            }
            else
            {
                System.out.println("The value of n is 10");
            }
        }
    }
    
}*/

// if Else If
import java.util.Scanner;




public class NestedIf{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int per = sc.nextInt();
        if(per>90)
        {
        System.out.println(" Student Pass by honour");
        }
        else if(per>=80 && per <=90)
        {
            System.out.println(" Student pass by A+");
        }
        else if(per>=70 && per<80)
        {
            System.out.println("Student pass by A");
        }
        else
        {
            System.out.println("P3ass/Fail");
        }
    }
}