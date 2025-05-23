import java.util.InputMismatchException;
import java.util.Scanner;

class Queue {
    private int front = -1;
    private int rear = -1;
    private final int capacity = 10;
    int[] arr = new int[capacity];

    public void enqueue(int data) {
        if (rear == capacity - 1) {
            System.out.println("Queue is full");
        } else if (rear == -1 && front == -1) {
            front = rear = 0;
            arr[rear] = data;
        } else {
            arr[++rear] = data;
        }
    }

    public int dequeue() {
        if (rear == -1 && front == -1) {
            return -1; // Queue is empty
        }

        int data = arr[front];
        if (rear == front) {
            // Only one element in queue
            rear = front = -1;
        } else {
            front++;
        }
        return data;
    }

    public int peek() {
        if (rear == -1 && front == -1) {
            return -1;
        } else {
            return arr[front];
        }
    }

    public void show() {
        if (rear == -1 && front == -1) {
            System.out.println("Empty Queue");
        } else {
            for (int i = front; i <= rear; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}

public class QueueUsingArray {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        Queue queue = new Queue();
        boolean repeat = true;

        while (repeat) {
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Peek");
            System.out.println("4. Show");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            try {
                int choice = read.nextInt();
                System.out.println("-------------------------------");
                switch (choice) {
                    case 1 -> {
                        System.out.print("Enter the element to enqueue: ");
                        int data = read.nextInt();
                        queue.enqueue(data);
                    }
                    case 2 -> {
                        int removed = queue.dequeue();
                        if (removed != -1)
                            System.out.println("The dequeued element is " + removed);
                        else
                            System.out.println("Empty Queue");
                    }
                    case 3 -> {
                        int peeked = queue.peek();
                        if (peeked != -1)
                            System.out.println("The element at peek is " + peeked);
                        else
                            System.out.println("Empty Queue");
                    }
                    case 4 -> {
                        System.out.print("Queue contents: ");
                        queue.show();
                    }
                    case 5 -> {
                        repeat = false;
                        System.out.println("Exiting...");
                    }
                    default -> System.out.println("Invalid Input");
                }
            } catch (InputMismatchException e) {
                System.out.println("Please enter a valid integer choice.");
                read.next();
            }
            System.out.println("-------------------------------");
        }
    }
}
