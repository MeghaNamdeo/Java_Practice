/******************************************************************************
Find Characters of a string at odd index
input : Management
output: aaeet
*******************************************************************************/
import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str= sc.nextLine();
        String ans="";
        for(int i=1;i<str.length();i=i+2)
        {
          ans=ans+str.charAt(i);  
        }
        System.out.println(ans);
    }
}
