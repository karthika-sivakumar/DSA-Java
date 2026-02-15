/*
Problem: Validate Stack Sequences

Approach:
- Use a stack to simulate push and pop operations.
- Traverse the pushed array and push each element into the stack.
- After each push, check if the top of the stack matches the current element in popped.
- If it matches, pop from stack and move pointer in popped.
- Continue this process until all elements are processed.

Why it works:
- The stack simulation mimics the actual push-pop behavior.
- If sequences are valid, stack will be empty at the end.

Time Complexity: O(n)
Space Complexity: O(n)
*/

class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> st = new Stack<>();
        int j = 0;
        for(int val : pushed){
            st.push(val);
            while(!st.isEmpty() && st.peek() == popped[j]){
                st.pop();
                j++;
            }
        }
        return st.isEmpty();
    }
}
