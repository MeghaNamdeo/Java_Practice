/***************************************************************************
 Write a program to print the last charcter of every word in a String
 condition : ignoew all the digits and whitespace
 input  :Hey3 Java Learners
 output : as
 
*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	  Scanner sc= new Scanner(System.in);
	  String str=sc.nextLine();
	  str=str+' ';
	  for(int i=0;i<str.length();i++)
	  {
	      if(str.charAt(i)==' ')
	      {
	         if(i>0&& !Character.isDigit(str.charAt(i-1)))
	         {
	             System.out.print(str.charAt(i-1));
	         }
	      }
	  }
	  
	}
	
}
