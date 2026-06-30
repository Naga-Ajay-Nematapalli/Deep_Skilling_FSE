# Task Management System

## Problem Statement
Develop a task management system using a Singly Linked List to efficiently manage dynamic tasks.

## Linked List Types

### Singly Linked List
Each node stores data and a pointer to the next node.

### Doubly Linked List
Each node stores data, a pointer to the next node, and a pointer to the previous node.

## Classes

- Task.java
- TaskLinkedList.java
- TaskManagementTest.java

## Operations

### Add Task
Adds a new task at the end of the linked list.

Time Complexity: O(n)

### Search Task
Searches for a task using taskId.

Time Complexity: O(n)

### Traverse Tasks
Displays every task.

Time Complexity: O(n)

### Delete Task
Deletes a task by taskId.

Time Complexity: O(n)

## Advantages of Linked Lists over Arrays

- Dynamic size
- Easy insertion and deletion
- No shifting of elements
- Better memory utilization for dynamic data

## Limitations

- Sequential access only
- Extra memory required for pointers
- Slower searching compared to arrays