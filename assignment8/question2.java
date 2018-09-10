abstract class Animals {
	String breed,colour,name;
	abstract void eat();
	void speak() {
		System.out.println("Love Speaking.");
	}
}
class dog extends Animals{
	dog(String breed,String colour,String name){
	this.breed=breed;
	this.colour=colour;
	this.name=name;
	}
	void display() {
		System.out.println("Name is: "+name);
		System.out.println("Breed is: "+breed);
		System.out.println("Colour is: "+colour);
	}

	void eat(){
		System.out.println("bones");
			}

}
class question2 {

	public static void main(String[] args) {
    animals an=new dog(" "," "," ");
	dog d=new dog("Retriever","Brown","Bruno");
     d.display();
     an.eat();
	an.speak();
	}

}