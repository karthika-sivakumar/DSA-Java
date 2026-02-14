# Daily Learning Log

## 📅 22 Dec 2025

### Topics Covered
- Arrays
- Two-Pointer Technique

---

### Problems Solved
- Kth Largest Element in an Array (LeetCode)
- Move Zeros to End (LeetCode)

---

### Key Learnings
- Sorting-based solutions result in **O(n log n)** time complexity
- Two-pointer technique using a **traversal pointer** and a **placement pointer**
- In-place swapping using **constant extra space**
- Writing clean, readable comments improves code clarity and understanding
- Properly documenting solutions for GitHub repositories

---

### GitHub Progress
- Added array solutions inside the `Arrays` folder
- Updated `Arrays/README.md` with problem listings
- Added comments explaining the approach and time/space complexity

---

### Notes
- Two-pointer approach preserves the relative order of non-zero elements
- Consistent documentation strengthens problem-solving confidence

---

## 📅 23 Dec 2025

### Topics Covered
- Arrays  
- Stack  

---

### Problems Solved
- Reverse String (Arrays – LeetCode)  
- Evaluate Reverse Polish Notation (Stack – LeetCode)  
- Baseball Game (Stack – LeetCode)  

---

### Key Learnings
- Reverse String:
  - Can be solved using *two-pointer technique*
  - In-place swapping gives *O(1)* extra space  
- Reverse Polish Notation (RPN):
  - Evaluated using a *stack*
  - Operands are pushed to stack
  - Operators pop two elements, apply operation, and push result  
  - Operand order matters (b - a, b / a)  
- Baseball Game:
  - Stack helps track previous valid scores
  - Supports undo (C), double (D), and sum (+) operations  
- Stack-based problems strengthen understanding of:
  - Expression evaluation
  - State tracking  

---

### Notes
- Two-pointer technique is efficient for array manipulation problems  
- Stack is highly effective for problems involving previous state or history  

---

## 📅 24 Dec 2025

### Topics Covered
- Arrays  

---

### Problems Solved
- Rotate Array (LeetCode)  
- Remove Duplicates from Sorted Array (LeetCode)  

---

### Key Learnings
- Rotate Array:
  - Can be optimized using *reverse technique*
  - Achieves *O(n)* time and *O(1)* extra space
  - Involves reversing:
    - Entire array
    - First k elements
    - Remaining elements  
- Remove Duplicates from Sorted Array:
  - Efficiently solved using *two-pointer technique*
  - One pointer tracks unique elements
  - In-place modification without extra space  
- Sorted array property simplifies duplicate handling  

---

### Notes
- Array rotation problems test understanding of index manipulation  
- Two-pointer approach is widely used in array optimization problems
- 
---

## 📅 25 Dec 2025

### Topics Covered
Arrays

### Problems Solved
- Maximum Subarray  
- Subarray Sum Equals K (brute force)

### Key Learnings
- For maximum subarray, I learned how Kadane’s algorithm works by keeping a running sum.
- When the current sum becomes negative, it is better to reset it.
- For subarray sum equals k, I used a brute force approach with two loops.
- Brute force helps in understanding how subarrays are formed.
- Time complexity for brute force solution is O(n²).

### Notes
- Kadane’s algorithm is an important concept for interviews.
- Writing brute force first makes it easier to understand optimized solutions later.

---

## 📅 26 Dec 2025

### Topics Covered
Stack

### Problems Solved
- Valid Parentheses  
- Valid Parenthesis String  

### Key Learnings
- Stack helps in checking matching opening and closing brackets.
- For valid parentheses, every opening bracket must have a correct closing one.
- Order matters while popping elements from the stack.
- Valid Parenthesis String is slightly tricky because of the wildcard *.
- '*' can act as an opening bracket, closing bracket, or empty.
- Understanding edge cases is important in bracket problems.

### Notes
- Stack is very useful for validation-type problems.

---

## 📅 27 Dec 2025

### Topics Covered
Stack  
Monotonic Stack  

### Problems Solved
- Daily Temperatures  

### Key Learnings
- This problem uses a monotonic decreasing stack.
- Stack stores indices instead of values.
- When a higher temperature is found, previous indices are popped.
- Difference between indices gives the number of days to wait.
- If no warmer day exists, answer remains 0.

### Notes
- Monotonic stack is useful for next greater element type problems.

