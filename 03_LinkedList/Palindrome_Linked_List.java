/*
Problem: Palindrome Linked List

Approach:
- Traverse the linked list and store values in an ArrayList.
- Use two pointers (left and right) to compare elements.
- Move pointers inward while checking for equality.
- If any mismatch occurs, return false.

Why it works:
- A palindrome reads the same forward and backward.
- Converting to a list allows easy index-based comparison.

Time Complexity: O(n)
Space Complexity: O(n)
*/

class Solution {
    public boolean isPalindrome(ListNode head) {
        List<Integer> arr = new ArrayList<>();
        while(head != null){
            arr.add(head.val);
            head = head.next;
        }
        int left = 0;
        int right = arr.size()-1;
        while(left < right){
            if(!arr.get(left).equals(arr.get(right))){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
