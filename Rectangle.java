//practical no.8.2
interface Shape
{
void Area();
}
class Rectangle implements Shape
{
int length,width,area;
void get(int l,int w)
{
length=l;
width=w;
}
public void Area()
{
area=length*width;
}
void show()
{
Area();
System.out.println("Area of Rectangle: "+area);
}
public static void main(String args[])
{
Rectangle r=new Rectangle();
r.get(9,5);
r.show();
}
}

