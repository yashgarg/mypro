class Test
{
   int rollno;
    static int count;
     static{
         System.out.println("In ststic 1 of test");
      }
static{
System.out.println("In static 2 of test");
     }
{System.out.println("In static 2 of test");}
{System.out.println("In static 2 of test");}
Test()
{
  System.out.println("In test constructor");
}
}
class Stavar
{
   public static void main(String[] args)
     {
        Test t= new Test();
        System.out.println("Inside main of main");
      }
static
{System.out.println("In static of main class");}
}