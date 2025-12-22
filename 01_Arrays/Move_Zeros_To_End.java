/*
Approach: Two Pointer Technique (Move Zeros to End)

- Pointer 'nonZero' is used to traverse the array
- Pointer 'zero' tracks the position where the next non-zero element should be placed
- When nums[nonZero] is non-zero, it is swapped with nums[zero]
- After placing a non-zero element, both pointers are incremented
- If nums[nonZero] is zero, only the traversal pointer is incremented

This preserves the order of non-zero elements and moves all zeros to the end.

Time Complexity: O(n)
Space Complexity: O(1)
*/


class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        if(n==0 || n==1){
            return;
        }
        int nonZero = 0 , zero = 0;
        while(nonZero < n){
            if(nums[nonZero]!=0){
                int temp = nums[nonZero];
                nums[nonZero] = nums[zero];
                nums[zero] = temp;
                nonZero++;
                zero++;
            }
            else{
                nonZero++;
            }
        }
    }
}
