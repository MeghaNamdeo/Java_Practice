/**************************************************************************coeditor and press "Run" button to execute it.
Reverse the words in a String

input
Welcome to my Java Programming
ouput
Programming Java my to Welcome



*******************************************************************************/

import java.util.*;
public class Main {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String arr[]=str.split(" ");
		int start =0;
		int end=arr.length-1;
		while(start<=end)
		{
			String temp = arr[start];
			arr[start]=arr[end];
            arr[end]=temp;
			start++;
			end--;
		}
		for(int i=0;i<arr.length;i++)
		{  
		    System.out.print(arr[i]+" ");
		}
	}
}
