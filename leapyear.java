import java.util.*;
public class leapyear
{
public static void main(String args[])
{
int x;
Scanner in=new Scanner(System.in);
System.out.println("Enter a year:");
x=in.nextInt();
if((x%4==0) &&(x%100!=0))
 System.out.println("Leap year");
else if(x%100==0)
  System.out.println("Not leap year");
else if(x%400==0)
  System.out.println("Leap year");
else
System.out.println("not a leap year");
}


}
