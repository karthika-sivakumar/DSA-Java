/*
Problem: Two Sum

Approach:
- Use two nested loops to check every possible pair of elements.
- For each pair (i, j), check if nums[i] + nums[j] equals the target.
- As soon as a valid pair is found, return their indices.

Time Complexity: O(n²)
- Two loops are used to check all pairs.

Space Complexity: O(1)
- No extra data structures are used.
*/

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                if(nums[i] + nums[j] == target){
                    return new int[]{ i, j };
                }
            }
        }
        return new int[]{};
    }
}
