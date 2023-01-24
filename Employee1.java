//practical no.5.5
import java.util.Scanner;
class Employee1
{
int empid,salary;
String name;
void getdata()
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter Employee Id: ");
empid=sc.nextInt();
System.out.print("Enter Name: ");
name=sc.next();
System.out.print("Enter Salary: ");
salary=sc.nextInt();
}
void display()
{      
System.out.println("The employee id is: " + empid);
System.out.println("The employee name is: " + name);
System.out.println("The employee salary is: " + salary);
}  
public static void main(String args[])
{
Employee1 emp[]=new Employee1[5];
for(int i=0;i<5;i++)
{
emp[i]=new Employee1(); 
emp[i].getdata();
}
for(int i=0;i<5;i++)
{
if(emp[i].salary>5000)
emp[i].display();
}
}
}

