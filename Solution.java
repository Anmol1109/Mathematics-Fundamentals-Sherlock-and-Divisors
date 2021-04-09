import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the divisors function below.
     */
    static int divisors(int n) {
        int c = 0;
        for(int i = 1;i <= Math.sqrt(n);i++){
            if(n % i == 0 && i % 2 == 0)
                {
                    c++;
                }
                if(n % (n / i) == 0 && ((n / i) != i) && ((n / i) % 2 == 0))
                {
                    c++;
                }
        }
        return c;
        /*
         * Write your code here.
         */

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(scanner.nextLine().trim());

        for (int tItr = 0; tItr < t; tItr++) {
            int n = Integer.parseInt(scanner.nextLine().trim());

            int result = divisors(n);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();
    }
}
