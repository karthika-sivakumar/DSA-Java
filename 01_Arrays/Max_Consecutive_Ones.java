/*
Problem: Max Consecutive Ones

Approach:
- Traverse the array once
- Keep a counter for current consecutive 1s
- If the element is 1, increase the count
- Update the maximum whenever current count becomes larger
- If the element is 0, reset the count to 0

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int max = 0;
        for(int num : nums){
            if(num==1){
                count++;
                if(count>max){
                    max = count;
                } // max = Math.max(max,count);
            }
            else{
                count = 0;
            }
        }
        return max;
    }
}
