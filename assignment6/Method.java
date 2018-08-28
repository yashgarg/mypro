
class Animal
{ 
   String breed="Germen Shepherd";
   String colour="Golden Black";
  void speak()
  {
    System.out.println("The breed and colour of         a dog is"+breed+"and"+colour);
   }
}

class Dog extends Animal
{
   void speak()
    {
      System.out.println("In the dog speak");
     }
}


class Cat extends Animal
{
   void speak()
    {
      System.out.println("In the cat speak");
     }
}

class Method
{
   public static void main(String[] args)
     {
        Dog d=new Dog();
        Cat c=new Cat();
        d.speak();
        c.speak();
      }
}