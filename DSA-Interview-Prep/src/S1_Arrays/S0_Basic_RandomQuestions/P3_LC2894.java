package S1_Arrays.S0_Basic_RandomQuestions;
import java.util.*;

//2894. Divisible and Non-divisible Sums Difference
//https://leetcode.com/problems/divisible-and-non-divisible-sums-difference/description/
public class P3_LC2894 {
    public static void main(String[] args){
        //call from here...
    }

    
    private static int differenceOfSums(int n, int m) {
        int difference = 0;
        for(int number = 1; number <= n; number++){
            if(number%m == 0){
                difference -= number;
            }else{
                difference += number;
            }
        }

        return difference;
    }
}
