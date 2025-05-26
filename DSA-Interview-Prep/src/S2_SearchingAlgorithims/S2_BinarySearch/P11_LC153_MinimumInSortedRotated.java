package S2_SearchingAlgorithims.S2_BinarySearch;
import java.util.*;
//153. Find Minimum in Rotated Sorted Array
//https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/

public class P11_LC153_MinimumInSortedRotated {
    public static void main(String[] args){
        //call from here...
    }


    private static int findMin(int[] nums) {
        int n = nums.length;
        int minimum = nums[0];

        for(int index = 1; index < n; index++){
            if(nums[index] < minimum) minimum = nums[index];
        }


        return minimum;
    }

    //Optimised one
    private static int findMinOptimised(int[] nums) {
        int n = nums.length;
        int startIndex = 0;
        int endIndex = n-1;

        while(startIndex < endIndex){
            int midIndex = startIndex + (endIndex - startIndex)/2;
            if(nums[midIndex] < nums[endIndex]){
                endIndex = midIndex;
            }else{
                startIndex = midIndex + 1;
            }
        }

        //both startIndex & lowIndex points to the smallest element
        return nums[startIndex];
    }
}
