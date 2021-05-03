public class Pattern1 {
    public static void main(String[] args)
    {
        int n=5;
        // increasing Pattern
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        // for nextLine
        // Decreasing pattern
       
        for(int i=1;i<=n;i++)
        {
            for(int j=i;j<=n;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }


         System.out.println();
        // Next Pattern triangle
        for(int i=1;i<=n;i++)
        {
            for(int j=i;j<=n;j++)
            {
               System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Next Pattern Hill
        System.out.println();

        for(int i=1;i<=n;i++)
        {
            for(int j=i;j<=n;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<i;j++)
            {
                System.out.print("*");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        //Decreasing Hill Pattern
        
        System.out.println();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(" ");
            }
         for(int j=i;j<n;j++)
         {
             System.out.print("*");
         }
         for(int j=i;j<=n;j++)
         {
             System.out.print("*");
         }
         System.out.println();
        }
    }
    
}
