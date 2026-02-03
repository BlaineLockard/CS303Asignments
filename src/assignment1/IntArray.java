package assignment1;

public class IntArray {
    private int[] array;

    public IntArray(){
    }

    public IntArray(int[] array){
        this.array = array;
    }

    public int get(int index) throws ArrayIndexOutOfBoundsException{
        return array[index];
    }
    public int[] set(int index, int newEntry) throws ArrayIndexOutOfBoundsException{
        int[] returnArray = {newEntry, 0};
        returnArray[1] = array[index];
        array[index] = newEntry;

        return returnArray;
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
