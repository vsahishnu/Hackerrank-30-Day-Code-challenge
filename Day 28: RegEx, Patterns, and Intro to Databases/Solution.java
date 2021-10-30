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
        Scanner input = new Scanner(System.in);
        int temp = Integer.parseInt(input.nextLine());
        
        ArrayList<String> name = new ArrayList<String>();
        
        for (int i = 0; i < temp; i++) {
            String tempIn = input.nextLine();
            
            if (tempIn.contains("@gmail.com")){
                String[] tempo = tempIn.split(" ");
                name.add(tempo[0]);
            }
        }
        input.close();
        
        Collections.sort(name);
        
        for (String i: name){
            System.out.println(i);
        }
        
    }
}