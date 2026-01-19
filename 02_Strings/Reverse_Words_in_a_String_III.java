/*
Problem: Reverse Words in a String III

Approach:
- Convert the string into a character array.
- Traverse the array and identify word boundaries using spaces.
- Reverse each word in-place when a space or end of string is found.
- Use a helper function to reverse characters between two indices.

Why it works:
- Each word is reversed independently without changing word order.
- In-place reversal avoids extra space for each word.

Time Complexity: O(n)
Space Complexity: O(n)
*/

class Solution {
    public String reverseWords(String s) {
        char[] a = s.toCharArray();
        int start = 0;
        for(int end=0; end<=a.length; end++){
            if(end == a.length || a[end]==' '){
                reverse(a,start,end-1);
                start = end+1;
            }
        }
        return new String(a);
    }
    public void reverse(char[] a, int left, int right){
        while(left < right){
            char temp = a[left];
            a[left] = a[right];
            a[right] = temp;
            left++;
            right--;
        }
    }
}
