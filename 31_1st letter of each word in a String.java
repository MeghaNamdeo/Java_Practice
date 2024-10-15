/**************************************************************************coeditor and press "Run" button to execute it.
Find the 1st letter of each word in a String

input
Hello How Are You
ouput
HHAY

 

*******************************************************************************/

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
