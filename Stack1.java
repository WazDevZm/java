import java.util.Stack;

public class Stack1 {
    // in this section of the code we are impletening a stack
    public static void main (String[] args) {
        Stack<Integer> stack = new Stack<>();
        // pushing some elements to the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.pop(); // this removes the top most element of the stack
        // printing the top element of the stack
        System.out.println("Top element: " + stack.peek());
        // popping an element from the stack
        System.out.println("Popped element: " + stack.pop());
        // printing the top element of the stack after popping
        System.out.println("Top element after popping: " + stack.peek());
        // checking if the stack is empty
        System.out.println("Is the stack empty? " + stack.empty());
    }
}
