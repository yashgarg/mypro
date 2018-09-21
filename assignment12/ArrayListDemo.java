import java.util.*;
class ArrayListDemo{
public static void main(String args[])
{
ArrayList<String> l1=new ArrayList<String>();
l1.add("Yash");		
l1.add("Himanshu");
l1.add("Nikhil");
l1.add("Garg");
System.out.println(l1);
l1.add(1,"Sanjoli");
System.out.println("After adding Element At paricular Index:"+l1);
l1.remove(2);
System.out.println("Afetr Removing the Element at particular index:"+l1 );
System.out.println("Getting Element an by index:"+l1.get(2));
System.out.println("Searching Element in ArrayList:"+l1.contains("Himanshu"));
Iterator it=l1.iterator();
while(it.hasNext())
{
	String s=(String)it.next();
	System.out.println(s);
}
ArrayList<String> l2=new ArrayList<String>();
l2.addAll(l1);
l2.add("Rai");
System.out.println("This ia Array having size 1.5times the previous size:"+l2);
}
}