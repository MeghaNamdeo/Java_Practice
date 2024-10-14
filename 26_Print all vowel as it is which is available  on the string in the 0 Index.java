/******************************************************************************
Enter a String and Print all vowel as it is which is available 
on the string in the 0 Index
input : Hello I am a Student
output:Iaa
*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String str=sc.nextLine();
	    String ans="";
	    if(str.length()>0 && (str.charAt(0)=='a'||str.charAt(0)=='e'||str.charAt(0)=='u'||str.charAt(0)=='i'||
		   str.charAt(0)=='o'||str.charAt(0)=='E'||str.charAt(0)=='A'||str.charAt(0)=='I'||str.charAt(0)=='O'||str.charAt(0)=='U'))
		   {
		       ans=ans+str.charAt(0);
		   }
		   
		for(int i=0;i<str.length()-1;i++)
		{
		    
		    if(str.charAt(i)==' ')
		   if(str.charAt(i+1)=='a'||str.charAt(i+1)=='e'||str.charAt(i+1)=='u'||str.charAt(i+1)=='i'||
		   str.charAt(i+1)=='o'||str.charAt(i+1)=='E'||str.charAt(i+1)=='A'||str.charAt(i+1)=='I'||str.charAt(i+1)=='O'||str.charAt(i+1)=='U')
		   {
		    {
		        ans = ans + str.charAt(i+1);
		    }
		  }
	}
	System.out.print(ans);
}
}
