//practical no.9.5
import java.util.Scanner;
class AuthenticateException extends Exception
{
       AuthenticateException()
       {
              System.out.println("Error:Authentication Failure");
       }
}
class passExc
{
      public static void main(String args[]) 
      { 
            try
            {
                  Scanner sc=new Scanner(System.in);
                  System.out.println("Enter Password:");
                  String str=sc.next();                        
                  if(str.equals("omkar123"))
	        System.out.println("Valid Password");    
                  else
	        throw new AuthenticateException();
             }   
             catch(AuthenticateException e)
             {
              }
      }
}

