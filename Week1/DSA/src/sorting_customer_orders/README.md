# Sorting Customer Orders

## Problem Statement
Sort customer orders by total price in an e-commerce platform so that high-value orders can be prioritized.

## Sorting Algorithms Overview

### 1. Bubble Sort
Bubble Sort repeatedly compares adjacent elements and swaps them if they are in the wrong order.

- Simple to understand
- Inefficient for large datasets

### 2. Insertion Sort
Builds the sorted array one element at a time by inserting each element into its correct position.

- Good for small or nearly sorted data
- Not ideal for very large datasets

### 3. Quick Sort
Uses a pivot element and partitions the array into smaller subarrays, then recursively sorts them.

- Very efficient on average
- Commonly used in practice

### 4. Merge Sort
Divides the array into halves, sorts them recursively, and merges them back.

- Stable and efficient
- Requires extra memory

## Classes
- `Order.java` → represents a customer order
- `SortService.java` → contains Bubble Sort and Quick Sort implementations
- `SortTest.java` → tests sorting of orders

## Implemented Algorithms

### Bubble Sort
Compares adjacent orders and swaps them if they are in the wrong order based on `totalPrice`.

**Time Complexity**
- Best Case: O(n) if already sorted
- Average Case: O(n²)
- Worst Case: O(n²)

### Quick Sort
Uses divide-and-conquer with a pivot to sort the orders.

**Time Complexity**
- Best Case: O(n log n)
- Average Case: O(n log n)
- Worst Case: O(n²)

## Comparison: Bubble Sort vs Quick Sort

 Algorithm    Best Case  Average Case  Worst Case 
---------------------------------------------------
 Bubble Sort  O(n)       O(n²)         O(n²)      
 Quick Sort   O(n log n) O(n log n)    O(n²)     

## Why Quick Sort is Generally Preferred
- Much faster on average for large datasets
- Uses divide-and-conquer approach
- Reduces unnecessary comparisons compared to Bubble Sort
- More practical for real-world sorting of large order lists

## Conclusion
For an e-commerce platform handling many customer orders, **Quick Sort** is generally preferred because it provides much better average performance than Bubble Sort.