---

## 📅 28 Dec 2025

### Topics Covered
Arrays  

### Problems Solved
- Max Consecutive Ones  
- Missing Number  

### Key Learnings
- Max consecutive ones can be solved by counting continuous 1s and resetting the count when 0 appears.
- A running count helps track the maximum length efficiently.
- Missing number was solved using the sum of first n natural numbers formula.
- Expected sum is calculated using n(n+1)/2 and compared with actual array sum.
- This approach works in O(n) time with O(1) extra space.
  
### Notes
- These problems help strengthen basic array traversal skills.
- Simple logic and edge case handling are important.

---

## 📅 29 Dec 2025

### Topics Covered
Arrays

### Problems Solved
- Sort Colors

### Key Learnings
- The problem can be solved without using any built-in sorting function.
- Using three pointers helps correctly place 0s, 1s, and 2s.
- In-place swapping avoids extra space usage.
- The solution runs in O(n) time with O(1) space complexity.

### Notes
- Careful pointer movement is important to prevent infinite loops.
- This problem improves understanding of in-place array manipulation.

---

## 📅 30 Dec 2025

### Topics Covered
- Arrays 
- Matrix

### Problems Solved
- Rotate Image
- Matrix Diagonal Sum

### Key Learnings
- Matrix rotation can be done by first transposing the matrix and then reversing each row.
- Diagonal elements can be accessed using simple index logic.
- For odd-sized matrices, the middle element should not be counted twice.
- In-place operations help reduce extra space usage.

### Notes
- Understanding index manipulation is important when working with matrices.

---

## 📅 1 Jan 2026

### Topics Covered
- Strings 
- Hashing

### Problems Solved
- Valid Anagram  
- Valid Palindrome  

### Key Learnings
- An anagram means two strings contain the same characters with the same frequency.
- Character frequency can be tracked using a fixed-size array.
- Two-pointer technique helps compare characters from both ends efficiently.
- Non-alphanumeric characters should be skipped while checking for palindromes.
- Converting characters to lowercase helps with case-insensitive comparison.

### Notes
- Frequency counting is useful for string comparison problems.
- Two-pointer approach reduces extra space usage.
- Careful pointer movement prevents incorrect comparisons.

---

## 📅 2 Jan 2026

### Topics Covered
- Strings 
- Binary Trees

### Problems Solved
- First Unique Character in a String
- Maximum Depth of Binary Tree
- Minimum Depth of Binary Tree
- Symmetric Tree

### Key Learnings
- Character frequency can be stored using an array to find non-repeating characters.
- Tree depth problems are solved using recursion.
- Maximum depth uses max(left, right) while minimum depth needs careful null handling.
- Symmetric trees can be checked by comparing left and right subtrees recursively.
- Base cases are very important in recursive tree problems.

### Notes
- Using arrays for frequency counting is efficient when character range is fixed.
- Recursive tree traversal becomes easier with clear base conditions.

---

## 📅 3 Jan 2026

### Topics Covered
- Binary Search Trees
- Binary Trees

### Problems Solved
- Search in a Binary Search Tree
- Merge Two Binary Trees

### Key Learnings
- Binary Search Tree properties help reduce the search space.
- Recursive traversal makes tree operations simpler and clearer.
- While searching in a BST, choosing left or right depends on value comparison.
- Tree merging can be done by recursively combining corresponding nodes.
- Handling null nodes correctly is important in tree problems.

### Notes
- Recursion stack space depends on the height of the tree.

---

## 📅 4 Jan 2026

### Topics Covered
- Strings

### Problems Solved
- Length of Last Word

### Key Learnings
- Traversing a string from the end helps avoid unnecessary processing.
- Trailing spaces need to be handled carefully in string problems.
- Counting characters until a space is found identifies the last word.

### Notes
- Edge cases like multiple trailing spaces are important.
- Scanning from the end is often useful in string-related problems.

---

## 📅 5 Jan 2026

### Topics Covered
- Binary Trees

### Problems Solved
- Binary Tree Inorder Traversal

### Key Learnings
- Inorder traversal visits nodes in the order: left subtree, root, and right subtree.
- Tree traversal problems help build a strong foundation for binary tree concepts.
- Recursion simplifies tree traversal problems.

### Notes
- Inorder traversal of a BST produces a sorted sequence.
- Understanding traversal order is important for solving tree-related problems.

