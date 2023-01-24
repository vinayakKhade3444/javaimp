//practical no.6.3
class Chocolate
{
String ChocoName;
int ChocoQuantity;
Chocolate(String a,int b)
{
ChocoName= a;
ChocoQuantity=b;
}
void display()
{
System.out.println("Name of the choco: "+ChocoName);
System.out.println("Quantity of choco: "+ChocoQuantity);
}
}
class ChocoFlavor extends Chocolate
{
String FlavorName;
ChocoFlavor(String a,int b,String c)
{
super(a,b);
FlavorName=c;
}
void display1()
{
System.out.println("Flavor of the choco: "+FlavorName);
}
public static void main(String args[])
{
ChocoFlavor c1=new ChocoFlavor("Perk",10,"Crunchy");
ChocoFlavor c2=new ChocoFlavor("Munch",5,"Crunchy");
c1.display();
c1.display1();
c2.display();
c2.display1();
}
}

