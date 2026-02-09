package assignment1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        // creates an array with numbers 1-100
        BlaineArray<Integer> nums = new BlaineArray<>();
        readFileToIntArray("inputFiles/A1input.txt", nums);


        // prints out elements in the array
        System.out.println(nums.toString());
            // prints: 1, 2, 3, 4, 5, ... , 100


        // finds an item in array and returns its index
        int itemIndex = nums.find(50);
        System.out.println(itemIndex);
            // prints: 49


        // replaces item at an index and returns an array of the replaced item and the new item
        int indexToReplace = 5;
        int newItem = 13;
        Object[] itemsArray = nums.set(indexToReplace, newItem);
        System.out.println(itemsArray[0] + " " + itemsArray[1]);
            // prints: 6, 13


        // add item to array
        int newInt = 101;
        nums.add(newInt);
        System.out.println(nums.toString());
            //prints: 1, 2, 3, 4, 5, ... , 101


        // removes item at an index
        int indexToRemove = 2;
        nums.remove(indexToRemove);
        System.out.println(nums.toString());
            //prints: 1, 2, 4, 5, 6, ... , 101


    }

    public static void readFileToIntArray(String fileName, BlaineArray<Integer> array){
        Scanner sc;
        try {
            sc = new Scanner(new File(fileName));
        } catch (FileNotFoundException e) {
            System.err.println("File " + fileName + " not found.\n" + e.getMessage());
            return;
        }

        sc.useDelimiter("[\n ]");
        while (sc.hasNext()) {
            String nextEntry = sc.next();
            try {
                array.add(Integer.parseInt(nextEntry));
            } catch (Exception e) {
                System.err.println("Error reading " + nextEntry + ": " + e.getMessage() + "\nSkipping item");
            }
        }
        sc.close();
    }
}
