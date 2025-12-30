/*
Problem: Matrix Diagonal Sum

Approach:
- Traverse the matrix once
- Add the primary diagonal element mat[i][i]
- Add the secondary diagonal element mat[i][n - i - 1]
- If the matrix size is odd, subtract the middle element once
  because it gets added twice

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public int diagonalSum(int[][] mat) {
        int n = mat.length;
        int sum = 0;
        for(int i=0; i<n; i++){
            sum += mat[i][i];
            sum += mat[i][n-i-1];
        }
        if(n%2!=0){
            sum -= mat[n/2][n/2];
        }
        return sum;
    }
}
