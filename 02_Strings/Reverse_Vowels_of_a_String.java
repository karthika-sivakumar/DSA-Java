/*
Problem: Reverse Vowels of a String

Approach:
- Convert the string into a character array.
- Use two pointers:
  - Left pointer moves forward from the beginning.
  - Right pointer moves backward from the end.
- Move the left pointer forward until a vowel is found.
- Move the right pointer backward until a vowel is found.
- Swap the vowels at both pointers.
- Continue moving forward and backward until the pointers cross.

Why it works:
- Only vowels are reversed while other characters stay in place.
- Forward and backward traversal ensures efficient swapping.

Time Complexity: O(n)
Space Complexity: O(n)
*/

class Solution {
    public String reverseVowels(String s) {
        char[] c = s.toCharArray();
        int l = 0;
        int r = c.length - 1;
        String vowels = "aeiouAEIOU";
        while(l < r){
            while(l<r && vowels.indexOf(c[l])==-1){
                l++;
            }
            while(l<r && vowels.indexOf(c[r])==-1){
                r--;
            }
            char temp = c[l];
            c[l] = c[r];
            c[r] = temp;
            l++;
            r--;
        }
        return new String(c);
    }
}
