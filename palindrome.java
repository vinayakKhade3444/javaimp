//practical no.4.3
import java.util.Scanner;
class palindrome
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number:");
int n=sc.nextInt();
int temp,rev=0,digit;
temp=n;
while(n!=0)
{
digit=n%10;
n=n/10;
rev=rev*10+digit;
}
if(temp==rev)
			System.out.println(temp+" is a Palindrome number");
else
			System.out.println(temp+" is not a Palindrome number");
}
}

