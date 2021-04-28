/*package ReadInput;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class Employee{
    String name;
    Double id;
    int age;
    Employee(String name, int age,Double id){
       this.name = name;
       this.age = age;
       this.id = id;
    }
    public void displayDetails(){
       System.out.println("Name: "+this.name);
       System.out.println("Age: "+this.age);
       System.out.println("ID: "+this.id);
    }
 }
public class Buffer {
  public static void main(String[] args)
  throws IOException
  {
      BufferedReader  object = new BufferedReader(
          new InputStreamReader(System.in));
        
          String name = object.readLine();
          
          int age =Integer.parseInt(object.readLine());
          double id = Double.parseDouble(object.readLine());
        Employee sc = new Employee(name , age,id);
        sc.displayDetails();
  }
    
}
*/
package ReadInput;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Student
{
String name;
int marks;
float per; 
Student(String name,int marks,float per)
{
 this.name = name;
 this.marks = marks;
 this.per = per;
}
public void Display()
{
    System.out.println("Name is :"+this.name);
    System.out.println("Marks is :"+this.marks);
    System.out.println("Percentage is :"+this.per);
}

}
public class Buffer{
    public static void main(String[] args)
    throws IOException
    {
     BufferedReader reader = new BufferedReader(
         new InputStreamReader(System.in));
     
         String name = reader.readLine();
         int marks = Integer.parseInt(reader.readLine());
         float per = Float.parseFloat(reader.readLine());
         Student object = new Student(name,marks,per);
         object.Display();
    }
    
}