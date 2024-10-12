/******************************************************************************

write java program to count  vowel and consonant
input : Hello Worls!
output : vowelcount  - 3
consonant count - 7
*******************************************************************************/
import java.util.*;
public class Main{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        int count_vowel=0;
        int count_conso=0;
        for(int i=0;i<str.length();i++)
        {
            //only check letters
            
            if(Character.isLetter(str.charAt(i))){
            if( str.charAt(i)=='a'  || str.charAt(i)=='u'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='e'
            ||str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='O'||str.charAt(i)=='I'||str.charAt(i)=='U')
            count_vowel++;
            else
            count_conso++;
            }
        }
        System.out.println("Count_vowel : "+ count_vowel);
        System.out.println("Count_consonant :" +count_conso);
        
    }
}
