//practical no.3.4
import java.util.Scanner;
class Concat
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter First Name:");
String fname=sc.next();
System.out.println("Enter Middle Name:");
String mname=sc.next();
System.out.println("Enter Surname:");
String sname=sc.next();
StringBuffer str=new StringBuffer();
str.append(fname);
str.append(" ");
str.append(mname);
str.append(" ");
str.append(sname);
System.out.println("Your full name is "+str);
}
}
