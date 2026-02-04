package assignment1;

import java.lang.reflect.Array;

public class BlaineArray<T> {
    private T[] array;

    public BlaineArray(){
    }

    public BlaineArray(T[] array){
        this.array = array;
    }

    public T get(int index) throws ArrayIndexOutOfBoundsException{
        return array[index];
    }

    public int hasItem(T item){
        for(int i = 0; i < array.length; i++) {
            if(item.equals(array[i])){
                return i;
            }
        }
        return -1;
    }

    public T[] set(int index, T newEntry) throws ArrayIndexOutOfBoundsException{
        // Put the objects into an object array since T[] cannot be initialized
        Object[] returnArray = new Object[2];
        returnArray[0] = array[index];
        returnArray[1] = newEntry;

        array[index] = newEntry;

        // cast the object array to a T array
        return (T[]) returnArray;
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
