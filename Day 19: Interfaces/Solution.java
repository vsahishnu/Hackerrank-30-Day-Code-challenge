import java.io.*;
import java.util.*;

interface AdvancedArithmetic{
   int divisorSum(int n);
}
class Calculator implements AdvancedArithmetic {
    public int divisorSum(int n) {
        if(n == 1){
            return 1;
        }
        
        // int sum = 1 + n;

        // for(int i = 2; i < (n/2) + 1; i++){
        //     if (n % i == 0){
        //         sum += i;
        //     }
        // }
        
        // return sum;
        
        int sum = 1 + n;
        int i = 2;
        for(; i*i < n; i++){
            if (n % i == 0){
                sum += i;
                sum += (n/i);
            }
        }
        
        if (i*i == n) {
            return sum + i;
        }

        return sum;
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