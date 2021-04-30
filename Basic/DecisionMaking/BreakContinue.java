/*package DecisionMaking;
import java.util.Scanner;
public class BreakContinue{
 
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    /*
    for(int i=n;i>=1;i--)
    {
      if(i<5)
      {
        break;
      }
      System.out.println(i);
    }
      */

     /* for(int i = 1;i<=n;i++)
      {
        if(i>10 && i<20)
        {
          continue;
        }
        System.out.println(i);
      }
  }

}*/

// we can do this program by BufferReader

package DecisionMaking;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;;

class Buffer{
int n;
 Buffer(int n)
 {
   this.n = n;
  
 }

 public void Display() // Continue Statement
 {
   for(int i=1;i<=n;i++)
   {
     if(i>10 && i<20)
     {
       continue;
     }
     System.out.println(i);
   }
 }

 public void Object()
 {

  for(int i=n;i>=1;i--)
    {
      if(i<5)
      {
        break;
      }
      System.out.println(i);
    }
 }

}

public class BreakContinue{
  public static void main(String[] args) throws IOException
  {
   BufferedReader reader = new BufferedReader(
     new InputStreamReader(System.in));
     System.out.println("enter the value of n : ");
     int n = Integer.parseInt(reader.readLine());
     Buffer obj= new Buffer(n);
     obj.Display();
     obj.Object();

  }
}


// 
/*package DecisionMaking;

import java.util.Scanner;
public class BreakContinue{
  
  Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
  
     public void Break(){
   
    for(int i=1;i<n;i++)
    {
      if(i>20)
      {
        break;
      }
      System.out.println(i);
    }

  }
 
  public static void main(String[] args)
  {
     BreakContinue obj = new BreakContinue();
     obj.Break();
     
    
  }
}
*/