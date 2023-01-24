//practical no.5.3

import java.util.Scanner;
class Intersect
{
public static void main(String args[])
{
int size1,i;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the size of array:");
size1=sc.nextInt();
int arr1[]=new int[size1];
for(i=0;i<size1;i++)
{
System.out.println("Enter element: ");
arr1[i]=sc.nextInt();
}
int size2;
System.out.println("Enter the size of array:");
size2=sc.nextInt();
int arr2[]=new int[size2];
for(i=0;i<size2;i++)
{
System.out.println("Enter element: ");
arr2[i]=sc.nextInt();
}
System.out.println("Intersection of two arrays is:");
 for(int j = 0;j<arr1.length;j++ ) 
{
for(int k= 0;k<arr2.length; k++)
                                	{
            		if(arr1[j]==arr2[k]) 
{
               System.out.println(arr2[k]);
            }
         			}
      		}
}
}
