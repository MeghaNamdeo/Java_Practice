/**************************************************************************coeditor and press "Run" button to execute it.
Remove a character from a  String

input
Enter the String : hello
Enter the Charcter : l

ouput
The String Output is : heo

*******************************************************************************/

import java.util.*;
public class Main {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the String: ");
		
		String str=sc.nextLine();
		System.out.print("Enter the character: ");
		char character=sc.nextLine().charAt(0);
		
		
		String ans ="";
		
		
		for(int i=0;i<str.length();i++)
		{  
		    char ch=str.charAt(i);
		    if(ch==character)
		    {
		        continue;
		    }
		    else{
		        ans=ans+ch;
		    }
		    
		    
		}
		System.out.println("The String Output : "+ ans);
	}
}
