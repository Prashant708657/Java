package Array;

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
                System.out.println(sum[i][j]);
            }
        }
        System.out.println();
    }
    
}
