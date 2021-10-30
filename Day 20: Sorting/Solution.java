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
        // BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        // int n = Integer.parseInt(bufferedReader.readLine().trim());

        // List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
        //     .map(Integer::parseInt)
        //     .collect(toList());

        // // Write your code here

        // bufferedReader.close();
        
        // int numSwaps = 0;
        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j < n - 1; j++) {
        //         if (arr.get(j) > arr.get(j+1)) {
        //             int tmp = arr.get(j);
        //             arr.get(j) = arr.get(j+1);
        //             arr.get(j+1) = tmp;
        //             numSwaps++;
        //         }
        //     }

        //     if (numSwaps == 0) {
        //         break;
        //     }
        // }

        // System.out.println("Array is sorted in " + numSwaps + " swaps.");
        // System.out.println("First Element: " + arr.get(0));
        // System.out.println("Last Element: " + arr.get(arr.size() - 1));
        
        Scanner input = new Scanner(System.in);
        int temp = Integer.parseInt(input.nextLine());
        int[] arr = new int[temp];
        for (int i = 0; i < temp; i++) {
            // converting all the inputs from string to int
            arr[i] = input.nextInt();
        }
        input.close();

        int numSwaps = 0;
        for (int i = 0; i < temp; i++) {
            for (int j = 0; j < temp - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                    numSwaps++;
                }
            }

            if (numSwaps == 0) {
                break;
            }
        }

        System.out.println("Array is sorted in " + numSwaps + " swaps.");
        System.out.println("First Element: " + arr[0]);
        System.out.println("Last Element: " + arr[arr.length - 1]);
    }
}