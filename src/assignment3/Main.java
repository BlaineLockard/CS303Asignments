package assignment3;

import java.util.ArrayList;

public class Main  {

    public static void main(String[] args) {
        Queue<String> myQueue = new Queue<>();
        for (int i = 65; i < 75; i++){ // Adds first 10 letters of alphabet
            myQueue.offer((char)i + "");
        }
        moveToRear(myQueue);
        while (myQueue.peek() != null){
            System.out.print(myQueue.poll() + " ");
        }
        System.out.println();

        ArrayList<String> myArrayList = new ArrayList<>();
        for (int i = 65; i < 90; i++){ // Adds all letters of alphabet
            if(i == 78 || i == 89){
                myArrayList.add("A");
            }
            myArrayList.add((char)i + "");
        }
        System.out.println(myArrayList.toString());
        System.out.println(linearSearchLast(myArrayList, "A"));
        System.out.println(linearSearchLast(myArrayList, "Z"));

    }

    public static <T> void moveToRear(Queue<T> queue){
        if  (queue.isEmpty()){
            return;
        }
        queue.offer(queue.poll());
    }

    public static <T> int linearSearchLast(ArrayList<T> list, T item){
        return checkNextElement(list, item, list.size() - 1);
    }
    private static <T> int checkNextElement(ArrayList<T> list, T item, int index ){
        if (index <= 0){
            return -1;
        }
        if (list.get(index).equals(item)){
            return index;
        }
        return checkNextElement(list, item, index-1);
    }

}
