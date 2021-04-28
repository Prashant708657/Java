/*package DecisionMaking;
import java.util.Scanner;
public class IfDemo {
    public static void main(String[] args)
    {
       
    //If-Else by user Input through Scanner
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
   if(m>n)
   {
        System.out.println(m+" is grater than "+n);
   }
   else
       {
    System.out.println(m+" is less than "+n); 
    }    

    
}
}
*/

// if-else by user input through BufferReader
package DecisionMaking;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class If
{
 int m,n;

 If(int m, int n)
 {
     this.m = m;
     this.n = n;
 }
 public void Display()
 {
     if(m>n)
     {
      System.out.println(m+" is grater than "+n);
     }
     else
     {
        System.out.println(m+" is less than "+n);
     }
 }
}

public class IfDemo{
    public static void main(String[] args)
    throws IOException
    {
        BufferedReader reader = new BufferedReader(
            new InputStreamReader(System.in));
           
            int m = Integer.parseInt(reader.readLine());
            int n = Integer.parseInt(reader.readLine());
            If obj = new If(m,n);
            obj.Display();
    }
}