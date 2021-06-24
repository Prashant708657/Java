package String;

public class StringEqual {
    public static void main(String[] args)
    {
        String s1 = "Prashant";
        String s2 = "prashant";
        boolean b = s2.equals(s1);
        if(b)
        {
        System.out.println(" Same");
        }
        else{
            System.out.println("Not Same");
        }



        // Compare String and check it is equal if anyone capital on small
           System.out.println();

           String s3 = "ShIkhA";
           String s4 = "sHiKHa";
           // if we use equals function thenit ia always not same. 
           // if you want your compiler ignore letter form then;
           boolean c = s3.equalsIgnoreCase(s4);
           if(c)
           {
               System.out.println("It is Same");
           } 
           else{
               System.out.println(" It is not Same");
           }


    }
        
    
    
}
