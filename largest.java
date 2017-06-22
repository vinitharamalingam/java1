import java.util.*;
public class largest
{
public static void main(String args[])
{
int x=0,y=0,z=0;
Scanner in=new Scanner(System.in);
System.out.println("Enter 1 value:\n");
x=in.nextInt();
System.out.println("Enter 2 value:\n");
y=in.nextInt();
System.out.println("Enter 3 value:\n");
z=in.nextInt();
if(x>y)
{
  if(x>z)
    System.out.println("X :"+x+"is  big");
  else
    System.out.println("Z:"+z+"is big");
}
else
{
 if(y>z)
  System.out.println("Y:"+y+"is big");
 else
  System.out.println("Z :"+z+"is big");
}
}
}
