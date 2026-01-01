/*
Problem: Valid Palindrome

A palindrome reads the same forward and backward
after removing non-alphanumeric characters and ignoring case.

Approach:
- Use two pointers starting from the beginning and end of the string
- Skip characters that are not letters or digits
- Compare characters after converting them to lowercase
- If any mismatch occurs, return false
- If all characters match, return true

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        while(i<j){
            if(!Character.isLetterOrDigit(s.charAt(i))){
                i++;
            }
            else if(!Character.isLetterOrDigit(s.charAt(j))){
                j--;
            }
            else if(Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))){
                return false;
            }
            else{
                i++;
                j--;
            }
        }
        return true;
    }
}
