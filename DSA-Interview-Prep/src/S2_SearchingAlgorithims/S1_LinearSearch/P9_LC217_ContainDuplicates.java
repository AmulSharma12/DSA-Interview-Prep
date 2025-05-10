package S2_SearchingAlgorithims.S1_LinearSearch;

import java.util.Arrays;

public class P9_LC217_ContainDuplicates {
    public static void main(String[] args){
        //call from here...
    }

    private static boolean containsDuplicate(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        for(int index = 0; index < n-1; index++){
            if(nums[index] == nums[index+1])    return true;
        }

        return false;
    }
}
