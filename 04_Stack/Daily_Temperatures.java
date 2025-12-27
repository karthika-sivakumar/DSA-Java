/*
Problem: Daily Temperatures

Approach: Monotonic Stack (Increasing Temperature Index Stack)

Use a stack to keep track of indices whose warmer day is not found yet.
When a higher temperature appears, pop the index and calculate the
difference in days. Remaining indices have no warmer day, so result is 0.

Time Complexity: O(n)
Space Complexity: O(n)
*/


class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int []ans = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i=0; i<n; i++){
            while(!st.isEmpty() && temperatures[i] > temperatures[st.peek()]){
                int idx = st.pop();
                ans[idx] = i - idx;
            }
            st.push(i);
        }
        return ans;
    }
}
