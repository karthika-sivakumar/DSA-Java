/*
Problem: Merge Two Sorted Lists

Approach:
- Use a start node to simplify head handling.
- Maintain a end pointer to build the merged list.
- Compare nodes from both lists:
  - Attach the smaller node to the merged list.
  - Move the corresponding list pointer forward.
- Continue until one list becomes empty.
- Attach the remaining nodes from the non-empty list.

Why it works:
- Both lists are already sorted, so choosing the smaller node preserves order.
- Reusing existing nodes avoids extra space usage.

Time Complexity: O(n + m)
Space Complexity: O(1)
*/

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null){
            return list2;
        }
        if(list2==null){
            return list1;
        }
        ListNode start = new ListNode(-1);
        ListNode end = start;
        ListNode a = list1;
        ListNode b = list2;
        while(a!=null && b!=null){
            if(a.val <= b.val){
                end.next = a;
                a = a.next;
            }
            else{
                end.next = b;
                b = b.next;
            }
            end = end.next;
        }
        if(a!=null){
            end.next = a;
        }
        else if(b!=null){
            end.next = b;
        }
        ListNode newHead = start.next;
        return newHead;
    }
}
