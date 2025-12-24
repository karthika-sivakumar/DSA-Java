/*
Problem: Rotate Array

Approach: Reverse Method
- Rotating the array to the right by k steps can be done using three reversals
- First, reverse the entire array
- Then reverse the first k elements
- Finally, reverse the remaining n - k elements
- This rearranges the array into the required rotated order

Time Complexity: O(n), where n is the length of the array
Space Complexity: O(1), as the rotation is done in-place
*/

class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k %= n;
        reverse(nums, 0, n-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, n-1);
    }
    public void reverse(int[] nums, int start, int end){
        while(start<end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
