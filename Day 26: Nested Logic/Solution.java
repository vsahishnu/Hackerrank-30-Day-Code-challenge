import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        int d1 = input.nextInt();
        int m1 = input.nextInt();
        int y1 = input.nextInt();
        int d2 = input.nextInt();
        int m2 = input.nextInt();
        int y2 = input.nextInt();
        input.close();

        int fee = 0;

        if(y1 > y2) fee = 10000;
        else if (y1 == y2){
            if (m1 > m2) fee += ((m1-m2) * 500);
            else if (m1 == m2){
                if (d1 > d2){
                    fee += ((d1-d2)*15);
                }
            }
        }

        System.out.println(fee);
    }
}