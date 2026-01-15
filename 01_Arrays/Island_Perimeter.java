/*
Problem: Island Perimeter

Approach:
- Traverse the entire grid.
- For every land cell (value 1), start by adding 4 to the perimeter.
- If the top neighbor is also land, subtract 2 (shared edge).
- If the left neighbor is also land, subtract 2 (shared edge).
- This avoids double-counting shared borders.

Time Complexity: O(rows × columns)
Space Complexity: O(1)
*/

class Solution {
    public int islandPerimeter(int[][] grid) {
        int perimeter = 0;
        int rows = grid.length;
        int columns = grid[0].length;
        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                if(grid[i][j]==1){
                    perimeter += 4;
                    if(i > 0 && grid[i-1][j]==1){
                        perimeter -= 2;
                    }
                    if(j > 0 && grid[i][j-1]==1){
                        perimeter -=2;
                    }
                }
            }
        }
        return perimeter;
    }
}
