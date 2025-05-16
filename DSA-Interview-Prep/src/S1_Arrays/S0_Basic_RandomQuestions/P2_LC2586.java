package S1_Arrays.S0_Basic_RandomQuestions;
//https://leetcode.com/problems/count-the-number-of-vowel-strings-in-range/
//2586. Count the Number of Vowel Strings in Range
public class P2_LC2586 {
    public static void main(String[] args){
        //call from here...
    }

    public static int vowelStrings(String[] words, int left, int right) {
        int n = words.length;
        int numberOfVowels = 0;
        for(int index = left; index <= right; index++){
            char first = words[index].charAt(0);
            char last = words[index].charAt(words[index].length() - 1);
            if(isVowel(first) && isVowel(last)) numberOfVowels++;
        }

        return numberOfVowels;
    }

    private static boolean isVowel(char ch){
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')   return true;
        return false;
    }
}
