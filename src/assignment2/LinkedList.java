package assignment2;

public class LinkedList<T> {
    private Node head;
    private Node tail;
    private int size = 0;

    public LinkedList() {
        head = null;
        tail = null;
    }

    public LinkedList(T[] inArray) {
        for (T item : inArray) {
            pushBack(item);
        }
    }

    public void pushFront(T item) {
        if(head == null) {
            head = new Node(item);
            tail = head;
            size++;
            return;
        }
        head = new Node(item, head);
        size++;
    }

    public void pushBack(T item) {
        if(head == null) {
            head = new Node(item);
            tail = head;
            size++;
            return;
        }
        tail.next = new Node(item);
        tail = tail.next;
        size++;
    }

    public T getFirst(){
        return head.data;
    }

    public T getLast(){
        return tail.data;
    }

    public T popFirst(){
        // If list is empty return nothing
        if(head == null){
            return null;
        }
        T data = head.data;
        head = head.next;
        size--;
        // If there was one item we have to update the tail
        if(head == null){
            tail = null;
        }
        return data;
    }

    public T popLast(){
        if(head == null){ // If list is empty return nothing
            return null;
        }
        else if(head == tail){ // If there's one item
            T data = head.data;
            head = null;
            tail = null;
            size--;
            return data;
        }
        T data = tail.data;
        Node temp = head;
        // Get the node before tail
        while(temp.next != tail) {
            temp = temp.next;
        }
        temp.next = null;
        tail = temp;
        size--;
        return data;
    }

    public void insert(int index, T item){
        if (index < 0){ // make sure index is in range
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        else if(index == 0){ // if it's zero, pushing front is fastest
            pushFront(item);
            return;
        }
        else if(index >= size){ // if it's over the size, push back
            pushBack(item);
            return;
        }

        Node newNode = new Node(item);
        Node current = head;
        while(index > 1){ // Move to the node before the one at the target index
            current = current.next;
            index--;
        }
        newNode.next = current.next;
        current.next = newNode;
        size++;
    }

    public boolean remove(int index){
        if(index < 0 || index >= size){ // Make sure index is in range
            return false;
        }
        else if(index == 0){ // First item
            popFirst();
            return true;
        }
        else if(index == size-1){ // last item
            popLast();
            return true;
        }

        Node current = head;
        while(index > 1){ // Move to the node before the one at the target index
            current = current.next;
            index--;
        }
        current.next = current.next.next;
        return true;
    }

    public int find(T data){
      Node current = head;
      int index = 0;
      while(current.next != null){
          if(current.data.equals(data)){
              return index;
          }
          current = current.next;
          index++;
      }
      return -1;
    }

    public int getSize(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public String toString() {
        if (head == null){
            return "->";
        }
        Node current = head;
        StringBuilder sb = new StringBuilder();
        while(current != null){
            sb.append(current.data).append(" -> ");
            current = current.next;
        }

        return sb.toString();
    }

    private class Node{
        T data;
        Node next;

        public Node(T data){
            this.data = data;
        }
        public Node(T data, Node next){
            this.data = data;
            this.next = next;
        }
    }
}
