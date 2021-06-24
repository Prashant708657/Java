package String;

import java.util.StringTokenizer;

// StringMethod

public class StringMethod {
    public static void main(String[] args)
    {
        //String Length
        String s = "PrashantTiwari";
        System.out.println(s.length());
        //s.charAt(i) for index Value
        System.out.println(s.charAt(1));
        // SubString use
            System.out.println(s.substring(2));
        System.out.println(s.substring(2,8));

        //Concat String
       String s1 = " you are awesome";
       System.out.println(s.concat(s1));
       // Find Index at starting specified point

            System.out.println(s.indexOf("a",3));
           
           System.out.println(s.indexOf("P"));
           //find the last index
           System.out.println(s.lastIndexOf("wa"));
           // equal String
           boolean b = "Geeks".equals("Geeks");
            // Lower Case

            System.out.println(s.toLowerCase());
            // Uppar Case
            System.out.println(s.toUpperCase());
          // remove white space begining and ending
         String s2= " Parikshit ";
         System.out.println(s2.trim());

         // replace character
         String s3 = "feeks for feeks";
         System.out.println(s3.replace('f','g'));

         System.out.println(s3.substring(0,1).toUpperCase()+""+s3.substring(1));
          

         // Change Pargraph into token
         System.out.println();
         StringTokenizer st1 =
             new StringTokenizer(s3);
        while (st1.hasMoreTokens())
            System.out.println(st1.nextToken());

    }

    
    
}
