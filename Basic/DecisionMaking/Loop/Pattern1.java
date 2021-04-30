package DecisionMaking.Loop;

public class Pattern1 {
    public static void main(String[] args)
    {
       /* for(int i=0;i<5;i++)
        {
            for(int j=0;j<5;j++)
            {
                System.out.print("* ");
            }
            System.out.println("\n");
        }
        */

        // Pattern 2
     /* for(int i=0;i<5;i++)
      {
        for(int j=0;j<=i;j++)
        {
          System.out.print("* ");
        }
          System.out.println();
      }
      */

      //pattern 3

     /* for(int i=1;i<=5;i++)
      {
          for(int j=1;j<=i;j++)
          {
              System.out.print(j+" ");
          }
          System.out.println();
      }
      */

      //pattern 4
      for(int i=5;i>=1;i--)
      {
          for(int j = i;j>=1;j--)
          {
              System.out.print(" *");
          }
          System.out.println();
      }
    }
    
}
