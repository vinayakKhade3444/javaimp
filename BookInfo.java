//practical no.6.5
class Book
{
String author,title,publisher;
Book(String a,String t, String p)
{
author=a;
title= t;
publisher=p;
}
}
class BookInfo extends Book
{
float price;
int stock_position;
BookInfo(String a,String t, String p,float pr,int s)
{
super(a,t,p);
price=pr;
stock_position=s;
}
void show()
{
System.out.println("Author of the book: "+author);
System.out.println("Title of the book: "+title);
System.out.println("Publisher of the book: "+publisher);
System.out.println("Price of the book: "+price);
System.out.println("Stocks Remaining of the book: "+stock_position);
}
public static void main(String args[])
{
BookInfo b1=new BookInfo("Atul Godse","Digital Techniques","Technical",150,50);
BookInfo b2=new BookInfo("Vijay Patil","Data Structure","Nirali",210,15);
BookInfo b3=new BookInfo("J.S. Katre","Basic Electronics","Technical",155,142);
b1.show();
b2.show();
b3.show();
}
}
