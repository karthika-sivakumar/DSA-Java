/*
Problem: First Unique Character in a String

Approach:
- Convert the string into a character array.
- Use a frequency array to count how many times each character appears.
- Traverse the string again and return the index of the first character
  whose frequency is exactly 1.
- If no such character exists, return -1.

Time Complexity: O(n)
Space Complexity: O(1)  // fixed-size frequency array
*/

class Solution {
    public int firstUniqChar(String s) {
        char[] c = s.toCharArray();
        int n = c.length;
        int []freq = new int[256];
        for(int i=0; i<n; i++){
            freq[c[i]]++;
        }
        for(int i=0; i<n; i++){
            if(freq[c[i]]==1){
                return i;
            }
        }
        return -1;
    }
}
