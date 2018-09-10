import java.util.Scanner;
public class occurence
{
public static void main(String[] x)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter string1: ");
String str = sc.nextLine();
System.out.println("Enter string2: ");
String findstr = sc.nextLine();
boolean res = str.contains(findstr);
System.out.println(res);
 }
}