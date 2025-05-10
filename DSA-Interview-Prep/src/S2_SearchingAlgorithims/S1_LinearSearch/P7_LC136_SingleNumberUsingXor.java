package S2_SearchingAlgorithims.S1_LinearSearch;

public class P7_LC136_SingleNumberUsingXor {
    public static void main(String[] args){
        //call from here...
    }

    private static int singleNumber(int[] nums) {
        int n = nums.length;
        int result = 0;

        //xor of two same element equalise to zero => it means the duplicate will get eliminated
        //xor of elment ^ 0 = element   it means the single element get extracted
        for(int index = 0; index < n; index++){
            result ^= nums[index];
        }

        return result;
    }
}
