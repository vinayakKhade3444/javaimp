//practical no.5.2
import java.util.Scanner;
class Linear
{
public static void main(String args[])
{
int size,i;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the size of array:");
size=sc.nextInt();
int arr[]=new int[size];
for(i=0;i<size;i++)
{
System.out.println("Enter element: ");
arr[i]=sc.nextInt();
}
System.out.println("Enter number to find: ");
int n=sc.nextInt();
for(i=0;i<arr.length;i++)
{
if(arr[i]==n)
{
System.out.println(n+" is found at location "+i);
break;
}
}
if(i==arr.length)
System.out.println("Number not found");
}
}
