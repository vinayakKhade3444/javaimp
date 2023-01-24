//practical no.5.6
import java.util.Scanner;
class Product1
{
int id,price;
String name;
void getdata()
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter Product Id: ");
id=sc.nextInt();
System	.out.print("Enter Product Name: ");
name=sc.next();
System.out.print("Enter Product Price: ");
price=sc.nextInt();
}
void display()
{      
System.out.println("The product id is: " + id);
System.out.println("The product name is: " + name);
System.out.println("The product salary is: " + price);
}  
public static void main(String args[])
{
int sum=0;
Product1 p[]=new Product1[5];
for(int i=0;i<5;i++)
{
p[i]=new Product1(); 
p[i].getdata();
}
for(int i=0;i<5;i++)
{
sum+=p[i].price;
}
System.out.println("The total is "+sum);
}
}
