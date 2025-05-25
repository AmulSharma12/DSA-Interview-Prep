package S2_SearchingAlgorithims.S2_BinarySearch;
import java.util.*;

public class P7_LC33_SearchInRotatedSorted {
    public static void main(String[] args){
        //call from here..,
    }

    private static int search1(int[] nums, int target) {
        int n = nums.length;
        int targetIndex = -1;
        for(int index = 0; index < n; index++){
            if(nums[index] == target) {
                targetIndex = index;
                break;
            }
        }

        return targetIndex;
    }
}
