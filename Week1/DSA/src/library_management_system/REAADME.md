# Library Management System

## Problem Statement

Develop a library management system that allows users to search books by title using Linear Search and Binary Search.

---

## Search Algorithms

### Linear Search

Linear Search checks every book one by one until the required title is found.

**Time Complexity**
- Best Case: O(1)
- Average Case: O(n)
- Worst Case: O(n)

---

### Binary Search

Binary Search repeatedly divides the sorted array into halves until the book is found.

**Note:** Binary Search works only on a sorted array.

**Time Complexity**
- Best Case: O(1)
- Average Case: O(log n)
- Worst Case: O(log n)

---

## Classes

- Book.java
- LibrarySearch.java
- LibraryTest.java

---

## Comparison

| Algorithm | Best | Average | Worst |
|-----------|------|----------|-------|
| Linear Search | O(1) | O(n) | O(n) |
| Binary Search | O(1) | O(log n) | O(log n) |

---

## When to Use

### Linear Search

- Small datasets
- Unsorted data
- Simple implementation

### Binary Search

- Large datasets
- Frequently searched data
- Data is already sorted

---

## Conclusion

For a library containing thousands of books, Binary Search is significantly faster than Linear Search, provided the books are maintained in sorted order.