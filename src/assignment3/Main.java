package assignment3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;


public class Main {

    public static void main(String[] args) {
        // Set seed for repeatable results
        Random rand = new Random();
        rand.setSeed(1);


        // Queue
        // Creating Queue with 10 items
        Queue<String> myQueue = new Queue<>();
        for (int i = 0; i != 10; i ++) {
            // Add 10 "random" characters
            myQueue.offer((char) rand.nextInt(65, 91) + "");
        }
        System.out.println(myQueue.toString());

        // Moving item to back
        moveToRear(myQueue);

        // Iterating a queue to empty it
        while (myQueue.peek() != null) {
            System.out.print(myQueue.poll() + " ");
        }
        System.out.println();


        // Linear search for last item
        ArrayList<String> myArrayList = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            // Adds 20 "random" characters
            myArrayList.add((char) rand.nextInt(65, 91) + "");
        }
        System.out.println(myArrayList.toString());

        // Successful Search of multiple instances
        System.out.println(linearSearchLast(myArrayList, "E"));

        // Failed search
        System.out.println(linearSearchLast(myArrayList, "C"));



        // Insertion Sort on a LinkedList
        LinkedList<Integer> myLinkedList = new LinkedList<>();
        for (int i = 0; i < 20; i++) {
            myLinkedList.add(rand.nextInt(0, 100));
        }
        System.out.println(myLinkedList.toString());
        linkedListInsertionSort(myLinkedList);
        System.out.println(myLinkedList.toString());

    }

    public static <T> void moveToRear(Queue<T> queue) {
        if (queue.isEmpty()) {
            return;
        }
        queue.offer(queue.poll());
    }

    public static <T> int linearSearchLast(ArrayList<T> list, T item) {
        return checkNextElement(list, item, list.size() - 1);
    }

    private static <T> int checkNextElement(ArrayList<T> list, T item, int index) {
        if (index <= 0) {
            return -1;
        }
        if (list.get(index).equals(item)) {
            return index;
        }
        return checkNextElement(list, item, index - 1);
    }

    public static void linkedListInsertionSort(LinkedList<Integer> num) {
        int j, i, key;
        for (j = 1; j < num.size(); j++) {
            key = num.remove(j);
            i = j - 1;

            while (i >= 0 && key < num.get(i)) {
                i--;
            }

            num.add(i + 1, key);
        }
    }
}