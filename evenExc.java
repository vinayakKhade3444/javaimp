//practical no.9.1
import java.util.Scanner;
class NotEvenException extends Exception
{
       NotEvenException()
       {
              System.out.println("Error:Number is odd");
       }
}
class evenExc
{
      public static void main(String args[]) 
      { 
            try
            {
                  Scanner sc=new Scanner(System.in);
                  System.out.println("Enter a number:");
                  int n=sc.nextInt();
                  if(n%2==0)
	        System.out.println("Number is Even");    
                  else
	        throw new NotEvenException();
             }   
             catch(NotEvenException e)
             {
              }
      }
}

