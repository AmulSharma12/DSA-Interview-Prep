package S2_SearchingAlgorithims.S2_BinarySearch;

public class P2_LowerBound {
    public static void main(String[] args){
        //call from here...
    }

    //LowerBound is the index such that element >= target
    private static int lowerBound(int[] nums, int n, int target){
        int lowerBound = n;     //if all element is lesser than target then my potential index will be the last index that is after n-1 index
        int startIndex = 0;
        int endIndex = n-1;

        while(startIndex <= endIndex){
            int midIndex = startIndex + (endIndex  - startIndex)/2;
            if(nums[midIndex] >= target)    //either we found target or not will have to look at the lowest possible index
            {
                lowerBound = midIndex;
                endIndex = midIndex - 1;
            }else{
                startIndex = midIndex + 1;
            }
        }

        return n;
    }

}
