package assignment1;

public class Main {
    public static void main(String[] args){
        IntArray nums = new IntArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
        System.out.println("Item at index 3 is " + nums.get(3));

        int[] replacement = nums.set(3, 100);
        System.out.println("replacing " + replacement[1] + " with " + replacement[0]);

        System.out.println("Item at index 3 is " + nums.get(3));
        System.out.println(nums.toString());
    }
}
