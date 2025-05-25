package S2_SearchingAlgorithims.S2_BinarySearch;
import java.util.*;
public class P8_LC81_SearchInRotatedSorted2 {
    public static void main(String[] args){
        //call from here...
    }


    private static boolean search(int[] nums, int target) {
        int n = nums.length;
        int startIndex = 0;
        int endIndex = n - 1;

        while(startIndex <= endIndex){
            int midIndex = startIndex + (endIndex - startIndex)/2;
            if(nums[midIndex] == target)    return true;
            if(nums[startIndex] == nums[midIndex] && nums[midIndex] == nums[endIndex]){
                startIndex++;
                endIndex--;
                continue;
            }

            if(nums[midIndex] <= nums[endIndex]){
                if(nums[midIndex] <= target && target <= nums[endIndex])    startIndex = midIndex + 1;
                else endIndex = midIndex - 1;
            }else{
                if(nums[startIndex] <= target && target <= nums[midIndex])  endIndex = midIndex - 1;
                else startIndex = midIndex + 1;
            }
        }

        return false;
    }
}
