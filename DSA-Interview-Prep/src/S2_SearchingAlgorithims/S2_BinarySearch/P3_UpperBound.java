package S2_SearchingAlgorithims.S2_BinarySearch;

public class P3_UpperBound {
    public static void main(String[] args){
        //call from here...
    }

    //Upper Bound - smallest index such that element > target
    private static int upperBound(int[] nums, int size, int target){
        int upperBound = size;     //if all element is lesser than target then my potential index will be the last index that is after n-1 index
        int startIndex = 0;
        int endIndex = size-1;

        while(startIndex <= endIndex){
            int midIndex = startIndex + (endIndex  - startIndex)/2;
            if(nums[midIndex] > target)    //if i found any elment that is equivalent to target that can be my potential ans
            {
                upperBound = midIndex;
                endIndex = midIndex - 1;
            }else{
                startIndex = midIndex + 1;
            }
        }

        return upperBound;
    }
}
