//practical no.4.4
import java.util.Scanner;
class armstrong
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number:");
int n=sc.nextInt();
int num,temp,sum=0;
temp=n;
while(n!=0)
{
num=n%10;
sum=sum+(num*num*num);
n=n/10;
}
if(sum==temp)
			System.out.println(temp+" is a Armstrong number");
else
			System.out.println(temp+" is not a Armstrong number");
}
}
