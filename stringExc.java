//practical no.9.4
import java.util.Scanner;
class StringException extends Exception
{
       StringException()
       {
              System.out.println("Error:String doesn't start with s");
       }
}
class stringExc
{
      public static void main(String args[]) 
      { 
            try
            {
                  Scanner sc=new Scanner(System.in);
                  System.out.println("Enter string:");
                  String str=sc.next(); 
                  char s1=str.charAt(0);          
                  if(s1=='s' || s1=='S')
	        System.out.println("String is starting with s");    
                  else
	        throw new StringException();
             }   
             catch(StringException e)
             {
              }
      }
}

