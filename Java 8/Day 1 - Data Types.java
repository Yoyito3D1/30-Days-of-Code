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
        int var1;
        double var2;
        String var3;
        /* Read and save an integer, double, and String to your variables.*/
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.
        var1 = Integer.parseInt(scan.next());
        var2 = Double.parseDouble(scan.next());
        var3 = scan.next();
        while(scan.hasNext() == true) {
            var3 = var3 + " " + scan.next();
        }
        /* Print the sum of both integer variables on a new line. */
        System.out.println(i+var1);
        /* Print the sum of the double variables on a new line. */
        System.out.println(d+var2);
        /* Concatenate and print the String variables on a new line;
        	the 's' variable above should be printed first. */
        System.out.println(s + var3);
        scan.close();
    }
}