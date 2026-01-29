/*
Problem: Rotate String

Approach:
- If the lengths of both strings are different, return false.
- Generate all possible rotations of the original string.
- For each rotation, check if it matches the goal string.
- If any rotation matches, return true.

Why it works:
- Rotating a string means moving characters from the front to the end.
- Trying all rotations guarantees that the correct one will be found if it exists.

Time Complexity: O(n^2)
Space Complexity: O(n)
*/

class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length())
          return false;
        for(int i=0; i<s.length(); i++){
            String rotated = s.substring(i) + s.substring(0,i);
            if(rotated.equals(goal)){
                return true;
            }
        }
        return false;
    }
}
