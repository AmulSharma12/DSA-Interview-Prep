package S1_Arrays.S0_Basic_RandomQuestions;

//https://leetcode.com/problems/determine-if-string-halves-are-alike/description/
//1704. Determine if String Halves Are Alike
public class P1_LC1704 {
    public static void main(String[] args){
        //call from here...
    }

    private static boolean halvesAreAlike(String s) {
        int n = s.length();
        int numberOfAVowel = 0;
        int numberOfBVowel = 0;
        int half = n/2;
        for(int index = 0; index < n; index ++){
            char ch = s.charAt(index);
            boolean isVowel = isVowel(ch);
            if(index < half){
                if(isVowel) numberOfAVowel++;
            }else{
                if(isVowel) numberOfBVowel++;
            }
        }


        return numberOfAVowel == numberOfBVowel;
    }


    private static boolean isVowel(char ch){
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch== 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')   return true;
        return false;
    }
}
