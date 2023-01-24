//practical no.6.2
import java.util.Scanner;
class Person
{
String Name;
int age; 
void getdata()
	{
Scanner sc=new Scanner(System.in);
System.out.println("Enter name: ");
Name=sc.next();
System.out.println("Enter age: ");
age=sc.nextInt();
}  
}
class Employee extends Person
{
String Designation;
int Salary;
void get()
{
Scanner sc1=new Scanner(System.in);
System.out.println("Enter designation: ");
Designation=sc1.next();
System.out.println("Enter salary: ");
Salary=sc1.nextInt();
}
void display()
{
System.out.println("Employee name is "+Name);
}
}
class Inherit2
{
public static void main(String args[])
{
Employee emp[]=new Employee[5];
for(int i=0;i<5;i++)
{
emp[i]=new Employee(); 
emp[i].getdata();
emp[i].get();
}
System.out.println("Employee having salary greater than 5000");
for(int i=0;i<5;i++)
{
if(emp[i].Salary>5000)
emp[i].display();
}
}
}
