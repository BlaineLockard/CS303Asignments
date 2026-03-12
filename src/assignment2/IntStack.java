package assignment2;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class IntStack {
    private final ArrayList<Integer> data = new ArrayList<>();

    public IntStack() {

    }
    public IntStack(ArrayList<Integer> data) {
        this.data.addAll(data);
    }

    public IntStack(int[] data){
        for(int item : data){
            this.data.add(item);
        }
    }

    public void push(int item){
        data.add(item);
    }

    public int pop(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return data.removeLast();
    }

    public int peek(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return data.getLast();
    }

    public boolean isEmpty(){
        return data.isEmpty();
    }

    public int size(){
        return data.size();
    }

    public float average(){
        float sum = 0;
        for(int item : data) {
            sum += item;
        }
        return sum/data.size();
    }

}
