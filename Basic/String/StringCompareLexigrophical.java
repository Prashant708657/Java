package String;

import java.io.IOException;

// here lexigrophical order
public class StringCompareLexigrophical {
    public static void main(String[] args) throws IOException
    {
        String s1 = "Prashant";
        String s2 = new String("Prashant");
        String s3 = new String("HeyYouWhatAreYouDoing");

        System.out.println("Difference b/w s1-s2 "+s1.compareTo(s2));

        System.out.println("Difference b/w s1-s3 "+s1.compareTo(s3));

        System.out.println("Difference b/w s2-s3 "+s2.compareTo(s3));
        //Add two String then reverse
      System.out.println();
        StringBuilder st = new StringBuilder();
        
        st.append(s2.concat(s3));
        st.reverse();
        System.out.println(st);

    }
    
}
