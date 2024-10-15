/**************************************************************************coeditor and press "Run" button to execute it.
Find the Last letter of each word in a string

input 
Hello How Are You
output
oweu


*******************************************************************************/

import java.util.*;
public class Main{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String ans="";
        str=str+' ';
        for(int i=0;i<str.length();i++)
        {
            if(i>0)
            {
            if(str.charAt(i)==' ')
            {
                ans=ans+str.charAt(i-1);
            }
            }
        }
        System.out.print(ans);
        
    }
}
