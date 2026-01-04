/*
Problem: Length of Last Word

Approach:
- Traverse the string from the end.
- Skip trailing spaces.
- Count characters of the last word until a space is found.
- Once a space appears after counting characters, return the count.

Why it works:
- The last word is the first continuous sequence of non-space characters
  when scanning from the end.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public int lengthOfLastWord(String s) {
        int count = 0;
        for(int i = s.length()-1; i>=0; i--){
            if(s.charAt(i)!=' '){
                count++;
            }
            else{
                if(count>0){
                    return count;
                }
            }
        }
        return count;
    }
}
