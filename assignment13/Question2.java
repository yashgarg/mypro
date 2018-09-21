import java.util.*;
class Question2
{
	public static void main(String args[])
	{
		HashMap<String,String> hm=new HashMap<String,String>();
		hm.put("first name","yash");
		hm.put("Last name","garg");
		hm.put("Category","general");
		for(Map.Entry v:hm.entrySet())
    {
      System.out.println(v.getKey()+"=>"+v.getValue());  
    }
	}
}