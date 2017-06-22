import java.util.*;
class no
{
public static void main(String args[])
{
int t,x,count=0;
Scanner in=new Scanner(System.in);
System.out.println("Enter an integer:");
x=in.nextInt();
t=x;
System.out.println(t);
while(x>0)
{
x=x/10;
count=count+1;
}
System.out.println("no of digits in "+t+"is"+count);
}
}
