import java.io.*;
import java.util.*;

public class Solution {
    public static boolean isPrime(int n){
        int flag = 0;
        
        for (int i = 2; i < ((int) Math.sqrt(n)+1); i++){
            if (n % i == 0){
                flag = 1;
                break;
            }
        }
        
        if (flag == 0) return true;
        else return false;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int TCs = in.nextInt();

        for (int i = 0; i < TCs; i++) {
            int n = in.nextInt();

            if (n > 1 && isPrime(n)) System.out.println("Prime");
            else System.out.println("Not prime");
        }

        in.close();
    }
}