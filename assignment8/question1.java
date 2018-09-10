interface Animals
{   
        void eat();
        void speak();  
}
class Dog implements Animals
{
  public void eat()
  {
    System.out.println("Dog eats pedigree");
  }
  public void speak()
  {
     System.out.println("Dog speaks wooh-wooh");
  }
}
class Cat implements Animals
{
  public void eat()
  {
    System.out.println("Cat eats fish");
  }
  public void speak()
  {
     System.out.println("Cat speaks meaw-meaw");
  }
}
class question1 {
  public static void main(String[] args) {
    Animals d= new Dog();
    Animals c=new Cat();
    d.eat();
    d.speak();
    c.eat();
    c.speak();
  }
}