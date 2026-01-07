/*
Problem: Find the Town Judge

Approach:
- Use two arrays:
  - One to count how many people each person trusts.
  - Another to count how many people trust each person.
- For each trust pair (a, b):
  - Increment the count for person a (they trust someone).
  - Increment the count for person b (they are trusted by someone).
- The town judge:
  - Trusts nobody → trust count is 0.
  - Is trusted by everyone else → trusted count is n - 1.
- Return the person who satisfies both conditions.

Time Complexity: O(n + m)
Space Complexity: O(n)
where m is the number of trust relationships.
*/

class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] findt1 = new int[n+1];
        int[] findt2 = new int[n+1];
        for(var t : trust){
            int a = t[0], b = t[1];
            findt1[a]++;
            findt2[b]++;
        }
        for(int i=1; i<=n; i++){
            if(findt1[i]==0 && findt2[i]==n-1){
                return i;
            }
        }
        return -1;
    }
}
