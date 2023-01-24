//practical no.8.3
interface Exam
{
void Per_cal();
}
class Student
{
int Roll_no,m1,m2;
String name;
void get(int r,int mark1,int mark2,String n)
{
Roll_no=r;
m1=mark1;
m2=mark2;
name=n;
}
}
class Result2 extends Student implements Exam
{
int total;
float per;
public void Per_cal()
{
total=m1+m2;
per=(total*100)/200;
}
void show()
{
Per_cal();
System.out.println("Roll No.: "+Roll_no+"\nName: "+name+"\nPercentage: "+per);
}
public static void main(String args[])
{
Result2 r=new Result2();
r.get(101,82,73,"omkar");
r.show();
}
}

