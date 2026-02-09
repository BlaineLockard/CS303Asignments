package assignment1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BlaineArray<T> {
    private T[] array;
    private int size = 0;

    public BlaineArray(){
    }

    public BlaineArray(T[] array){
        this.array = array;
        size = array.length;
    }

    public T get(int index){
        try {
            return array[index];
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.err.println("Array index out of bounds");
            return null;
        }
    }

    public int find(T item){
        for(int i = 0; i < array.length; i++) {
            if(item.equals(array[i])){
                return i;
            }
        }
        return -1;
    }

    public T[] set(int index, T newItem){
        // Put the objects into an object array since T[] cannot be initialized
        Object[] returnArray = new Object[2];
        try{
            returnArray[0] = array[index];
        }
        catch(ArrayIndexOutOfBoundsException e){
            // if we cant get the item return null
            System.err.println("Array index out of bounds");
            return null;
        }
        returnArray[1] = newItem;

        array[index] = newItem;

        // cast the object array to a T array
        return (T[]) returnArray;
    }

    public void add(T newItem){
        if(size == 0){ // if the array hasn't been made yet
            size++;
            Object[] newArray = new Object[]{newItem};
            array = (T[]) newArray;
        }
        else{ // if the array has items
            size++;
            array =  Arrays.copyOf(array, size);
            array[array.length - 1] = newItem;
        }
    }

    public T remove(int index){
        // Get the item that will be removed and the last item in the array
        T item;
        try{
            // try to get the item at index
            item = array[index];
        } catch(ArrayIndexOutOfBoundsException e){
            // if we cant print and err and return nothing
            System.err.println("Array index out of bounds");
            return null;
        }

        T lastItem = array[array.length - 1];
        size--;

        // copy the array minus the last item
        array = Arrays.copyOf(array, size);

        // Items after the removed item get moved back one
        for(int i = index; i < array.length-1; i++){
            array[i] = array[i + 1];
        }

        // Put the last item in the last position
        array[array.length - 1] = lastItem;
        return item;
    }

    public int size(){
        return size;
    }

    public String toString(){
        String returnString = "";

        for(int i = 0; i < array.length-1; i++){ // skip last to avoid if(is last)
            returnString += array[i] + ", ";
        }
        returnString += array[array.length-1];

        return returnString;
    }
}
