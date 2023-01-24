//practical no.6.1
class Student
{
int Roll_no;
String name;
Student(int r,String n)
{
Roll_no=r;
name=n;
}
void display()
{
System.out.println("Roll No.: "+Roll_no);
System.out.println("Name: "+name);
}
}
class Library extends Student
{
int Member_No;
Library(int r,String n,int m)
{
super(r,n);
Member_No=m;
}
void display1()
{
display();
System.out.println("Member No: "+Member_No);
}
}
class Inherit1
{
public static void main(String args[])
{
Library l=new Library(101,"Omkar",1005);
l.display1();
}
}

