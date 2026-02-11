/*
Problem: Clear Digits

Approach:
- Use a stack to process characters.
- Traverse each character in the string.
- If the character is a digit:
  - Pop the last character from the stack (if not empty).
- If the character is a letter:
  - Push it onto the stack.
- Build the final string from the remaining stack elements.

Why it works:
- Each digit removes the closest previous non-digit character.
- Stack follows LIFO order, which naturally supports this behavior.

Time Complexity: O(n)
Space Complexity: O(n)
*/

class Solution {
    public String clearDigits(String s) {
        Stack <Character> st = new Stack<>();
        for(char c : s.toCharArray()){
            if(c >= '0' && c<='9'){
                if(!st.isEmpty()){
                    st.pop();
                }
            }
            else{
                st.push(c);
            }
        }
        StringBuilder result = new StringBuilder();
        for(char c : st){
            result.append(c);
        }
        return result.toString();
    }
}
