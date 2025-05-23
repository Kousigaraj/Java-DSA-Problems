import java.util.InputMismatchException;
import java.util.Scanner;

class Queue {
    private int front = -1;
    private int rear = -1;
    private int size = 0;
    private final int capacity = 5;
    int[] arr = new int[capacity];

    public boolean isFull() {
        return size == capacity;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void enqueue(int data) {
        if (!isFull()) {
            if (front == -1 && rear == -1) {
            front = rear = 0;
            } else {
                rear = (rear + 1) % capacity;
            }
            arr[rear] = data;
            size++;

        } else {
            System.out.println("Queue is full");
        }
    }

    public int dequeue() {
        if (!isEmpty()) {
            int data = arr[front];
            if (front == rear) {
                // Only one element in queue
                front = rear = -1;
            } else {
                front = (front + 1) % capacity;
            }
            size--;
            return data;
        }
        else {
            return -1;
        }
        
    }

    public int peek() {
        if (!isEmpty()) {
            return arr[front];
        } else {
            return -1;
        }
    }

    public void show() {
        if (!isEmpty()) {
            int i = front;
            System.out.print("Queue: ");
            while (true) {
                System.out.print(arr[i] + " ");
                if (i == rear) break;
                i = (i + 1) % capacity;
            }
            System.out.println();
        }
        else {
            System.out.println("Empty Queue");
        }
    }
}

public class CircularQueue {
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
                    case 4 -> queue.show();
                    case 5 -> {
                        repeat = false;
                        System.out.println("Exiting...");
                    }
                    default -> System.out.println("Invalid Input");
                }
            } catch (InputMismatchException e) {
                System.out.println("Please enter a valid integer choice.");
                read.next(); // Clear invalid input
            }
            System.out.println("-------------------------------");
        }

    }
}
