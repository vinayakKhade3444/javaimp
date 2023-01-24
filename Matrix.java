//practical no.5.4
import java.util.Scanner;
class Matrix
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a[][] = new int[3][3];   
int b[][] = new int[3][3];    
int c[][] = new int[3][3];    
System.out.println("Enter all the elements of first matrix:");
for (int i = 0; i < 3; i++) 
{
for (int j = 0; j < 3; j++) 
{
a[i][j] = sc.nextInt();
}
}
System.out.println("Enter all the elements of second matrix:");
for (int i = 0; i < 3; i++) 
{
for (int j = 0; j < 3; j++) 
{
b[i][j] = sc.nextInt();
}
}
System.out.println("");
for (int i = 0; i < 3; i++) 
{
for (int j = 0; j <3; j++) 
{
for (int k = 0; k <3; k++) 
{
c[i][j] = a[i][j] + b[i][j];
}
}
}
System.out.println("Matrix after addition:");
for (int i = 0; i < 3; i++) 
{
for (int j = 0; j <3; j++) 
{
System.out.print(c[i][j]+" ");
}
System.out.println("");
}
}
}

