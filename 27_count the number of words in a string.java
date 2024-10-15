/**************************************************************************coeditor and press "Run" button to execute it.
count the number of words in a string 

input 
Welcome  to My World of Programming
ouput
The Number of Words are : 6

*******************************************************************************/

import java.util.*;
public class Main{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        String str=sc.nextLine();
       
        String arr[]=str.split(" ");
        int count=arr.length;
        System.out.println(count);
    }
}
