/*
Problem: Missing Number

Approach:
- The numbers should contain all values from 0 to n
- Compute the expected sum using the formula n * (n + 1) / 2
- Compute the actual sum of elements in the array
- The missing number is the difference between expected sum and actual sum

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = 0;
        for(int num : nums){
            sum+=num;
        }
        int total = n*(n+1)/2;
        return total - sum;
    }
}
