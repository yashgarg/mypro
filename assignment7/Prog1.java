class A
{
   void display()
    {
      System.out.println("In class A");
    }
}

class B extends A
{
   void show()
    {
      System.out.println("In class B");
    }
}

class Prog1
{
  public static void main(String[] args)
    {
       B b=new B();
       b.display();
       b.show();
    }
}