---

## 📅 6 Jan 2026

### Topics Covered
- Binary Trees

### Problems Solved
- Binary Tree Preorder Traversal
- Binary Tree Postorder Traversal

### Key Learnings
- Preorder traversal processes the root before its subtrees.
- Postorder traversal processes the root after both subtrees.
- Recursive traversal follows a clear and consistent pattern.

### Notes
- Practicing different traversals improves confidence with recursion.

---

## 📅 7 Jan 2026

### Topics Covered
- Graphs

### Problems Solved
- Find the Town Judge

### Key Learnings
- A town judge trusts nobody but is trusted by everyone else.
- Trust relationships can be tracked using two arrays.
- One array counts outgoing trust, another counts incoming trust.
- The judge will have 0 outgoing trust and (n − 1) incoming trust.

### Notes
- Separating in-degree and out-degree makes the logic clear.
- This approach avoids using extra data structures like maps.

---

## 📅 8 Jan 2026

### Topics Covered
- Dynamic Programming

### Problems Solved
- Climbing Stairs

### Key Learnings
- The problem follows a Fibonacci pattern.
- Each step depends on the previous two steps.
- Using variables instead of an array reduces space usage.

### Notes
- Time complexity is O(n).
- Space complexity is O(1) due to constant extra variables.

---

## 📅 9 Jan 2026

### Topics Covered
- Graphs

### Problems Solved
- Find Center of Star Graph

### Key Learnings
- In a star graph, the center node appears in every edge.
- Comparing the first two edges is enough to identify the center.
- No extra data structures are required.

### Notes
- This approach works in O(1) time.
- Observing problem patterns can greatly simplify the solution.

---

## 📅 10 Jan 2026

### Topics Covered
- Greedy Algorithm

### Problems Solved
- Jump Game

### Key Learnings
- Greedy approach can be used to track the maximum reachable index.
- If the current index goes beyond the maximum reach, the end is unreachable.
- Updating the farthest reachable position avoids unnecessary checks.
- Greedy solutions can be more efficient than dynamic programming.

### Notes
- Jump Game can also be solved using DP, but Greedy is optimal.
- Tracking a single variable can replace extra memory usage.

---

## 📅 11 Jan 2026

### Topics Covered
- Graphs
- Depth-First Search (DFS)

### Problems Solved
- Keys and Rooms

### Key Learnings
- Rooms and keys can be modeled as a graph.
- Depth-First Search helps explore all reachable rooms.
- A visited array is used to avoid revisiting rooms.
- Starting DFS from room 0 ensures we check full accessibility.

### Notes
- DFS is useful for reachability problems.
- Marking nodes as visited prevents infinite recursion.

---

## 📅 12 Jan 2026

### Topics Covered
- Arrays
- Matrix Traversal

### Problems Solved
- Island Perimeter

### Key Learnings
- Each land cell contributes 4 to the perimeter.
- Shared edges between adjacent land cells should be subtracted.
- Checking only top and left neighbors avoids double counting.
- A simple matrix traversal can solve the problem without DFS or BFS.

### Notes
- Careful boundary checks are important in 2D arrays.
- This approach works efficiently in a single pass.

---

## 📅 13 Jan 2026

### Topics Covered
- Arrays

### Problems Solved
- Two Sum

### Key Learnings
- Brute-force approach checks all possible pairs.
- Nested loops help compare each element with the rest.
- Returning early improves performance once the target is found.

### Notes
- This solution is easy to understand and good for learning.
- Optimized approaches can be explored later using hashing.

---

## 📅 14 Jan 2026

### Topics Covered
- Arrays

### Problems Solved
- Concatenation of Array

### Key Learnings
- Creating a new array helps store repeated elements.
- Index offset (`i + n`) is useful when working with extended arrays.
- Simple loops can solve problems efficiently without extra logic.

### Notes
- Understanding array indexing is important for such problems.
- This problem reinforces basic array manipulation.

---

## 📅 15 Jan 2026

### Topics Covered
- Arrays
- Two-Pointer Technique

### Problems Solved
- Remove Element

### Key Learnings
- Two-pointer technique helps filter elements in-place.
- The array size remains unchanged, but only the first `k` elements are considered valid.
- Returning the count of valid elements satisfies the problem requirement.

