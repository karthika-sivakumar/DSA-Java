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
