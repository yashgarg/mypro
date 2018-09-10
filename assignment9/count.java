import java.util.Scanner;
public class count
{
public static void main(String[] x)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter a sentence: ");
String str = sc.nextLine();
int count=1;
int len = str.length();
for(int i=0;i<len-1;i++)
{
if((str.charAt(i) == ' ') && (str.charAt(i+1) != ' '))
{
count++;
}
}
System.out.println("No. of words: " + count);
}
}