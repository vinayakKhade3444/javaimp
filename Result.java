//practical no.6.4
import java.util.Scanner;
class Student
{
int Roll_no;
String name;
void get()
{
Scanner sc= new Scanner(System.in);
System.out.println("Enter Roll no.:  ");
Roll_no = sc.nextInt();
System.out.println("Enter Name :  ");
name = sc.next();
}
}
class Marks extends Student
{
int mark1,mark2,total;
void get1()
{
Scanner sc1 = new Scanner(System.in);
System.out.println("Enter Marks for 1st subject: ");
mark1= sc1.nextInt();
System.out.println("Enter Marks for 2nd subject:   ");
mark2 = sc1.nextInt();
total =mark1+mark2;    
}
}
class Result extends Marks
{
float percentage;
void per()
{
percentage =(total*100)/200;
}    
void display()
{
System.out.println("Total Percentage:  "+percentage);
}
public static void main(String args[])
{
Result r1=new Result();
r1.get();
r1.get1();
r1.per();
r1.display();
}
}
