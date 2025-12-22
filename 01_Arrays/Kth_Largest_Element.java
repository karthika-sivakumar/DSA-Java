/*
Problem: Kth Largest Element in an Array

Approach:
- Sort the array in ascending order
- The Kth largest element will be at index (n - k)

Time Complexity: O(n log n)
Space Complexity: O(log n) due to recursion stack in sorting
*/

class Solution {
    public int findKthLargest(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums);
        return nums[n-k];
    }
}
