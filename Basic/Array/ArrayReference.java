package Array;

import java.util.Arrays;

/*class Employee{
public int id;
public String name;
Employee (int id,String name)
{
    this.id = id;
    this.name=name;
}

}
public class ArrayReference{
public static void main(String[] args)
{
    
    Employee arr[] = new Employee[3] ;
   
  
    arr[0] = new Employee(1,"Prashant");
    arr[1] = new Employee(2,"Pratish");
    arr[2] = new Employee(5,"Praveen");
    for(int i=0;i<3;i++)
    {
        System.out.println(arr[i].id+""+arr[i].name);
    }
}

}
*/

class Student{
    public int rollno;
    public String StudentName;
    Student(int rollno,String StudentName)
    {
        this.rollno = rollno;
        this.StudentName = StudentName;
    }
    
}
public class ArrayReference{
    public static void main(String[] args)
    {
        Student arr[] = new Student[3];
        arr[0] = new Student(1,"Prashant");
        arr[1] = new Student(2,"Nisha");
        arr[2] = new Student(13,"Shikha");
       
        for(int i=0;i<3;i++)
        {
       System.out.println(arr[i].rollno+" "+ arr[i].StudentName);
   }
  
        System.out.println(Arrays.toString(arr));
    
     
    
}


}