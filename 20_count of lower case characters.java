/******************************************************************************
Write main method in Solution class.
In the main method , read a String value and print the count of lower case characters present in the input String value and print the count of lower case characterspresent in the input String value .if no lower case characters are present in the String value then it should print "No lower case Characters "as a String.

input 
Xplore
output
4

input
XPLORE

output
No lower case Characters 




*******************************************************************************/

import java.util.*;
public class Main{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int count=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)>='a'&&str.charAt(i)<='z')
            {
                count++;
            }
        }
        if(count!=0)System.out.println(count);
        else System.out.println("No lower case Characters ");
    }
}
