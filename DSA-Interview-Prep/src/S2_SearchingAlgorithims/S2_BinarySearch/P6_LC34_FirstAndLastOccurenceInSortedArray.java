package S2_SearchingAlgorithims.S2_BinarySearch;

public class P6_LC34_FirstAndLastOccurenceInSortedArray {
    public static void main(String[] args){
        //call from here...
    }

    public static int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int lowerBound = lowerBound(nums, nums.length, target);
        if(lowerBound == n || nums[lowerBound] != target)   return new int[]{-1,-1};
        return new int[]{lowerBound , upperBound(nums, n, target) - 1};
    }

    private static int upperBound(int[] nums, int n, int target){
        int startIndex = 0;
        int endIndex = n-1;
        int ans = n;
        while(startIndex <= endIndex){
            int midIndex = startIndex + (endIndex - startIndex)/2;
            if(nums[midIndex] > target){
                ans = midIndex;
                endIndex = midIndex - 1;
            }else{
                startIndex = midIndex + 1;
            }
        }

        return ans;
    }

    private static int lowerBound(int[] nums, int n, int target){
        int startIndex = 0;
        int endIndex = n-1;
        int ans = n;
        while(startIndex <= endIndex){
            int midIndex = startIndex + (endIndex - startIndex)/2;
            if(nums[midIndex] >= target){
                ans = midIndex;
                endIndex = midIndex - 1;
            }else{
                startIndex = midIndex + 1;
            }
        }

        return ans;
    }
}
