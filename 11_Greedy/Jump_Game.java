/*
Problem: Jump Game

Approach:
- Keep track of the farthest index that can be reached so far.
- Traverse the array from left to right.
- If the current index is greater than the maximum reachable index,
  it means we cannot move further → return false.
- Update the maximum reachable index at each step.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public boolean canJump(int[] nums) {
        int maxReach = 0;
        for(int i=0; i<nums.length; i++){
            if(i > maxReach){
                return false;
            }
            maxReach = Math.max(maxReach, i+nums[i]);
        }
        return true;
    }
}
