package S2_SearchingAlgorithims.S1_LinearSearch;

import java.util.ArrayList;
import java.util.List;

public class P5_LC448_AllNumberDisappeared {
    public static void main(String[] args){
        //call from here...
    }

    private static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer>   result = new ArrayList<>();
        int n = nums.length;
        boolean[] isExist = new boolean[n];

        //so traverse through element
        for(int index = 0; index < n; index++){
            isExist[nums[index]-1] = true;
        }

        //now add all the element that dont exist in range of 1 to n
        for(int index = 0; index < n; index++){
            if(!isExist[index]) result.add(index+1);
        }
        return result;
    }
}
