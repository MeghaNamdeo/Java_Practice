/**************************************************************************coeditor and press "Run" button to execute it.
Reverse string

input 
Enter the String: Hello World from TCS
output
The String Output: olleH dlroW morf SCT


*******************************************************************************/

import java.util.*;
public class Main {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the String: ");
		
		String str=sc.nextLine();
		//things to remember 
	    char arr[]= str.toCharArray();
		
	
		int start=0;
		int end=arr.length-1;
		
		
		while(start<=end)
		{  
		    char temp=arr[start];
		    arr[start]=arr[end];
		    arr[end]=temp;
		    start++;
		    end--;
		    
		    
		}
		System.out.print("Reverse String : ");
		for(int i=0;i<arr.length;i++)
		System.out.print(arr[i]);
	}
}


/******************************************************************************

Write a java program to reverse a given String
condition:
The reverse string should be printed in lowercase only
input : Welcome
output : emocleW

*******************************************************************************/
import java.util.*;
public class Main{
    public static void main(String args[])
    {
        Scanner sc  = new Scanner(System.in);
        String str = sc.nextLine();
        char ch[]=str.toCharArray() ;
        
        
        int start =0;
        int end=ch.length- 1;
        for(; start <= end ;)
        {
            char temp=ch[start];
            ch[start]=ch[end];
            ch[end]=temp;
            
            start++;
            end--;
            
        }
        String revStr = new String (ch).toLowerCase();
        
        System.out.println(revStr);
    }
}


/******************************************************************************

Write a java program to reverse a given String
condition:
The reverse string should be printed in lowercase only
input : Welcome
output : emocleW

*******************************************************************************/
import java.util.*;
public class Main{
    public static void main(String args[])
    {
        Scanner sc  = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.toLowerCase();
        String ans="";
        for(int i = str.length()-1;i>=0;i--)
        {
            ans +=str.charAt(i);
            
            
        }
        System.out.println(ans);
        
        
        
    }
}
