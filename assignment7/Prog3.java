 final class A
{
   A()
   {
      System.out.println("In Default constructor");
    }

    A(String name,int age)
    {
       System.out.println("In parametrized constructor");
       System.out.println("Name:"+name+" Age:"+age);
     }
}

class B extends A
{
   B()
   {
     System.out.println("In Class B");
   }
}

class Prog3
{
  public static void main(String[] args)
    {
       A b=new A("Yash",20);
    }
}