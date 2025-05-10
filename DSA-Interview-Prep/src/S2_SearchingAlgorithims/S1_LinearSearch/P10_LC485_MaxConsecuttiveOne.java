package S2_SearchingAlgorithims.S1_LinearSearch;

public class P10_LC485_MaxConsecuttiveOne {
    public static void main(String[] args){
        //call from here...
    }

    private static int findMaxConsecutiveOnes(int[] nums) {
        int max1sCount = Integer.MIN_VALUE;  //for accumulating the max1s track
        int current1sCount = 0; //tracking for particular set of 1s & reseting if found 0 element
        int n = nums.length;
        for(int index = 0; index < n; index++){
            int number = nums[index];
            if(number == 1) current1sCount++;
            else{
                max1sCount = Math.max(max1sCount,current1sCount);
                System.out.println(max1sCount + " - ");
                current1sCount = 0;     //for checking other consecutive number of 1s if they exist
            }
        }

        //checking here too because there mightt be the case that my value not getting update if no zero existt
        max1sCount = Math.max(max1sCount,current1sCount);
        return max1sCount;
    }

}
