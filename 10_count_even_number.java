/*COUNT EVEN NUMBER 
given a int number print thr number of even digit if its is graeter then 3 other than print " its is not valid "

input 1 : 4536782
output 1: 4
input 2: 1365279
output 2:its not valid number  
********************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 int n = sc.nextInt();
	 int count=0;
	 while(n>0)
	 {
	     int rem = n %10;
	     if(rem%2==0)
	     {
	         count++;
	         
	     }n = n / 10;
	 }
	 if(count>3)
	 {
	   System.out.println(count);  
	 }
	 else{
	     System.out.println("its not valid number ");
	     
	 }
	}
}
