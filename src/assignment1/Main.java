package assignment1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        BlaineArray<Integer> nums = new BlaineArray<>(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
        System.out.println("Item at index 3 is " + nums.get(3));

        Object[] replacement = nums.set(3, 100);
        System.out.println("Replacing " + replacement[1] + " with " + replacement[0]);

        System.out.println("Item at index 3 is " + nums.get(3));
        nums.add(13);

        int itemPos = nums.hasItem(6);
        if (itemPos != -1) {
            System.out.println("Found 6 at index " + itemPos);
        }
        else{
            System.out.println("Could not find a 6");
        }

        System.out.println("Removing item at index 4");
        nums.remove(4);

        System.out.println(nums.toString());
    }
}
