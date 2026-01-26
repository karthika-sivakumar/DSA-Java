/*
Problem: Isomorphic Strings

Approach:
- Use two arrays to track the last seen position of characters in both strings.
- Traverse both strings at the same time.
- If the last seen positions of the current characters do not match,
  the strings are not isomorphic.
- Update the last seen position using index + 1 to avoid default zero confusion.

Why it works:
- Ensures a one-to-one mapping between characters of both strings.
- Prevents multiple characters mapping to the same character.

Time Complexity: O(n)
Space Complexity: O(1)
*/


class Solution {
    public boolean isIsomorphic(String s, String t) {
        int[] s1 = new int[256], t1 = new int[256];
        int n = s.length();
        for(int i=0; i<n; i++){
            if(s1[s.charAt(i)] != t1[t.charAt(i)]) 
              return false;
            s1[s.charAt(i)] = i+1;
            t1[t.charAt(i)] = i+1;
        }
        return true;
    }
}
