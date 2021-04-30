package DecisionMaking.Loop;

public class NestedFor {
    public static void main(String[] args)
    {
    for(int i=1;i<=20;i++)
    {
      for(int j=1;j<=10;j++)
      {
          int table = i*j;
          System.out.println(i+" x "+j+" = "+table);
      }
    }
    
}
}