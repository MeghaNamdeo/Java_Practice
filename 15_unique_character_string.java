/*
Write a Java Program to print the unique characters present in the 
given string in the same sequence as they appear (the  first occurence ) in the input .

condition : All the characters should be in lowercase only 

input :
xperience
output :
xperinc

*/
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toLowerCase(); // Convert input to lowercase
        StringBuilder result = new StringBuilder(); // To store unique characters
        Set<Character> seen = new HashSet<>(); // To keep track of seen characters

        // Iterate through the string to maintain order
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!seen.contains(c)) {
                seen.add(c); // Mark character as seen
                result.append(c); // Append to result
            }
        }

        System.out.println(result); // Print the result
        sc.close();
    }
}
