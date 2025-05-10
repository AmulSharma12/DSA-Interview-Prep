package S2_SearchingAlgorithims.S1_LinearSearch;

import java.util.HashMap;
import java.util.Map;

public class P8_LC169_MajorityElement {
    public static void main(String[] args){
        //call from here...
    }

    private static int majorityElement(int[] nums) {
        int n = nums.length;
        int targetFrequency = n/2;
        Map<Integer,Integer> map = new HashMap<>();
        for(int index = 0; index < n; index++){
            if(map.containsKey(nums[index])){
                map.put(nums[index], map.get(nums[index]) + 1);
            } else{
                map.put(nums[index], 1);
            }
        }

        int majorityElement = -1;
        for(Map.Entry<Integer,Integer> mp: map.entrySet()){
            if(mp.getValue() > targetFrequency){
                majorityElement = mp.getKey();
                break;
            }
        }

        return majorityElement;
    }
}
