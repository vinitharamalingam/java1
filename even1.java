import java.util.*;
public class even1{
public static void main(String args[])
{
 int x,r1,r2;
Scanner in=new Scanner(System.in);
System.out.println("Enter the from range1:");
r1=in.nextInt();
System.out.println("Enter the to range:");
r2=in.nextInt();
System.out.println("The values are:\n");
for(x=r1;x<=r2;x++)
{
if(x%2==0)
System.out.println(x);
}
}
}
