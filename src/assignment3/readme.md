# Assignment 3 – Queue, Linear Search, and Insertion Sort

## How to run
Compile and run `Main.java` in any IDE

## Design overview

### `Queue<T>`
A generic queue using a linked list
| Method | Description |
|---|---|
| `offer(T)` | adds item to the end of the queue |
| `poll(T)` | removes and return first item in the queue |
| `peek(T)` | return and does not return the first item in the queue |
| `size(T)` | returns size of the queue |
| `isEmpty(T)` | returns if the list is empty |


---

### `linearSearchLast(Arraylist<T>, T)`
Recursively loops through the list backwards, and returns the index of the first instance of the item it finds, and -1 if it doesn't find it.

### `linkedListInsertionSort(LinkedList<Integer>)`
Uses an insertion sort to sort a linked list.

---

## Sample output
Running `Main.java` produces:
 
```
R -> A -> H -> J -> M -> Y -> U -> W -> W -> K ->                                 <- Created queue
A H J M Y U W W K R                                                               <- Queue polled, until empty, after calling moveToRear()
[R, X, N, F, M, Q, G, E, E, B, E, O, A, P, E, Z, S, D, Z, S]                      <- Created ArrayList
14                                                                                <- Index of the Last E
-1                                                                                <- Index of the last C (there is none)
[5, 54, 0, 6, 63, 55, 89, 20, 75, 34, 15, 60, 77, 37, 77, 92, 20, 88, 0, 57]      <- Presorted, random, linkedList
[0, 0, 5, 6, 15, 20, 20, 34, 37, 54, 55, 57, 60, 63, 75, 77, 77, 88, 89, 92]      <- Sorted LinkedList
```
