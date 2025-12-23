/*
Problem: Baseball Game

Approach: Stack-Based Simulation
- Use a stack to keep track of valid round scores
- Traverse each operation in the input array:
    - If the operation is a number, push it onto the stack
    - If the operation is "C", remove the last valid score
    - If the operation is "D", push double of the last valid score
    - If the operation is "+", push the sum of the last two valid scores
- After processing all operations, sum the values in the stack to get the final score

Time Complexity: O(n), where n is the number of operations
Space Complexity: O(n), due to the stack used to store scores
*/


class Solution {
    public int calPoints(String[] operations) {
        int n = operations.length;
        Stack<Integer> st = new Stack<>();
        for(int i=0; i<n; i++){
            if(operations[i].equals("C")){
                st.pop();
            }
            else if(operations[i].equals("D")){
                st.push(2*(st.peek()));
            }
            else if(operations[i].equals("+")){
                int first = st.pop();
                int second = st.peek();
                st.push(first);
                st.push(first+second);
            }
            else{
                st.push(Integer.parseInt(operations[i]));
            }
        }
        int sum = 0;
        for(int i=0; i<st.size(); i++){
            sum += st.get(i);
        }
        return sum;
    }
}
