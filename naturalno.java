import java.util.*;
public class naturalno{
public static void main(String args[])
{
int x,i=1,sum=0;
Scanner in=new Scanner(System.in);
System.out.println("enter the limit:");
x=in.nextInt();
while(i<=x)
{
sum +=i;
i++;
}
System.out.println("sum of"+x+"natural nos is"+sum);
}
}
