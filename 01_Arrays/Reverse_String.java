/*
Problem: Reverse String

Approach: Two Pointer Technique
- Initialize two pointers:
    - 'start' at the beginning of the array
    - 'end' at the end of the array
- While start is less than end:
    - Swap the characters at indices start and end
    - Move start forward and end backward
- This reverses the character array in-place without using extra space

Time Complexity: O(n), where n is the length of the array
Space Complexity: O(1)
*/


class Solution {
    public void reverseString(char[] s) {
        int start = 0, end = s.length-1;
        while(start<end){
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        }
    }
}
