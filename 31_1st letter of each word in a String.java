/******************************************************************************
Find the 1st letter of each word in a String

input
Hello How Are You
ouput
HHAY

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String ans="";
		ans=ans+str.charAt(0);
		for(int i=0;i<str.length();i++)
		{
		    if(str.charAt(i)==' ')
		    {
		        ans=ans+str.charAt(i+1);
		    }
		}
		System.out.println(ans);
		
	}
}

-----------------------------------------------------------------------
import java.util.*;
public class Main {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		
		String arr[]=str.split(" ");
		
		String ans ="";
		
		
		for(int i=0;i<arr.length;i++)
		{  
		    ans = ans + arr[i].charAt(0);
		    
		    
		}
		System.out.println(ans);
	}
}
