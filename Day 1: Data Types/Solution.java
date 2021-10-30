package Day 1: Data Types;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);

        /* Declare second integer, double, and String variables. */

        /* Read and save an integer, double, and String to your variables.*/
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.
        
        /* Print the sum of both integer variables on a new line. */

        /* Print the sum of the double variables on a new line. */
		
        /* Concatenate and print the String variables on a new line; 
        	the 's' variable above should be printed first. */
        
        int tempI = Integer.parseInt(scan.nextLine());
        double tempD = Double.parseDouble(scan.nextLine());
        String tempS = scan.nextLine();

        System.out.println(i + tempI);
        System.out.println(d + tempD);
        System.out.print(s + tempS);
        scan.close();
    }
}
