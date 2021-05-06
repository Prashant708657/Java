
package Array;
// StringBuilderAppend(char[]) Method use for Char Convert to String
import java.lang.*;
public class StringCharAppend {
    public static void main(String[] args)
    {
        StringBuilder obj = new StringBuilder("We Are Here");
        System.out.println(obj);
        char arr[] = {'f','o','r','y','o','u'};
        obj.append(arr);
        System.out.println("After Append"+obj);



    }
    
}
