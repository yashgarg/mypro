import java.util.Scanner;
public class reverse
{
public static void main(String[] x)
{
String reverse="";
Scanner sc = new Scanner(System.in);
System.out.println("Enter a string: ");
String s = sc.nextLine();
int len=s.length();
for ( int i = len - 1 ; i >= 0 ; i-- )
         reverse = reverse + s.charAt(i);
 
    System.out.println("Reverse of entered string is: "+reverse);
 }
}