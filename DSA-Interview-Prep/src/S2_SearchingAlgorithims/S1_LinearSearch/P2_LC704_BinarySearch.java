package S2_SearchingAlgorithims.S1_LinearSearch;

public class P2_LC704_BinarySearch {
    public static void main(String[] args){
        //call from here...
    }

    //using linear search algorithim TC - O(N) SC - O(1)
    private static int search(int[] nums, int target) {
        int n = nums.length;
        int targetIndex = -1;
        for(int index = 0; index < n; index++){
            if(nums[index] == target){
                targetIndex = index;
                break;
            }
        }

        return targetIndex;
    }
}
