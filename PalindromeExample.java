import java.util.*;
class PalindromeExample{
 public static void main(String args[]){
  int r,sum=0,temp;
  int n;//It is the number variable to be checked for palindrome
  Scanner in=new Scanner(System.in);
System.out.println("Enter n:");
n=in.nextInt();
  temp=n;
  while(n>0){
   r=n%10;  //getting remainder
   sum=(sum*10)+r;
   n=n/10;
  }
  if(temp==sum)
   System.out.println("palindrome number ");
  else
   System.out.println("not palindrome");
}
}
