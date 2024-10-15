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
        Scanner sc=new Scanner(System.in);
        
        String str= sc.nextLine();
        
        char array[]=str.toCharArray();
        
        String ans="";
        
        Set<Character>seen=new HashSet<>();
        
        
        for(int i=0;i<array.length;i++)
        {
            char ch = array[i];
           if(seen.contains(ch))
           {
               break;
           }
           else{
               seen.add(ch);
               ans=ans+ch;
           }
            
            
        }
       
        System.out.println(ans);
        
    }
}
