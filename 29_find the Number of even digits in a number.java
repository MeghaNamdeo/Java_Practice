/**************************************************************************coeditor and press "Run" button to execute it.
find the Number of even digits in a number . If it is greater than 2 then print true otherwise false

input 
14236
ouput
true

input
1459
output
FALSE

*******************************************************************************/

import java.util.*;
public class Main{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
       
        while(n>0)
        {
            int rem = n%10;
            if(rem%2==0)count++;
            n=n/10;
        }
        if (count>2)
        System.out.println("TRUE");
        else
        System.out.println("FALSE");
    }
}
