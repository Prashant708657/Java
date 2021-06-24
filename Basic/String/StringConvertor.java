package String;

public class StringConvertor {
    public static void main(String[] arga)
    {
        int i =200;
        Double j=20.50;
        char c ='a';
        float k = 24;
        // convert integer to String
        String s = Integer.toString(i);
        System.out.println(s);
        System.out.println(s+j);
        //Convert Double to String
        String s1 = Character.toString(c);
        System.out.println(s1);


        String s2 = Double.toString(j);
        System.out.println(s2);


        String s3 = Float.toString(k);
        System.out.println(s3);

    }
    
}
