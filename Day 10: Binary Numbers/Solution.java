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

        bufferedReader.close();

        //since i am counting from 0, we have to added 1 more
        System.out.println(biggestChain(n)+1);
    }

    public static int biggestChain(int n) {
        //counting the 1s as we convert to binary number
        int sum = 0, max = 0;
        while (n > 0) {
            if (n % 2 == 1) {
                if (sum > max) {
                    max = sum;
                }
                sum++;
            } else {
                sum = 0;
            }

            // just like how we use /=10 when removing the final digit of base-10 numbers, 
            // we use /=2 for binary numbers
            n /= 2;
        }
        return max;
    } 
}
