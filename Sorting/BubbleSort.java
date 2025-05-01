import  java.util.Scanner;

class BubbleSort {
    public static void sort(int[] arr) {
        int size = arr.length;
        int temp;
        for (int i = 0; i < size; i++){
            for(int j = 0; j < size - i - 1; j++){
                if(arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter number to sort saparated by space:");
        String[] input = read.nextLine().trim().split("\\s+");
        int[] arr = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }
        System.out.println("Elements Before sorting:");
        for(int val: arr){
            System.out.print(val + " ");
        }
        sort(arr);
        System.out.println();
        System.out.println("Elements After sorting:");
        for(int val: arr){
            System.out.print(val + " ");
        }
    }
}