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


