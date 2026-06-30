## Inventory Management System

## Problem Statement
Develop an inventory management system for a warehouse where efficient data storage and retrieval are crucial.

## Why Data Structures and Algorithms are Important
In a large inventory system, thousands of products may be stored. Efficient data structures and algorithms are required to:
- quickly add new products
- update existing product details
- delete products when removed from stock
- retrieve product information efficiently

Without efficient data structures, operations may become slow as inventory size grows.

## Chosen Data Structure
**HashMap<Integer, Product>**

### Why HashMap?
- Each product has a unique `productId`
- `HashMap` allows fast lookup using `productId`
- Average-case complexity for add, update, delete is **O(1)**

## Classes
- `Product.java` → represents a product
- `InventoryManager.java` → manages add, update, delete, display operations
- `InventoryTest.java` → demonstrates functionality

## Time Complexity Analysis
### 1. Add Product
- `put()` in HashMap → **O(1)** average

### 2. Update Product
- `get()` in HashMap → **O(1)** average

### 3. Delete Product
- `remove()` in HashMap → **O(1)** average

## Optimization Discussion
Using `HashMap` is more efficient than `ArrayList` for product operations because:
- `ArrayList` requires searching linearly by `productId` → **O(n)**
- `HashMap` provides direct access by key → **O(1)** average

Thus, `HashMap` is better suited for large-scale inventory management systems.