### GitHub Work
- Added solution for Remove Element.
- Reorganized folders by moving Island Perimeter from Graphs to Arrays
  to better reflect the approach used.
- Updated comments for better clarity.

### Notes
- Understanding problem constraints avoids incorrect assumptions.
- Clean repository structure helps with revision and learning.

---

## 📅 16 Jan 2026

### Topics Covered
- Arrays
- Prefix Sum

### Problems Solved
- Running Sum of 1d Array

### Key Learnings
- Prefix sum helps compute cumulative values efficiently.
- In-place modification reduces extra space usage.
- Each element depends on the previous computed sum.

### Notes
- This problem strengthens understanding of cumulative operations.
- Simple loops can solve many array problems optimally.

---

## 📅 17 Jan 2026

### Topics Covered
- Arrays

### Problems Solved
- Plus One

### Key Learnings
- Carry handling is important when working with digits.
- Iterating from right to left simplifies addition problems.
- Edge cases like all digits being 9 need special handling.

### Notes
- Learned when to modify the array in-place vs creating a new array.

---

## 📅 18 Jan 2026

### Topics Covered
- Strings
- ASCII character manipulation

### Problems Solved
- To Lower Case

### Key Learnings
- Characters can be converted using ASCII values.
- Converting a string to a char array allows in-place modification.
- Simple loops can replace built-in functions when needed.

### Notes
- Useful for understanding how character encoding works internally.

---

## 📅 19 Jan 2026

### Topics Covered
- Strings
- Two Pointers

### Problems Solved
- Reverse Words in a String III

### Key Learnings
- Word boundaries can be detected using spaces.
- Two-pointer technique is effective for in-place string reversal.
- Helper methods improve code readability and reuse.

### Notes
- Converting strings to char arrays allows efficient in-place operations.

---

## 📅 26 Jan 2026

### Topics Covered
- Strings
- Hashing (Character Mapping)

### Problems Solved
- Isomorphic Strings

### Key Learnings
- Character mapping helps compare patterns between strings.
- Using last-seen indices avoids extra data structures.
- Index + 1 prevents collision with default zero values.

### Notes
- One-to-one mapping is required for strings to be isomorphic.
- Fixed-size arrays are efficient when character range is known.

---

## 📅 27 Jan 2026

### Topics Covered
- Strings

### Problems Solved
- Largest Odd Number in String

### Key Learnings
- Oddness of a number depends only on its last digit.
- Traversing from the end helps find the maximum valid substring.
- Handling leading zeros is important in string-based number problems.

### Notes
- String manipulation avoids integer overflow issues.
- Edge cases like no odd digit must be handled.

---

## 📅 28 Jan 2026

### Topics Covered
- Strings
- Stack Concept (using counter)

### Problems Solved
- Maximum Nesting Depth of the Parentheses

### Key Learnings
- Parentheses depth can be tracked using a simple counter.
- Maximum value during traversal represents nesting depth.
- Stack behavior can be simulated without an actual stack.

### Notes
- Counter-based solutions reduce space usage.
- Careful increment and decrement prevents incorrect depth calculation.

---

## 📅 29 Jan 2026

### Topics Covered
- Strings

### Problems Solved
- Rotate String

### Key Learnings
- String rotation can be simulated using substring operations.
- Checking all rotations ensures correctness.
- Length mismatch is a quick rejection condition.

### Notes
- This solution is easy to understand but not the most optimal.
- Optimization is possible using string concatenation and search.

---

## 📅 31 Jan 2026

### Topics Covered
- Strings
- Two Pointers

### Problems Solved
- Find the Index of the First Occurrence in a String

### Key Learnings
- Substring search can be implemented using pointer manipulation.
- Resetting pointers correctly is crucial to avoid missing matches.
- Handling edge cases like an empty needle is important.

### Notes
- This is a brute-force approach.
- More optimized solutions like KMP exist but are more complex.

---

## 📅 1 Feb 2026
### Topics Covered
- Strings
- Two Pointers

### Problems Solved
- Reverse Vowels of a String

### Key Learnings
- Two-pointer technique helps process strings from both ends efficiently.
- Checking membership using a vowel set simplifies logic.
- In-place modification using a char array improves performance.

### Notes
- This problem strengthens two-pointer pattern recognition.
- Careful pointer movement avoids unnecessary swaps.

---

