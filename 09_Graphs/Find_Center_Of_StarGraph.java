/*
Problem: Find Center of Star Graph

Approach:
- In a star graph, the center node appears in every edge.
- So the center must be common between the first two edges.
- Compare the first edge with the second edge:
  - If edges[0][0] matches any node in edges[1], it is the center.
  - Otherwise, edges[0][1] is the center.

Why it works:
- A star graph has exactly one node connected to all others.
- Checking just the first two edges is enough to find that common node.

Time Complexity: O(1)
Space Complexity: O(1)
*/

class Solution {
    public int findCenter(int[][] edges) {
        if(edges[0][0]==edges[1][0] || edges[0][0]==edges[1][1]){
            return edges[0][0];
        }
        return edges[0][1];
    }
}
