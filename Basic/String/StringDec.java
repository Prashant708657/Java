package String;



public class StringDec {
    public static void main(String[] args)
    {
        String s = "Prashant,Tiwari";
        System.out.println("String in String Pool Area :"+s);

        String s1 = new String("Pratish");
        System.out.println("String in heap memory because of new operator :"+s1);
        

        String s2 = new String("HEY");
        System.out.println(s2);
        StringBuilder str = new StringBuilder("hii");
        str.append(" Prashant");
        System.out.println(str);
      
            
        }

    }
    

