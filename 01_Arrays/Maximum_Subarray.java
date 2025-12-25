/*
Problem: Maximum Subarray

Approach: Kadane’s Algorithm
- Traverse the array while keeping track of:
  1. currentSum → maximum sum ending at the current index
  2. maxSum → maximum subarray sum found so far
- At each step, decide whether to:
  - extend the previous subarray, or
  - start a new subarray from the current element
- Update maxSum whenever a larger sum is found

This efficiently finds the maximum possible sum of a contiguous subarray.

Time Complexity: O(n), where n is the length of the array
Space Complexity: O(1)
*/

class Solution {
    public int maxSubArray(int[] nums) {
       int currentSum = 0, maxSum = nums[0];
       int start = 0, end = 0, ts = 0;
       for(int i=0; i<nums.length; i++)
       {
        currentSum+=nums[i];
        if(currentSum > maxSum){
            start = ts;
            maxSum = currentSum;
            end = i;
        }
        if(currentSum<0){
            currentSum = 0;
            ts = i+1;
        }
       }
       return maxSum;
    }
}
