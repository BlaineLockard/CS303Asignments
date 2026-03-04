package assignment2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        String[] names = {"Brandon", "Steven", "Blaine", "Roman", "Landon"};
        LinkedList<String> linkedList = new LinkedList<>(names);
        System.out.println(linkedList.toString());
        linkedList.insert(2, "Fredrick");
        System.out.println(linkedList.toString());
        linkedList.remove(6);
        System.out.println(linkedList.toString());
    }
}
