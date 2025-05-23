import java.util.InputMismatchException;
import java.util.Scanner;

class Stack {
    private int top = -1;
    private final int capacity = 10;
    private final int[] arr = new int[capacity];

    public int size() {
        return top + 1;
    }

    public int capacity() {
        return capacity;
    }

    public void push(int item) {
        if (top < capacity - 1) {
            arr[++top] = item;
            System.out.println(item + " pushed to stack.");
        } else {
            System.out.println("Stack Overflow: Cannot push " + item);
        }
    }

    public int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow: Nothing to pop.");
            return -1;
        } else {
            int popped = arr[top--];
            return popped;
        }
    }

    public int peek() {
        if (top == -1) {
            System.out.println("Stack Underflow: No element at top.");
            return -1;
        } else {
            return arr[top];
        }
    }

    public void show() {
        if (top == -1) {
            System.out.println("Stack is empty.");
        } else {
            for (int i = top; i >= 0; i--) {
                System.out.println("| " + arr[i] + " |");
            }
            System.out.println(" ----");
        }
    }
}

public class StackUsingArray {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        Stack stack = new Stack();
        boolean repeat = true;

        while (repeat) {
            System.out.println("\n1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Size");
            System.out.println("5. Show");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            try {
                int choice = read.nextInt();
                System.out.println("-------------------------------");

                switch (choice) {
                    case 1 -> {
                        System.out.print("Enter the element to push: ");
                        int data = read.nextInt();
                        stack.push(data);
                    }
                    case 2 -> {
                        int popped = stack.pop();
                        if (popped != -1)
                            System.out.println("Popped element: " + popped);
                    }
                    case 3 -> {
                        int peeked = stack.peek();
                        if (peeked != -1)
                            System.out.println("Element at top: " + peeked);
                    }
                    case 4 -> System.out.println("Current size of stack: " + stack.size());
                    case 5 -> {
                        System.out.println("Stack contents (top to bottom):");
                        stack.show();
                    }
                    case 6 -> {
                        repeat = false;
                        System.out.println("Exiting program. Goodbye!");
                    }
                    default -> System.out.println("Invalid Input: Please choose between 1-6.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter an integer.");
                read.next(); // Clear invalid input
            }

            System.out.println("-------------------------------");
        }
    }
}
