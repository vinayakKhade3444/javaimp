//practical no.3.5
import java.util.Scanner;
class Vowels
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter any string:");
String str=sc.next();
int count=0;
for(int i=0;i<str.length();i++)
{
char ch=str.charAt(i);
if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' )
{
count++;
} 
}
System.out.println("Total number of vowels in string is "+count);
}
}
