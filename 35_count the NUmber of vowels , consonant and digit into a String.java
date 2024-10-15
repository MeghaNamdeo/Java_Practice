/**************************************************************************coeditor and press "Run" button to execute it.
count the NUmber of vowels , consonant and digit into a String

input 
Welcome1234

output
Number of vowels: 3
Number of Consonents: 4
Number of Numbers: 4




*******************************************************************************/

import java.util.*;
public class Main{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        
        String str= sc.nextLine();
        
        int countVowel=0,countConso=0,countNumber=0;
        
        
        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            if(ch == 'a'||ch=='u'||ch=='i'||ch=='o'||ch=='e'||
            ch == 'A'||ch=='I'||ch=='O'||ch=='U'||ch=='E')
            countVowel++;
            // Check for digits
            else if(Character.isDigit(ch))
            countNumber++;
            // Check for consonants (only letters)
            else if(Character.isLetter(ch))
            countConso++;
            
        }
        System.out.println("Vowels :"+countVowel);
        System.out.println("Consonents :"+ countConso);
        System.out.println("Digit :"+ countNumber);
        
    }
}
