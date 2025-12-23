/*
Problem: Evaluate Reverse Polish Notation

Approach: Stack-Based Evaluation
- Traverse each token in the given array
- If the token is a number, push it onto the stack
- If the token is an operator (+, -, *, /):
    - Pop the first element (represents the right operand)
    - Pop the second element (represents the left operand)
    - Apply the operator as: left operator right
    - Push the computed result back onto the stack
- After processing all tokens, the stack contains the final result

Note:
- Operand order is important for subtraction and division
- In this implementation, the result is calculated using (secondPop - firstPop)

Time Complexity: O(n), where n is the number of tokens
Space Complexity: O(n), due to the stack used
*/

class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for(int i=0; i<tokens.length; i++){
            if(tokens[i].equals("+")){
                st.push(st.pop()+st.pop());
            }
            else if(tokens[i].equals("*")){
                st.push(st.pop()*st.pop());
            }
            else if(tokens[i].equals("-")){
                int a = st.pop();
                int b = st.pop();
                st.push(b-a);
            }
            else if(tokens[i].equals("/")){
                int a = st.pop();
                int b = st.pop();
                st.push(b/a);
            }
            else{
                st.push(Integer.parseInt(tokens[i]));
            }
        }
        return st.pop();
    }
}
