package assignment2;


public class Main {
    public static void main(String[] args) {
        System.out.println("Stack:");
        IntStack stack = new IntStack();
        System.out.println(stack.isEmpty());

        for(int i = 1; i < 11; i++){
            stack.push(i);
        }

        System.out.println(stack.isEmpty());
        System.out.println(stack.size());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.average());

    }
}
