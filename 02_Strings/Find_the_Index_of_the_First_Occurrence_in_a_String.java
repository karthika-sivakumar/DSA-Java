/*
Problem: Find the Index of the First Occurrence in a String

Approach:
- If the needle is empty, return 0.
- Use two pointers:
  - `p` for the haystack
  - `q` for the needle
- Compare characters one by one.
- If characters match, move both pointers forward.
- If a mismatch occurs, reset the needle pointer and shift the haystack pointer.
- When all characters of the needle are matched, return the starting index.

Why it works:
- The algorithm checks every possible starting position in the haystack.
- Resetting pointers ensures no valid match is skipped.

Time Complexity: O(n * m)
Space Complexity: O(1)
*/

class Solution {
    public int strStr(String haystack, String needle) {
        if("".equals(needle)){
            return 0;
        }
        int len1 = haystack.length();
        int len2 = needle.length();
        int p = 0, q = 0;
        while(p < len1){
            if(haystack.charAt(p)==needle.charAt(q)){
                if(len2 == 1){
                    return p;
                }
                p++;
                q++;
            }
            else{
                p -= q - 1;
                q = 0;
            }
            if(q==len2){
                return p-q;
            }
        }
        return -1;
    }
}
