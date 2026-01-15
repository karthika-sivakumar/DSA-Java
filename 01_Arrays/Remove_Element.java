/*
Problem: Remove Element

Approach:
- Traverse the array using a loop.
- Use a pointer `k` to track how many valid elements are kept.
- When an element is not equal to `val`, copy it to index `k` and increment `k`.
- This places all valid elements at the beginning of the array.

Important:
- The actual size of the array does NOT change.
- Only the first `k` elements are considered valid after the operation.
- Elements beyond index `k - 1` can be ignored.

Time Complexity: O(n)
- Each element is visited once.

Space Complexity: O(1)
- The array is modified in-place without using extra space.
*/

class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] != val){
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}
