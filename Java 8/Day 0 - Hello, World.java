import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* JAVA 15 SOLUTION */

        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        String initial = "Hello, World.";
        String solution = null;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            solution = br.readLine();
        }
        catch(IOException ioe) {
            System.out.println(ioe);
        }

        System.out.println(initial);
        System.out.println(solution);
    }

}