import java.io.*;
import java.util.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> names = new ArrayList<>();
        Pattern pattern = Pattern.compile("[a-z]+@gmail\\.com$");

        for (int i = 0; i < N; i++) {
            String[] parts = bufferedReader.readLine().split(" ");
            String firstName = parts[0];
            String emailID = parts[1];

            Matcher matcher = pattern.matcher(emailID);
            if (matcher.find()) {
                names.add(firstName);
            }
        }

        Collections.sort(names);
        for (String name : names) {
            System.out.println(name);
        }

        bufferedReader.close();
    }
}
