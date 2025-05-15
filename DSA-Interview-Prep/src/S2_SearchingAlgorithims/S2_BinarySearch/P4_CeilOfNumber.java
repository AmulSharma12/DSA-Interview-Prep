package S2_SearchingAlgorithims.S2_BinarySearch;
import java.util.Arrays;

public class P4_CeilOfNumber {
    public static void main(String[] args){
        //call from here...
        int[] nums = new int[]{2,3,4,56,90,100};
        int ceil = ceil(nums, nums.length, 1);
        System.out.println(Arrays.toString(nums));
        System.out.println("ceil " + ceil);
    }

    //ceil is the element such that  - smaller element >= target
    //if element doesn't exist then its greater element
    private static int ceil(int[] nums, int size, int target){
        int startIndex = 0;
        int endIndex = size - 1;
        int ans = -1;

        while(startIndex <= endIndex){
            int midIndex = startIndex + (endIndex - startIndex)/2;
            if(nums[midIndex] >= target){
                ans = nums[midIndex];
                endIndex = midIndex -1;
            }else{
                startIndex = midIndex +1 ;
            }
        }

        return ans;
    }

}
