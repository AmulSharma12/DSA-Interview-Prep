package S2_SearchingAlgorithims.S2_BinarySearch;
import java.util.Arrays;

public class P5_FloorOfNumber {
    public static void main(String[] args){
        //call from here...
        int[] nums = new int[]{2,3,4,56,90,100};
        int floorValue = floor(nums, nums.length, 101);
        System.out.println(Arrays.toString(nums));
        System.out.println("floorValue - " + floorValue);
    }

    //floor element is the element such that
    //if it exist then it will be the floor value and if it dont the smaller than target will be floor
    //Conculsion -  largest element <= x
    private static int floor(int[] nums, int size, int target){
        int startIndex = 0;
        int endIndex = size - 1;
        int ans = -1;

        while(startIndex <= endIndex){
            int midIndex = startIndex + (endIndex - startIndex)/2;
            if(nums[midIndex] <= target){
                ans = nums[midIndex];
                startIndex = midIndex +1;
            }else{
                endIndex = midIndex -1;
            }
        }

        return ans;
    }

}
