/*
Problem: Concatenation of Array

Approach:
- Create a new array of size 2 * n.
- Copy the original array into the first half.
- Copy the same elements again into the second half.

Time Complexity: O(n)
- Each element is copied twice.

Space Complexity: O(n)
- A new array of size 2 * n is used.
*/

class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] concat = new int[2*n];
        for(int i=0; i<n; i++){
            concat[i] = nums[i];
            concat[i+n] = nums[i];
        }
        return concat;
    }
}
