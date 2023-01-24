//practical no.3.3
class NoOfChar
{
public static void main(String args[])
{
String str="Neha Jadhav";
int count=0,i;
for(i=0;i<str.length();i++)
{
if(str.charAt(i)!=' ')
{
count++;
}
}
System.out.println("Total number of character in string is "+count);
}
}
