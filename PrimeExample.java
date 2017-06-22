import java.util.*;
class PrimeExample{
 public static void main(String args[]){
  int i,m=0,flag=0;
  int n;
Scanner in=new Scanner(System.in);
System.out.println("Enter a no:");
n=in.nextInt();
  m=n/2;
  for(i=2;i<=m;i++){
   if(n%i==0){
   System.out.println("Number is not prime");
   flag=1;
   break;
   }
  }
  if(flag==0)
  System.out.println("Number is prime");
}
}
