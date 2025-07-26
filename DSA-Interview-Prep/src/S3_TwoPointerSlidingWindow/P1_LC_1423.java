package S3_TwoPointerSlidingWindow;
//https://leetcode.com/problems/maximum-points-you-can-obtain-from-cards/description/

public class P1_LC_1423 {
    public static void main(String[] args){
        //call from here...
    }

    public static int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int leftSum = 0;
        int rightSum = 0;
        int maxPoints = 0;

        //finding initial sum if i pick from the begining the k elements
        for(int index = 0; index < k ; index++) leftSum += cardPoints[index];
        maxPoints = leftSum;

        //now will iterate and exclude everytime one element from the left portion and including from right portion
        int leftIndex = k-1;
        int rightIndex = n-1;

        while(leftIndex >= 0){
            leftSum -= cardPoints[leftIndex--];
            rightSum += cardPoints[rightIndex--];
            maxPoints = Math.max(maxPoints, leftSum + rightSum);
        }

        return maxPoints;
    }
}
