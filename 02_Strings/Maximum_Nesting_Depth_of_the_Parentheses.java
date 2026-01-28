/*
Problem: Maximum Nesting Depth of the Parentheses

Approach:
- Use a counter to track the current depth of parentheses.
- Increment the counter when '(' is encountered.
- Decrement the counter when ')' is encountered.
- Keep updating the maximum depth during traversal.

Why it works:
- The nesting depth is equal to the maximum number of open parentheses
  at any point in the string.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public int maxDepth(String s) {
        int p = 0;
        int res = 0;
        for(char c : s.toCharArray()){
            if(c=='(')
              p++;
            else if(c==')')
              p--;
            res = Math.max(p,res);
        }
        return res;
    }
}
