import java.util.Scanner;
public class NumberPattern {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        
        for(int i=1;i<=n;i++)
        {
           System.out.print("*");
        }
        System.out.println();
        for(int i=1;i<=n-2;i++)
        {
            System.out.print("*");
            for(int j=1;j<=n-2;j++)
            {
                System.out.print(" ");
            }
            System.out.println("*");
        }
        for(int i=1;i<=n;i++)
        {
            System.out.print("*");
        }


        System.out.println();

        // Number Patter

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("1");
            }
            System.out.println();
        }

    }
    
}
