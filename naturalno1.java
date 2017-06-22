import java.util.*;
public class naturalno1{
public static void main(String args[])
{
int x,i,sum=0;
Scanner in=new Scanner(System.in);
System.out.println("enter the limit:");
x=in.nextInt();
for(i=1;i<=x;i++)
{
sum +=i;
}
System.out.println("sum of"+x+"natural nos is"+sum);
}
}
