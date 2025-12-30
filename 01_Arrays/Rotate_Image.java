/*
Problem: Rotate Image (90 degrees clockwise)

Approach:
- First transpose the matrix (swap matrix[i][j] with matrix[j][i])
- Then reverse each row of the matrix

Time Complexity: O(n²)
Space Complexity: O(1)
*/

class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for(int i=0; i<n; i++){
            int left = 0, right = n-1;
            while(left<right){
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            }
        }
    }
}
