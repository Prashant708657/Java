package Array;
//using loop
public class ArrayCompare {
   public static void main(String[] args)
    {
        int arr1[] = {1,2,3};
        int arr2[] = {1,4,3};
       ArrayCompare obj=new  ArrayCompare();
        if(obj.equal(arr1,arr2))
        {
            System.out.println("same");
        }
        else{
            System.out.println("Different");
        }
     /*   if(equal(arr1,arr2))
        {
            System.out.println("same");
        }
        else{
            System.out.println("Different");
        }*/


    }
    public  boolean equal(int a[],int b[])
    {
          if(a.length!=b.length)
          {
              return false;
          }

         for(int i=0;i<a.length;i++)
         {
             if(a[i]!= b[i])
             {
                 return false;
             }
             
         
         } return true;
           
    }

  

    
}
