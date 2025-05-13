package S2_SearchingAlgorithims.S2_BinarySearch;

public class P1_LC704_BinarySearch {
    public static void main(String[] args){
        //call from here...
    }

    private static int search(int[] nums, int target) {
        int n = nums.length;
        int startIndex = 0;
        int endIndex = n-1;

        while(startIndex <= endIndex){
            int midIndex = startIndex + (endIndex - startIndex)/2;
            if(nums[midIndex] == target)  return midIndex;
            else if(target > nums[midIndex])    startIndex = midIndex + 1;
            else endIndex = midIndex - 1;
        }

        return -1;
    }
}
