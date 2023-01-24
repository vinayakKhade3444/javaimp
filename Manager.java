//practical no.8.4
class Student
{
int rollno;
String name;
void input(int r,String n)
{
rollno=r;
name=n;
}
void output()
{
System.out.println("The name is : "+name);
System.out.println("The roll no is :"+ rollno);
}
}
interface employee
{
final int B_salary=45000,HRA=10000,DA=18000;
void show();
}
class Manager extends Student implements employee
{
int M_id; 
String Name;
double Total_Sal;
Manager(int r,String n, int i,String n1)
{
super.input(r,n);
M_id=i; 
Name=	n1;
}
void calsalary()
{
Total_Sal=B_salary+HRA+DA;
}
public void show()
{
System.out.println("The member id is :"+M_id);
System.out.println("The Manager name is :"+Name);  
System.out.println("The total salary is :"+ Total_Sal);
}
public static void main(String[] args) 
{
Manager m= new Manager(101, "omkar",1001,"ABC");
m.output();
m.calsalary();
m.show();
}
}
