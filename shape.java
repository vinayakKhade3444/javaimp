//practical no.7.1
class shape
{
void area(double x)
{
double a=3.14*x*x;
System.out.println("Area of Circle is "+a);
}
void area(double x,double y)
{
double a=(x*y)/2;
System.out.println("Area of Triangle is "+a);
}
void area(int x,int y)
{
int a=x*y;
System.out.println("Area of Rectangle is "+a);
}
void area(int x)
{
int a=x*x;
System.out.println("Area of Square is "+a);
}
public static void  main(String args[])
{
shape s=new shape();
s.area(5.2);
s.area(8.5,4.8);
s.area(6,7);
s.area(5);
}
}

