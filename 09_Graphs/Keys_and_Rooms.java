/*
Problem: Keys and Rooms

Approach:
- Treat each room as a node in a graph.
- Use DFS starting from room 0.
- Mark rooms as visited when they are entered.
- From each room, use the keys to visit connected rooms.
- After DFS, check if all rooms are visited.

Time Complexity: O(N + E)
- N = number of rooms
- E = total number of keys

Space Complexity: O(N)
- Visited array + recursion stack
*/

class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n = rooms.size();
        boolean[] visited = new boolean[n];
        dfs(0,rooms,visited);
        for(boolean v : visited){
            if(!v)
              return false;
        }
        return true;
    }
    private void dfs(int room, List<List<Integer>> rooms, boolean[] visited){
        if(visited[room]){
            return;
        }
        visited[room] = true;
        for(int key : rooms.get(room)){
            dfs(key, rooms, visited);
        }
    }
}
