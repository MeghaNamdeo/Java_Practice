/******************************************************************************

    write a java program to reverse a given number 
    condition 
    Input will only be apositive integer and will naot have any charcters
    input 
    12345
    output 
    54321

*******************************************************************************/
import java.util.*;
public class Main{
    public static void main(String args[])
    {
       Scanner sc = new Scanner(System.in);
       int number = sc.nextInt();
       int rev=0;
       while(number>0)
       {
           int rem = number % 10;
           rev = rev*10 + rem;
           number = number /10;
       }
       System.out.println(rev);
       
    }
}