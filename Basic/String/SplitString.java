package String;

public class SplitString {
    public static void main(String[] args)
    {
        String s = "hello,guys,what,are,you";
        String s1[] = s.split(",");
        for(String val: s1)
        {
            System.out.println(val);
        }
        System.out.println();
        // next split
        String s2[] = s.split(",",2); // limit j-1(2 is limit here) so left side first comma split
           for(String value: s2)
           {
               System.out.println(value);
           }

           // next split
           System.out.println();
           String s3 = "hii,what@are%Yo*J,Do/y";
           String s4[] = s3.split("[,@%*,/]");
           for(String ans:s4)
           {
               System.out.println(ans);
           }
    }

    
}
