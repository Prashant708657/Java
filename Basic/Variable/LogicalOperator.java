package Variable;
class operator{
public static int grade;

}


public class LogicalOperator {
    public static void main(String[] args)
    {
       operator.grade = 10;
       if(operator.grade == 10 || operator.grade == 12)
       {
           System.out.println("Prashant is on for Coding");
       }
       if(!(operator.grade == 10 || operator.grade == 12))
       {
           System.out.println("Prashant is Sleeping");
       }
    }

    
}
