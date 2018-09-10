import java.util.Scanner;
class Maximum {
Scanner s=new Scanner(System.in);
String n1=s.next();
String n2=s.next();
void largest() {
	if(Integer.parseInt(n1)>Integer.parseInt(n2)) {
		System.out.println(n1+" is Bigger");
	}
	else {
		System.out.println(n2+" is Bigger");
	}
}
}
class question3{
	public static void main(String[] args) {
		System.out.println("Enter Two Numbers : ");

Maximum m=new Maximum();
m.largest();
	}
}