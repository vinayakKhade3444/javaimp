//practical no.3.1
class book
{
int id,price;
String name;
book(int i,String n,int p)
{
id=i;
name=n;
price=p;
}
void display()
{
System.out.println("Id: "+id+"\t Name: "+name+"\t Price: "+price);
}
public static void main(String args[])
{
book b1=new book(105,"Java Programming",185);
b1.display();
book b2=new book(210,"Digital Techniques",150);
b2.display();
}
}
