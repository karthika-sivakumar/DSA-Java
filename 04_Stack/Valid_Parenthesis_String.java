/*
Problem: Valid Parenthesis String

Approach: Greedy using Two Stacks
- Use one stack to store indices of '(' characters
- Use another stack to store indices of '*' characters

Step 1: Traverse the string
- If '(' → push its index into leftStack
- If '*' → push its index into starStack
- If ')' :
    - First try to match it with a '(' from leftStack
    - If not available, use a '*' from starStack
    - If neither exists → return false

Step 2: Match remaining '(' with '*'
- A '*' can act as ')' only if it appears AFTER '('
- While both stacks are not empty:
    - If index of '(' < index of '*', they can form a valid pair
    - Otherwise, return false

Step 3:
- If all '(' are matched, return true

Time Complexity: O(n)
Space Complexity: O(n)
*/


class Solution {
    public boolean checkValidString(String s) {
        Stack<Integer> leftstack = new Stack<>();
        Stack<Integer> starstack = new Stack<>();
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c=='('){
                leftstack.push(i);
            }
            else if(c=='*'){
                starstack.push(i);
            }
            else{
                if(!leftstack.isEmpty()){
                    leftstack.pop();
                }
                else if(!starstack.isEmpty()){
                    starstack.pop();
                }
                else{
                    return false;
                }
            }
        }
        while(!leftstack.isEmpty() && !starstack.isEmpty()){
            if(leftstack.peek() < starstack.peek()){
                leftstack.pop();
                starstack.pop();
            }
            else{
                return false;
            }
        }
        return leftstack.isEmpty();
    }
}
