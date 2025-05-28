package S2_SearchingAlgorithims.S2_BinarySearch;


//540. Single Element in a Sorted Array
//https://leetcode.com/problems/single-element-in-a-sorted-array/description/
public class P13_LC540_SingleElementInSortedArray {
    public static void main(String[] args){
        //call from here...
    }

    private static int singleNonDuplicate(int[] nums) {
        int xor = 0;
        for(int element: nums) xor ^= element;
        return xor;
    }
}
