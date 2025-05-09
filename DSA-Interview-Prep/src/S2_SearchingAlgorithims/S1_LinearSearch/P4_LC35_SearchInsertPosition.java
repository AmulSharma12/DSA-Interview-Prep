package S2_SearchingAlgorithims.S1_LinearSearch;

public class P4_LC35_SearchInsertPosition {
    public static void main(String[] args){
        //call from here...
    }


    private static int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int targetIndex = n;    //because maybe the targetIndex lies should be greater than my last element

        for(int index = 0; index < n; index++){
            //either the target index will found or the index - that has element greater than target element
            if(nums[index] >= target){
                targetIndex = index;
                break;
            }
        }

        return targetIndex;
    }
}
