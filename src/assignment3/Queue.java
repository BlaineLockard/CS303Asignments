package assignment3;

import assignment2.LinkedList;

public class Queue <T> {
    LinkedList<T> data;

    public Queue() {
        data = new LinkedList<>();
    }

    public void offer(T item) {
        data.pushBack(item);
    }

    public T poll() {
        if (data.isEmpty()) {
            return null;
        }
        return data.popFirst();
    }

    public T peek() {
        if (data.isEmpty()) {
            return null;
        }
        return data.peekFirst();
    }

    public int size() {
        return data.size();
    }

    public boolean isEmpty() {
        return data.isEmpty();
    }

    public String toString(){
        return data.toString();
    }

}
