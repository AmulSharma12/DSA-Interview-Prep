package S2_SearchingAlgorithims.S2_BinarySearch;

public class P12_NumberOfRotationInRotatedSortedArray {
    public static void main(String[] args){
        //call from here...
    }

    //Optimised one
    private static int findNumberOfRotationInRotatedSortedArray(int[] nums) {
        int n = nums.length;
        int startIndex = 0;
        int endIndex = n-1;

        while(startIndex < endIndex){
            int midIndex = startIndex + (endIndex - startIndex)/2;
            if(nums[midIndex] < nums[endIndex]){
                endIndex = midIndex;
            }else{
                startIndex = midIndex + 1;
            }
        }

        //both startIndex & lowIndex points to the smallest element
        //and the smallest index tells that that much array is rotated if
        //minimum elemnet at 0 index means 0 rotation  1index-> 1 rotation   nIndex -> n rotation
        return startIndex;
    }
}
