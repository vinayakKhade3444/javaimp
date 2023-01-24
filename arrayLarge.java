//practical no.5.1
import java.util.Scanner;
class arrayLarge
{
      public static void main(String args[]) 
      { 
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter total number of elements in array:");
            int n=sc.nextInt();
            int a[]=new int[n];
            System.out.println("Enter elements of array:");
            for(int i=0;i<n;i++)
            {
                     a[i]=sc.nextInt();
            }
            int max=a[0];
            for(int j=0;j<n;j++)
            { 
                     if(max<a[j])
                     {
                             max=a[j];
                     }
            }
            System.out.println("Maximum value is "+max);
      }
}

