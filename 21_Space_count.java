/******************************************************************************
Count number of space in String
condition : if space is greate r than 3 then priint number odf apce otherwie 
print "NOT A VALID STRING"

input 
I LOVE THE XPLORE PROGRAM OF TCS 

output
6


*******************************************************************************/
import java.util.*;
public class Main{
    public static void main(String args[])
    {
        int count =0;
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==' ')
            {
                count++;
            }
        }
        if(count>3)System.out.println(count);
        else System.out.println("NOT A VALID STRING");
        
    }
}
