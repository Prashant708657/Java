package DecisionMaking;
import java.util.Scanner;
public class SwitchCase {

public static void main(String[] args)
{
    Scanner sc = new Scanner(System.in);
System.out.println("Enter the case :");
  int i = sc.nextInt();
  System.out.println("Enter the value of a :");
  int a =sc.nextInt();
  System.out.println("Enter the value of b :");
  int b =sc.nextInt();
  System.out.println("The result is :");
  int result;
  switch(i)
  {
      case 1:
      {
        result = a+b;
        System.out.println(result);
        break;
      }
      case 2:
      {
          result = a-b;
          System.out.println(result);
          break;
      }
      case 3:
      {
          result = a*b;
          System.out.println(result);
          break;
      }
      case 4:
      {
        result = a/b;
        System.out.println(result);
        break;
      }
      case 5:
      {
        result = a%b;
        System.out.println(result);
        break;
      }
      default:
      {
        System.out.println("Out of Bound"); 
        break;
      }
  }


}
}