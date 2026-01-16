/*
Problem: Running Sum of 1D Array

Approach:
- Traverse the array starting from index 1.
- At each index i, add the value of the previous element (nums[i-1]) to nums[i].
- This builds the cumulative sum step by step.

Important:
- The array is updated in-place.
- The first element remains the same since there is no element before it.
- No extra array is created.

Time Complexity: O(n)
- Each element is processed once.

Space Complexity: O(1)
- No additional space is used.
*/


class Solution {
    public int[] runningSum(int[] nums) {
        for(int i=1; i<nums.length; i++){
            nums[i] += nums[i-1];
        }
        return nums;
    }
}
