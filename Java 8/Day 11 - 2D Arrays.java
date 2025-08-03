import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        List<List<Integer>> arr = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            arr.add(
                    Arrays.stream(bufferedReader.readLine().trim().split(" "))
                            .map(Integer::parseInt)
                            .collect(Collectors.toList())
            );
        }

        int maxSum = Integer.MIN_VALUE;

        for (int i = 1; i < 5; i++) {
            for (int j = 1; j < 5; j++) {
                int sum = arr.get(i - 1).get(j - 1) + arr.get(i - 1).get(j) + arr.get(i - 1).get(j + 1)
                        + arr.get(i).get(j)
                        + arr.get(i + 1).get(j - 1) + arr.get(i + 1).get(j) + arr.get(i + 1).get(j + 1);

                maxSum = Math.max(maxSum, sum);
            }
        }

        System.out.println(maxSum);
        bufferedReader.close();
    }
}