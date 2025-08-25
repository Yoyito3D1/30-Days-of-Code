import java.io.*;
import java.util.*;

interface AdvancedArithmetic{
   int divisorSum(int n);
}
class Calculator implements AdvancedArithmetic {
        public static int returnDivisors(int n) {
        int divisors = 0;
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) { 
                divisors += i;
                if (i != n / i) { 
                    divisors += n / i;
                }
            }
        }
        return divisors;
    }
    
    public int divisorSum(int n) {
        return returnDivisors(n);
    }
}

class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        
      	AdvancedArithmetic myCalculator = new Calculator(); 
        int sum = myCalculator.divisorSum(n);
        System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName() );
        System.out.println(sum);
    }
}