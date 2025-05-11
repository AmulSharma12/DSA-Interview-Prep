package S2_SearchingAlgorithims.S1_LinearSearch;

public class P11_LC1550_ThreeConsecutiveOdd {
    public static void main(String[] args){
        //call from here...
    }

    private static boolean threeConsecutiveOdds(int[] arr) {
        int n = arr.length;
        if(n < 3)    return false;

        //looping each element - of array arr
        for(int index = 1; index < n-1; index++){
            boolean current = arr[index] % 2 != 0;
            boolean previous = arr[index-1] % 2 != 0;
            boolean next = arr[index+1] % 2 != 0;
            if(current && previous && next)    return true;
        }

        return false;
    }
}
