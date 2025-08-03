import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws IOException{
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine().trim());

        for(int i = 0; i < n; i++) {
            String paraula = br.readLine();
            String[] aux = paraula.split("");
            String parells = "";
            String imparells = "";

            for(int r = 0; r < aux.length; r++) {
                if(r % 2 == 1) {
                    imparells = imparells + aux[r];
                }
                else {
                    parells = parells + aux[r];
                }
            }
            System.out.println(parells + " " + imparells);
        }
    }
}
