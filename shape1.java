//practical no.7.2
class shape1
{
double l,b;
shape1(double x)
{
l=x;
double a=3.14*l*l;
System.out.println("Area of Circle is "+a);
}
shape1(double x,double y)
{
l=x;
b=y;
double a=(l*b)/2;
System.out.println("Area of Triangle is "+a);
}
shape1(int x,int y)
{
l=x;
b=y;
double a=l*b;
System.out.println("Area of Rectangle is "+a);
}
shape1(int x)
{
l=x;
double a=l*l;
System.out.println("Area of Square is "+a);
}
public static void  main(String args[])
{
shape1 s1=new shape1(5.2);
shape1 s2=new shape1(8.5,4.8);
shape1 s3=new shape1(6,7);
shape1 s4=new shape1(5);
}
}

