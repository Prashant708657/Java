public class Method{
    public static void main(String[] args)
{
    int arr1[] = {1,3,5,6};
    int arr2[] = {1,3,4,6};
    if(equal(arr1,arr2))
    {
          System.out.println("same");
    }
    else{
        System.out.println("defferent");
    }


}
public static boolean equal(int a[],int b[])
{   
   if(a.length != b.length )
   {
       return false;
   }
   else
   {
       for(int i=0;i<a.length;i++)
       {
          if(a[i] != b[i])
         { 
           return false;
       }

       }
       
   }
return true;
   

}

}