import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());
        int valorMax = 0;
        int valorAux = 0;
        String nString = Integer.toBinaryString(n);
        String myArray[] = nString.split("");

        for(int i = 0; i < myArray.length; i++) {
            if(Integer.parseInt(myArray[i]) == 1) {
                valorAux++;
                if(valorAux > valorMax) {
                    valorMax = valorAux;
                }
            }
            else {
                valorAux = 0;
            }
        }
        System.out.println(valorMax);


        bufferedReader.close();
    }
}
