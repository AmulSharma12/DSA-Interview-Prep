package S2_SearchingAlgorithims.S1_LinearSearch;

public class P12_LC53_MaximumSubarray {
    public static void main(String[] args){
        //call from here...
    }

    private static int maxSubArray(int[] nums) {
        int n = nums.length;
        int largestSumSubarray = Integer.MIN_VALUE;
        for(int ind1 = 0; ind1 < n; ind1++){
            int currentSum = 0;
            for(int ind2 = ind1; ind2 <n; ind2++){
                currentSum += nums[ind2];
                largestSumSubarray = Math.max(largestSumSubarray, currentSum);
            }
        }

        return largestSumSubarray;
    }
}
