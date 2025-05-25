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

    public static int search(int[] nums, int target) {
        int n = nums.length;
        int startIndex = 0;
        int endIndex = n-1;

        while(startIndex <= endIndex){
            int midIndex = startIndex + (endIndex - startIndex)/2;
            if(nums[midIndex] == target)    return midIndex;

            //check the sorted portion - right portion sorted or else left portion is sorted
            if(nums[midIndex] <= nums[endIndex]){
                //check the target lies in sorted portion or nott
                if(nums[midIndex] <= target && target <= nums[endIndex]) startIndex = midIndex + 1;
                else endIndex = midIndex - 1;
            }else{
                if(nums[startIndex] <= target && target <= nums[midIndex])  endIndex = midIndex - 1;
                else startIndex = midIndex + 1;
            }
        }
        return -1;
    }
}
