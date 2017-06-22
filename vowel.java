import java.util.*;
import java.lang.*;
public class vowel{
public static void main(String []args)
{
String x;
Scanner in=new Scanner(System.in);
System.out.println("Enter a char:");
x=in.next();
if(x.equals('a')||x.equals('e')||x.equals('i')||x.equals('o')||x.equals('u'))
{
System.out.println("X is vowel");
}
else
System.out.println("X is consonant");
}
}
