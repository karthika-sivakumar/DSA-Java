/*
Problem: To Lower Case

Approach:
- Convert the string into a character array.
- Traverse each character in the array.
- If the character is an uppercase letter (A–Z),
  convert it to lowercase by adding 32 to its ASCII value.
- Convert the character array back to a string and return it.

Why it works:
- In ASCII, the difference between uppercase and lowercase letters is 32.
- Direct character manipulation avoids using built-in methods.

Time Complexity: O(n)
Space Complexity: O(n)
*/

class Solution {
    public String toLowerCase(String s) {
        char[] a = s.toCharArray();
        for(int i=0; i<a.length; i++){
            if(a[i]>='A' && a[i]<='Z'){
                a[i] = (char)(a[i]+32);
            }
        }
        return new String(a);
    }
}
