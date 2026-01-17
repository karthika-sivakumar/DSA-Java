/*
Problem: Plus One

Approach:
- Start from the last digit and try to add 1.
- If the digit is less than 9, increment it and return the array.
- If the digit is 9, set it to 0 and continue moving left.
- If all digits are 9, create a new array with one extra digit.
- Set the first digit to 1 and return the new array.

Key Points:
- Handles carry properly.
- Modifies the array in-place when possible.
- Creates a new array only when required.

Time Complexity: O(n)
Space Complexity: O(n) (only when all digits are 9)
*/

class Solution {
    public int[] plusOne(int[] digits) {
        for(int i=digits.length-1; i>=0; i--){
            if(digits[i] < 9){
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int res[] = new int[digits.length + 1];
        res[0] = 1;
        return res;
    }
}
