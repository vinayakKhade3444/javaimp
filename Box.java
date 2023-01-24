//practical no. 3.2
class Box
{
int length,width,height,volume;
Box(int l,int w,int h)
{
length=l;
width=w;
height=h;
}
void display()
{
volume=length*width*height;
System.out.println("Volume of Box: "+volume);
}
public static void main(String args[])
{
Box b1=new Box(7,4,8);
b1.display();
Box b2=new Box(15,8,6);
b2.display();
Box b3=new Box(10,12,9);
b3.display();
}
}
