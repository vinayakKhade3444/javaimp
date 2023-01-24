//practical no.8.1
class Student
{
int Roll_no;
String name;
void get(int r,String n)
{
Roll_no=r;
name=n;
}
}
interface Sports
{
int sport_wt=5;
void show();
}
class Result1 extends Student implements Sports
{
int marks1,marks2,total_marks;
float per;
public void show()
{
System.out.println("Sport wt="+sport_wt);
}
void getmarks(int m1,int m2)
{
marks1=m1;
marks2=m2;
}
void Calpercentage()
{
show();
total_marks=marks1+marks2;
per=(total_marks*100)/200;
System.out.println("Roll No.: "+Roll_no+"\nName: "+name+"\nPercentage: "+per);
}
public static void main(String args[])
{
Result1 r1=new Result1();
r1.get(101,"omkar");
r1.getmarks(85,79);
r1.Calpercentage();
}
}
