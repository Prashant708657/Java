package Array;
import java.util.Scanner;
public class SumArray {
    public static void main(String[] args)
    {  int m =2 , n =3;
        int a[][] = {{1,2,3},{2,3,4}};
        
         int  b[][] = {{2,3,4},{1,2,3}};
          
          int sum[][] = new int[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
               sum[i][j] = a[i][j]+b[i][j];
            }
        }
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(sum[i][j]);
            }
            System.out.println();
        }
        
        System.out.println();
        // next Array
       Scanner sc = new Scanner(System.in);
       int row = sc.nextInt();
       int col = sc.nextInt();

       int x[][] = new int [row][col];
       int y[][] = new int[row][col];
       for(int i=0;i<row;i++ )
       {
           for(int j=0;j<col;j++)
           {
               x[i][j] = sc.nextInt();
           }
           System.out.println();
       }
       for(int i=0;i<row;i++ )
       {
           for(int j=0;j<col;j++)
           {
               y[i][j] = sc.nextInt();
           }
           System.out.println();
       }
       int total[][] = new int[row][col];
       for(int i=0;i<row;i++ )
       {
           for(int j=0;j<col;j++)
           {
               total[i][j] = x[i][j]+y[i][j];
           }
           System.out.println();
        }
        for(int i=0;i<row;i++ )
        {
            for(int j=0;j<col;j++)
            {
                System.out.println(total[i][j]);
            }
            System.out.println();
         }




    }
    
}
