/*
Problem: Largest Odd Number in String

Approach:
- Traverse the string from the end to find the rightmost odd digit.
- Once found, that index marks the end of the largest odd substring.
- Remove leading zeros from the left part if present.
- Return the substring from the first non-zero digit to the odd index.

Why it works:
- A number is odd if its last digit is odd.
- Taking the rightmost odd digit gives the largest possible odd number.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public String largestOddNumber(String num) {
        int ind = -1;
        int i;
        for(i = num.length()-1; i>=0; i--){
            if((num.charAt(i) - '0')%2==1){
                ind = i;
                break;
            }
        }
        if(ind == -1) 
          return "";
        i = 0;
        while(i<=ind && num.charAt(i)=='0')
          i++;
        return num.substring(i, ind+1);
    }
}
