/******************************************************************************
Reverse words in string

input 
Enter the String: Hello World from TCS
output
The String Output: olleH dlroW morf SCT

*******************************************************************************/
import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String word[]=str.split(" ");
		String ans="";
		for(int i=word.length-1;i>=0;i--)
		{
		    ans=ans+word[i]+" ";
		}
		System.out.println(ans);
	}
}
