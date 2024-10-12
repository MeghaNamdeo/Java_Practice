/******************************************************************************

write java program to count  number of spaces and characters in a given string 
condition : ignore all the digits
input : Hello This is ABCD from XYZ city
output : 
no. of spaces : 6 and 
characters : 26


*******************************************************************************/
import java.util.*;
public class Main{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count_space=0;
        int count_char=0;
        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            if(Character.isLetter(ch) || ch == ' ')
            {
               if(ch == ' ')count_space++;
               else count_char++;
            }
        }
        System.out.println(count_space);
        System.out.println(count_char);
    }
}