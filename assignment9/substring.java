public class substring
{
public static void main(String[] x)
{
String input = "xyz";
for(int i=0;i<3;i++)
{
for(int j=i+1;j<=3;j++)
{
String s = input.substring(i,j);
   System.out.println(s);
  }
}
}
}