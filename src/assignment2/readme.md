# Assignment 2 – IntStack & LinkedList

## How to run
Compile and run Main in any IDE

## Design overview

### `LinkedList<T>`
A generic linked list with a head, tail, and size
| Method | Description |
|---|---|
| `pushFront(T)` | Insert at front |
| `pushBack(T)` | Insert at back |
| `popFirst()` | Remove and return front item |
| `popLast()` | Remove and return back item |
| `peekFirst()` / `peekLast()` | View front/back without removing |
| `insert(int, T)` | Insert at index (clamped to valid range) |
| `remove(int)` | Remove by index, returns success bool |
| `find(T)` | Returns first index of item, or `-1` |
| `size()`| returns size as an int |
|`isEmpty()`| returns if list is empty
| `toString()` | returns String representation of the list|

Uses a private inner `Node` class holding data and a `next` pointer.

---

### `IntStack`
A simple integer stack using an `ArrayList<Integer>`.
| Method | Description |
|---|---|
| `push(int)` | Adds an item to the top |
| `pop()` | Removes and returns the top item |
| `peek()` | Returns top item without removing |
| `isEmpty()` | Returns true if stack is empty |
| `size()` | Returns number of elements |
| `average()` | Returns float average of all elements |

Both `pop()` and `peek()` throw `EmptyStackException` when called on an empty stack.

---

## Sample output
Running `Main.java` produces:
 
```
Stack:
true          ← isEmpty() before pushing
false         ← isEmpty() after pushing 1–10
10            ← size()
10            ← pop()  (removes top)
9             ← peek()  (new top, 10 is gone)
5.0           ← average() of remaining [1..9]
```
