import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    static HashMap<Integer, Integer> memo = new HashMap<>(); 

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        for(int a0 = 0; a0 < s; a0++){
            int n = in.nextInt();
            System.out.println(calculateWays(n));
        }
    }
    
    public static int calculateWays(int n)
    {
        if(memo.containsKey(n))
            return memo.get(n);
        int answer = 0;
        if(n <= 0)
            answer = 0;
        else
        if(n == 1)
            answer = 1;
        else
        if(n == 2)
            answer = 2;
        else
        if(n == 3)
            answer = 4;
        else
            answer = calculateWays(n - 1) + calculateWays(n - 2) + calculateWays(n - 3); 
        
        memo.put(n, answer);
        return memo.get(n);
    }
}
