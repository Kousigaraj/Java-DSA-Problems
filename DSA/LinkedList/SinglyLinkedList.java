import java.util.Scanner;

class Node {
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head = null;

    public void add(int data) {
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }
        else {
            Node current = head;
            while(current.next != null){
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void addFirst(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void addAt(int index, int data){
        Node newNode = new Node(data);

        if(index == 0){
            newNode.next = head;
            head = newNode;
        } else {
            Node current = head;
            int count = 0;
            while(current.next != null && count < index - 1){
                current = current.next;
                count++;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
    }

    public void delete(int data){
        if(head == null) return;
        if(head.data == data){
            head = head.next;
        }
        else{
            Node current = head;
            while(current.next != null && current.next.data != data){
                current = current.next;
            }
            if(current.next != null){
                current.next = current.next.next;
            }
            
        }
    }

    public void printValues() {
        Node current = head;
        while(current != null){
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}


public class SinglyLinkedList {
    public static void main(String[] args) {
        LinkedList nums = new LinkedList();
        Scanner read = new Scanner(System.in);
        boolean repeat = true;
        while (repeat) { 
            System.out.println("1.Add \n2.Add at Begining \n3.Add at Middle \n4.Delete \n5.Print \n6.Exit");
            System.out.print("Enter your choice: ");
            int choice = read.nextInt();
            System.out.println("-------------------------------");
            switch (choice) {
                case 1 -> {
                    System.out.print("Enter the Data: ");
                    int data = read.nextInt();
                    nums.add(data);
                }
                case 2 -> {
                    System.out.print("Enter the Data: ");
                    int data = read.nextInt();
                    nums.addFirst(data);
                }
                case 3 -> {
                    System.out.print("Enter the Data: ");
                    int data = read.nextInt();
                    System.out.print("Enter the Index: ");
                    int index = read.nextInt();
                    nums.addAt(index, data);
                }
                case 4 -> {
                    System.out.print("Enter the Data to delete: ");
                    int data = read.nextInt();
                    nums.delete(data);
                }
                case 5 -> nums.printValues();
                case 6 -> repeat = false;
                default -> System.out.println("Invalid Input");
                    
            }
            System.out.println("-------------------------------");
        }
    }
}