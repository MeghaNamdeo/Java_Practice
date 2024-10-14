/******************************************************************************
Count number of uppercase letter in String
condition : if count is greater than 5 then print "Valid String"
otherwise
print "NOT A VALID STRING"

input 
hFJKAfSRjSDI 

output
Valid String


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
            if(str.charAt(i)>='A'&&str.charAt(i)<='Z')
            {
                count++;
            }
        }
        if(count>5)System.out.println("VALID STRING");
        else System.out.println("NOT A VALID STRING");
        
    }
}
