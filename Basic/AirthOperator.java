// Airthmatic Operation
/*public class AirthOperator {
    public static void main(String[] args)
    {
        int num1 = 16;
        int num2 = 7;
        int add = num1+num2;
        int sub = num1-num2;
        int mul = num1*num2;
        float div = num1/num2;
        int rem = num1%num2;
        System.out.println(add);
        System.out.println(sub);
        System.out.println(mul);
        System.out.println(div);
        System.out.println(rem);
    }
    
}*/
// Unary Operator ++ , --
/*public class AirthOperator{
    public static void main(String[] args)
    {
        int num = 5;
        //Post increment and pre increment
        System.out.println("Post Increment:"+ num++);
        
        System.out.println("Pre Increment :"+ ++num);
    
        // pre decrement and post
        System.out.println("Post decrement:"+ num--);
        
        System.out.println("Pre decrement :"+ --num);

    }
}
*/
// Ternary operator
public class AirthOperator{
    public static void main(String[] args)
    {
       /* int a =20 , b = 30, result;

        result = (a>b)? a:b;
        System.out.println(result);
        */

        int a =5, b =9 , c=6 , result;
        result = ((a>b)?(a>c)? a : c : (b>c)?b:c );
        System.out.println(result);
    }
}