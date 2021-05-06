public class Number {
    public static void main(String[] args)
    {     int n=5 ;
        // First Number Pattern
        for(int i=1,p=1;i<=n;i++,p++)
        {
            for(int j=1;j<=i;j++)
            {
             System.out.print(p);
            }
            System.out.println();
        }
          System.out.println();
          // Second Number Pattern

          for(int i=1,p=0;i<=n;i++,p+=2)
          {
              for(int j=1;j<=i;j++)
              {
                  System.out.print(p+" ");
              }
              System.out.println();
          }


          System.out.println();
          // Next Number Pattern
          for(int i=1;i<=n;i++)
          {
              for(int j=1;j<=i;j++)
              {
                  if(i%2==0)
                  {
                  System.out.print("2");
              }
              else
              {
                 System.out.print("1");
              }
            
            }
              System.out.println();
            
            }

            System.out.println();
            // Next Pattern
             
            for(int i=1,p=1;i<n;i++,p++)
            {
                for(int j=i;j<=n;j++)
                {
                    System.out.print(" ");
                }
                for(int j=1;j<i;j++)
                {
                    System.out.print(p);
                }
                for(int j=1;j<=i;j++)
                {
                    System.out.print(p);
                }
                System.out.println();
            }

            for(int i=1,p=1;i<=n;i++,p++)
            {
                for(int j=1;j<=i;j++)
                {
                    System.out.print(" ");
                }
                for(int j=i;j<n;j++)
                {
                    System.out.print(p);
                }
                for(int j=i;j<=n;j++)
                {
                    System.out.print(p);
                }
                System.out.println();

            }

            System.out.println();
            // Next pattern

            for(int i=1,p=1;i<n;i++,p++)
            {
                for(int j=i;j<=n;j++)
                {
                    System.out.print(" ");
                }
                for(int j=1;j<i;j++)
                {
                    System.out.print(p);
                }
                for(int j=1;j<=i;j++)
                {
                    System.out.print(p);
                }
                System.out.println();
            }

            for(int i=1,p=5;i<=n;i++,p--)
            {
                for(int j=1;j<=i;j++)
                {
                    System.out.print(" ");
                }
                for(int j=i;j<n;j++)
                {
                    System.out.print(p);
                }
                for(int j=i;j<=n;j++)
                {
                    System.out.print(p);
                }
                System.out.println();

            }

            
    }
    
}
