# E-commerce Platform Search Function

## Problem Statement
Implement search functionality for an e-commerce platform and compare linear search and binary search for fast product lookup.

## Big O Notation
Big O notation is used to describe the performance of an algorithm as the input size grows.

It helps us understand:
- how much time an algorithm takes
- how efficiently it scales for large data

## Search Scenarios
### Best Case
The target is found immediately.
- Linear Search: O(1)
- Binary Search: O(1)

### Average Case
The target is found somewhere in the middle.
- Linear Search: O(n)
- Binary Search: O(log n)

### Worst Case
The target is at the end or not present.
- Linear Search: O(n)
- Binary Search: O(log n)

## Classes
- `Product.java` → stores product details
- `SearchEngine.java` → contains linear search, binary search, and sorting logic
- `SearchTest.java` → tests both search algorithms

## Algorithms Implemented

### 1. Linear Search
Checks each product one by one until the target product is found.

**Time Complexity**
- Best Case: O(1)
- Average Case: O(n)
- Worst Case: O(n)

### 2. Binary Search
Works on a **sorted array** and repeatedly divides the search space into half.

**Time Complexity**
- Best Case: O(1)
- Average Case: O(log n)
- Worst Case: O(log n)

## Which Algorithm is More Suitable?
For a large e-commerce platform, **Binary Search** is more suitable because:
- it is much faster than linear search for large datasets
- it reduces the search space by half in each step
- it provides O(log n) performance

However, binary search requires the data to be sorted first.

## Conclusion
- Use **Linear Search** for small or unsorted data
- Use **Binary Search** for large, sorted product lists where fast lookup is important