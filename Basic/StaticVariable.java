
class Mark{
    public static int Number;
    public static String Name = "Prashant Tiwari";
   
}

public class StaticVariable {
     public static void main(String[] args) {
        
        Mark.Number = 78 ;
        System.out.println(Mark.Name+" marks get "+Mark.Number);


    }
    
}
