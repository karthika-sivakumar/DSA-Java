/*
Problem: Remove Duplicates from Sorted Array

Approach: Two Pointer Technique
- Since the array is already sorted, duplicate elements appear next to each other
- Use one pointer to track the position of the last unique element
- Traverse the array with another pointer
- When a new (different) element is found, place it at the next position
- Return the count of unique elements

The first k elements of the array will contain the unique values

Time Complexity: O(n), where n is the length of the array
Space Complexity: O(1), as the modification is done in-place
*/

class Solution {
    public int removeDuplicates(int[] nums) {
        int ptr = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[ptr]!=nums[i]){
                nums[++ptr] = nums[i];
            }
        }
        return ptr+1;
    }
}
