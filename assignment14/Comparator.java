import java.util.*;
class Student 
{
	int rollno;
	String name;
	char grade;

	Student(String a,char b,int c)
	{
		rollno=c;
		name=a;
		grade=b;
	}

	public String toString()
	{
		return rollno+" "+name+" "+grade;
	}
}
class RollComp implements Comparator<Student>
{
	public int compare(Student s1,Student s2)
	{
		if(s1.rollno>s2.rollno)
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
}
class NameComp implements Comparator<Student>
{
	public int compare(Student s1,Student s2)
	{
		return (s1.name).compareTo(s2.name);
	}
}
class Comparator
	public static void main(String args[])
	{
		Student x=new Student("AB",'A',12);
		Student y=new Student("BA",'B',13);
		Student z=new Student("CD",'C',15);
                ArrayList<Student> myset=new ArrayList<Student>(new NameComp());
		myset.add(x);
		myset.add(y);
                myset.add(z);
                System.out.println("Sort by name:");
		System.out.println(myset);
                ArrayList<Student> myset=new ArrayList<Student>(new RollComp());
                System.out.println("Sort by roll no:");
		System.out.println(myset);
	}
}