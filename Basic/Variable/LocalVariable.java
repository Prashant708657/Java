package Variable;
public class LocalVariable {
    
    public void Student()
    {
        int age = 20;
        age +=5;
        System.out.println("The student age is : "+age);
    }
    public static void main(String[] args)
    {
      LocalVariable obj = new LocalVariable();
      obj. Student();
    }
   
    
}


/*public class LocalVariable  {
    public void StudentAge()
    {
        // local variable age
        int age = 0;
        age = age + 5;
        System.out.println("Student age is : " + age);
    }
  
    public static void main(String args[])
    {
        LocalVariable obj = new LocalVariable();
        obj.StudentAge();
    }}*/
