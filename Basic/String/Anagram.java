package String;

public class Anagram {
    public static void main(String[] args)
    {
        
        String a ="act";
        String b= "cat";
        boolean visit[] = new boolean[b.length()];
        boolean isAnagram = false;
        if(a.length() == b.length())
        {
            for(int i=0;i<a.length();i++)
            {
            char c = a.charAt(i);
            isAnagram = false;
        
            for(int j=0;j<b.length();j++)
            {
            if(b.charAt(j)== c && visit[j])
            {
                visit[j] = true;
                isAnagram = true;
                break;
            }
            }
            if(!isAnagram)
            {
               break ; 
            }
            }
            
        }
        if(isAnagram)
        {
            System.out.println("Anagram");
        }
        else
        {
            System.out.println("Not Anagram"); 
        }
       

    }
 
    
}
