class A
{
   A()
   {
      System.out.println("In Default constructor");
    }

    A(String name,int age)
    {
       this();
       System.out.println("In parametrized constructor");
       System.out.println("Name:"+name+" Age:"+age);
     }
}

class Prog2
{
  public static void main(String[] args)
    {
       A b=new A("Yash",20);
    }
}