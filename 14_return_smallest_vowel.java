/******************************************************************************

Write a java program to print the smallest vowel in a given string

input : matrix
output : a

*******************************************************************************/
import java.util.*;
public class Main{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        String str = sc.nextLine();
        char ch[]=str.toCharArray();
        Arrays.sort(ch);
         char ans='\0';
        
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i]=='a'||ch[i]=='i'||ch[i]=='u'||ch[i]=='e'||ch[i]=='o')
            {
                ans=ch[i];
                break;
            }
        }
        
        if(ans!='\0')
        System.out.println(ans);
      
    }
}

/******************************************************************************

Write a java program to print the smallest vowel in a given string

input : matrix
output : a

*******************************************************************************/
import java.util.*;
public class Main{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        
        String str = sc.nextLine();
        
        String[]arr= {"a","e","i","o","u"};
        
        
        for(int i=0;i<arr.length;i++)
        {
            if(str.contains(arr[i]))
            {
                System.out.println(arr[i]);
                break;
            }
        }
      
    }
}