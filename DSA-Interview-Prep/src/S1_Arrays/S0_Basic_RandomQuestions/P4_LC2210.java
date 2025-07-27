package S1_Arrays.S0_Basic_RandomQuestions;
//https://leetcode.com/problems/count-hills-and-valleys-in-an-array/description/
public class P4_LC2210 {
    public static void main(String[] args){
        //call from here...
    }

    //2210. Count Hills and Valleys in an Array
    public static int countHillValley(int[] nums) {
        int n = nums.length;
        int count = 0;

        for (int i = 1; i < n - 1; i++) {
            // Skip duplicates by comparing with previous element
            if (nums[i] == nums[i - 1]) continue;

            // Find the closest distinct left value
            int left = i - 1;
            while (left >= 0 && nums[left] == nums[i]) left--;

            // Find the closest distinct right value
            int right = i + 1;
            while (right < n && nums[right] == nums[i]) right++;

            // If either side is out of bounds, skip
            if (left < 0 || right >= n) continue;

            // Check for hill or valley
            if ((nums[i] > nums[left] && nums[i] > nums[right]) ||
                    (nums[i] < nums[left] && nums[i] < nums[right])) {
                count++;
            }
        }

        return count;
    }
}
