import java.util.Scanner;

public class Stack {
    int arr[];
    int top;
    int capacity;

    Stack(int cap) {
        arr = new int[cap];
        capacity = cap;
        top = -1;
    }

    public void push(int x) {
        if (top == capacity - 1)
            System.out.println("Overflow\nProgram Terminated\n");
        else {
            top += 1;
            arr[top] = x;
        }
    }

    public int pop() {
        int x = -1;
        if (top == -1)
            System.out.println("Underflow\nProgram Terminated\n");
        else {
            x = arr[top];
            top--;
        }
        return x;
    }

    public int peek() {
        if (top != -1) {
            return arr[top];
        }
        return -1;
    }

    public int size() {
        return top + 1;
    }

    public static void main(String[] args) {
        Stack stack = new Stack(4);

        System.out.println("inserting 1 in the stack");
        stack.push(1);
        System.out.println("inserting 2 in the stack");
        stack.push(2);

        System.out.println("removing the top element (2)");
        stack.pop();
        System.out.println("removing the top element (1)");
        stack.pop();

        System.out.println("inserting 3 in the stack");
        stack.push(3);

        System.out.println("The top element is " + stack.peek());
        System.out.println("The stack size is " + stack.size());

        System.out.println("removing the top element (3)");
        stack.pop();
    }
}
