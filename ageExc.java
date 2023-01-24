//practical no.9.3
import java.util.Scanner;
class AgeException extends Exception
{
       AgeException()
       {
              System.out.println("Error:Invalid age");
       }
}
class ageExc
{
      public static void main(String args[]) 
      { 
            try
            {
                  
                  Scanner sc=new Scanner(System.in);
                  System.out.println("Enter age:");
                  int age=sc.nextInt();           
                  if(age>0)
	        System.out.println("Entered age is "+age);    
                  else
	        throw new AgeException();
             }   
             catch(AgeException e)
             {
              }
      }
}
