package Array;

public class DefaultValueArray {
    public static void main(String[] args)
    {
        // String data type of array
        String array[] = new String[5];
        for(String s: array)
        {
            System.out.println(s);
        }

        // integer data type of array
           
        int marks[] = new int[5];
        for(int value : marks)
        {
            System.out.println(value);
        }

        // Boolean

        boolean bnum[] = new boolean[5];
        
       /* for(int i=0;i<5;i++)
        {
            System.out.println(bnum[i]);
        }*/
        for(boolean bool: bnum)
        {
            System.out.println(bool);
        }
        // Refrence based
        DefaultValueArray arr[] = new DefaultValueArray[5];
        for(DefaultValueArray val:arr)
        {
            System.out.println(val);
        }
    }
    
}
