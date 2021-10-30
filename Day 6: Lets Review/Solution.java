// package Day 6: Lets Review;
import java.util.*;

public class Solution {
    public static String formatPrinter(String str) {
        String formated = "";
        for(int i = 0; i < str.length(); i+=2){
            formated = formated + str.charAt(i);
        }
        formated = formated + " ";
        for(int i = 1; i < str.length(); i+=2){
            formated = formated + str.charAt(i);
        }
        return formated;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int given = Integer.parseInt(input.nextLine());

        String[] res = new String[given];

        for(int i = 0; i < given; i++){
            res[i] = formatPrinter(input.nextLine());
        }
        input.close();

        for(int i = 0; i<given; i++){
            System.out.println(res[i]);
        }
    }
}
