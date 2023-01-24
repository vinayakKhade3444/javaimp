//practical no.7.3
class Box1
{
int length,width,height;
Box1(int l1,int w1,int h1)
{
length=l1;
width=w1;
height=h1;
int v1=length*width*height;
System.out.println("Volume of Box is "+v1);
}
Box1(int l2,int w2,double h2)
{
length=l2;
width=w2;
double height=h2;
double v2=length*width*height;
System.out.println("Volume of Box is "+v2);
}
Box1(double l3,double w3,double h3)
{
double length=l3,width=w3,height=h3;
double v3=length*width*height;
System.out.println("Volume of Box is "+v3);
}
public static void main(String args[])
{
Box1 b1=new Box1(5,9,7);
Box1 b2=new Box1(6,10,4.5);
Box1 b3=new Box1(5.5,7.2,4.8);
}
}
