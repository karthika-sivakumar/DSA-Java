/*
Problem: Climbing Stairs 

Approach:
- This problem follows the Fibonacci pattern.
- Ways to reach step n = ways to reach (n-1) + ways to reach (n-2).
- Use two variables to store previous results instead of extra array.

Why it works:
- At each step, you can climb either 1 or 2 steps.
- So total ways depend on the previous two steps.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public int climbStairs(int n) {
        if(n<=2) return n;
        int a = 1, b = 2;
        for(int i=3; i<=n; i++){
            int c = a+b;
            a = b;
            b = c;
        }
        return b;
    }
}
