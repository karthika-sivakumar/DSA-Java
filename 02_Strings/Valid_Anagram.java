/*
Problem: Valid Anagram

An anagram means both strings contain the same characters
with the same frequency, but possibly in a different order.
Example: "listen" and "silent"

Approach:
- If the lengths of both strings are different, they cannot be anagrams
- Use an integer array of size 26 to count characters
- For each index:
    - Increase count for the character in string s
    - Decrease count for the character in string t
- If both strings are anagrams, all values in the count array will be zero
- If any value is not zero, return false

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        int []count = new int[26];
        for(int i=0; i<s.length(); i++){
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }
        for(int val : count){
            if(val != 0){
                return false;
            }
        }
        return true;
    }
}
