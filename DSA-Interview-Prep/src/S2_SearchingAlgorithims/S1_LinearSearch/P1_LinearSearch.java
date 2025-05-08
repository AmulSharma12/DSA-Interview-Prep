package S2_SearchingAlgorithims.S1_LinearSearch;

import java.util.Scanner;

//find if any element x exists or not - return index or -1
public class P1_LinearSearch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];

        for(int ind = 0; ind <size; ind++){
            arr[ind] = sc.nextInt();
        }


        int targetIndex = linearSearch(arr, 4, size);
        System.out.println(arr[targetIndex] + " found at index " + targetIndex);
    }

    private static int linearSearch(int[] nums, int target, int size){
        for(int index = 0; index < size; index++){
            if(nums[index] == target)   return index;
        }

        return -1;  //if not found the target returning the index -1
    }
}
