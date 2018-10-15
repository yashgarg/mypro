import java.util.*;
 class Sort
 {

	public static void main(String[] args) 
     {
     ArrayList<String> s=new ArrayList<String>();
     s.add("Kshitij");
     s.add("Dheeraj");
     s.add("Hardeep");
     Collections.sort(s);
     System.out.println(s);

     ArrayList<Integer> i=new ArrayList<Integer>();

     i.add(1);
     i.add(22);
     i.add(3);
     Collections.sort(i);
     System.out.println(i);
	}

}