## 📅 2 Feb 2026
### Topics Covered
- Linked Lists
- Two Pointers

### Problems Solved
- Merge Two Sorted Lists

### Key Learnings
- Two pointers help merge sorted lists efficiently.
- Comparing nodes one by one maintains sorted order.
- Start node simplifies linked list construction.

### Notes
- This problem reinforces basic linked list manipulation.
- Careful pointer movement prevents losing node references.

---

## 📅 4 Feb 2026

### Topics Covered
- Linked Lists

### Problems Solved
- Remove Duplicates from Sorted List

### Key Learnings
- Sorted lists make duplicate removal straightforward.
- Pointer manipulation is key in linked list problems.
- In-place updates avoid extra memory usage.

### Notes
- Always check the next node before accessing it.

---

## 📅 5 Feb 2026

### Topics Covered
- Linked Lists
- Two Pointers

### Problems Solved
- Linked List Cycle
- Middle of the Linked List
- Remove Nth Node From End of List

### Key Learnings
- Two-pointer technique is very useful in linked list problems.
- Fast and slow pointers help detect cycles and find middle elements.
- Using a dummy node simplifies edge cases in linked list deletion problems.

### Notes
- One-pass solutions improve efficiency.
- Careful pointer movement prevents null pointer errors.

---

## 📅 6 Feb 2026

### Topics Covered
- Linked Lists

### Problems Solved
- Delete Node in a Linked List

### Key Learnings
- When the head is not accessible, the node can be deleted by copying the next node’s value.
- Updating the current node’s pointer effectively removes the next node.
- This problem works only when the given node is not the tail.

### Notes
- This is a special linked list case with constant time deletion.
- Understanding constraints is crucial before choosing an approach.

---

## 📅 8 Feb 2026

### Topics Covered
- Linked Lists

### Problems Solved
- Remove Duplicates from Sorted List II

### Key Learnings
- Dummy nodes help handle edge cases like duplicate values at the head.
- Using two pointers allows skipping all occurrences of duplicate values.
- Sorted linked lists make it easier to detect duplicates.

### Notes
- Carefully updating pointers prevents losing parts of the list.
- This problem is different from removing single duplicates and requires skipping all repeated values.

---

## 📅 9 Feb 2026

### Topics Covered
- Linked Lists

### Problems Solved
- Rotate List

### Key Learnings
- Circular linked lists help simplify rotation problems.
- Modulo operation avoids unnecessary rotations.
- Careful pointer updates are required to prevent cycles.

### Notes
- Edge cases like empty list and k = 0 must be handled first.
- This problem strengthens pointer manipulation skills.

---

## 📅 10 Feb 2026

### Topics Covered
- Linked Lists
- Binary Trees
- Recursion

### Problems Solved
- Convert Sorted List to Binary Search Tree

### Key Learnings
- Slow and fast pointers help find the middle element efficiently.
- Recursion is useful for divide-and-conquer problems.
- Breaking the list is necessary to avoid infinite recursion.

### Notes
- This approach builds a height-balanced BST.
- Understanding base cases is crucial in recursive solutions.

---

## 📅 11 Feb 2026

### Topics Covered
- Strings
- Stack

### Problems Solved
- Clear Digits

### Key Learnings
- Stack helps in removing the most recent element efficiently.
- Digits can be used as signals to remove previous characters.
- StringBuilder is useful for constructing the final result.

### Notes
- Stack follows LIFO which is useful for "remove previous element" type problems.
- Always check if stack is empty before popping to avoid errors.

---

## 📅 12 Feb 2026

### Topics Covered
- Linked Lists

### Problems Solved
- Remove Linked List Elements

### Key Learnings
- Dummy node helps handle edge cases like deleting the head.
- Traversing using current pointer allows safe modification of links.
- Skipping nodes is done by updating next pointers.

### Notes
- Using a dummy node simplifies logic and avoids null checks for head.
- Always move the pointer only when no deletion happens.

---

## 📅 14 Feb 2026

### Topics Covered
- Linked Lists
- Two Pointers

### Problems Solved
- Palindrome Linked List

### Key Learnings
- Linked list values can be stored in an array for easier processing.
- Two-pointer technique helps compare elements from both ends.
- .equals() is used for comparing Integer values.

### Notes
- This approach uses extra space but is simple to implement.
- Can be optimized further using slow/fast pointer and reversal.
