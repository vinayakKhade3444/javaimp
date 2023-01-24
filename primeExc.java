//practical no.9.2
import java.util.Scanner;
class NotPrimeException extends Exception
{
       NotPrimeException()
       {
              System.out.println("Error:It is not a prime number");
       }
}
class primeExc
{
      public static void main(String args[]) 
      { 
            try
            {
                  int flag=0;
                  Scanner sc=new Scanner(System.in);
                  System.out.println("Enter a number:");
                  int n=sc.nextInt();
                  for(int i=2;i<n;i++)
                  {
	     if(n%i==0)
	     {
	              flag++;
	              break;
	      }
                  }
                  if(flag==0)
	        System.out.println(n+" is a Prime number");    
                  else
	        throw new NotPrimeException();
             }   
             catch(NotPrimeException e)
             {
              }
      }
}
