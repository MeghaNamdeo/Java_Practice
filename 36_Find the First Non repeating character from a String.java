/**************************************************************************coeditor and press "Run" button to execute it.
Find the First Non repeating character from a String
if any repeating character comes then its break

input 
Hello

output
Hel

*******************************************************************************/

import java.util.*;
public class Main{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String str= sc.nextLine();
        String ans ="";
        
        Set<Character>seen = new HashSet<>();
        for(int i =0;i<str.length();i++)
        {
            if(seen.contains(str.charAt(i)))
            {
                break;
            }
            else
            {
                seen.add(str.charAt(i));
                ans=ans+str.charAt(i);
            }
        }
        System.out.println(ans);
        
        
    }
}
