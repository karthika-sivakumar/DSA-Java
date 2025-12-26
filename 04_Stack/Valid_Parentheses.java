/*
Problem: Valid Parentheses

Approach: Stack
- Create a stack to store opening brackets
- Traverse each character in the string
- If the character is an opening bracket '(', '{', '[', push it onto the stack
- If the character is a closing bracket:
    - If the stack is empty, return false (no matching opening bracket)
    - Check whether the top of the stack matches the current closing bracket
    - If it does not match, return false
    - Otherwise, pop the matching opening bracket
- After processing all characters, the stack must be empty
  for the parentheses to be valid

Time Complexity: O(n)
Space Complexity: O(n)
*/

class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(char c : s.toCharArray()){
            if(c=='(' || c=='{' || c=='['){
                st.push(c);
            }
            else if(c==')' || c=='}' || c==']'){
                if(st.isEmpty()){
                    return false;
                }
                char top = st.peek();
                if((c==')'&& top!='(') || (c==']' && top!='[') || (c=='}' && top!='{')){
                    return false;
                }
                st.pop();
            }
        }
        return st.isEmpty();
    }
}
