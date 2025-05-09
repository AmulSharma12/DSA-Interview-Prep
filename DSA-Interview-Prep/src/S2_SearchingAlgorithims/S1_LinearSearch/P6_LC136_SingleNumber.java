package S2_SearchingAlgorithims.S1_LinearSearch;

import java.util.HashSet;
import java.util.Set;

public class P6_LC136_SingleNumber {
    public static void main(String[] args){
        //call from here...
    }


    private static int singleNumber(int[] nums) {
        //scan through array if any element exists we should remove it as it appears twice
        //first it will add and then remove it in this way only elmenet left out the single one as they
        //dont get their pair
        Set<Integer> set = new HashSet<Integer>();
        for(int currentElement : nums){
            if(set.contains(currentElement)){
                set.remove(currentElement);
            }else{
                set.add(currentElement);
            }
        }

        return set.iterator().next();
    }
}
