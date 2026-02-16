/*
Problem: Search Insert Position

Approach:
- Traverse the array from the beginning.
- Check if current element is greater than or equal to target.
- If found, return the current index.
- If no such element exists, return array length (insert at end).

Why it works:
- The array is sorted, so the correct position is the first index
  where element is >= target.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public int searchInsert(int[] nums, int target) {
        int i;
        for(i=0; i<nums.length; i++){
            if(nums[i]>=target){
                return i;
            }
        }
        return nums.length;
    }
}
