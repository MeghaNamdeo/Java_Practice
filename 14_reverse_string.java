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