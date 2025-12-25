/*
Problem: Subarray Sum Equals K

Approach: Brute Force (Nested Loops)
- Use two loops to consider every possible subarray
- For each starting index i, keep adding elements until the end
- Check if the current subarray sum equals k
- If yes, increment the count

This checks all possible subarrays directly.

Time Complexity: O(n²)
Space Complexity: O(1)
*/

class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        for(int i=0; i<nums.length; i++){
            int sum = 0;
            for(int j=i; j<nums.length; j++){
                sum += nums[j];
                if(sum==k){
                    count++;
                }
            }
        }
        return count;
    }
}
