import java.util.Scanner;

class InsertionSort {
    public static void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++){
            int j = i - 1;
            int key = arr[i];
            while (j >= 0 && arr[j] > key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }

    }
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String[] input = read.nextLine().trim().split("\\s+");
        int[] arr = new int[input.length];
        for (int i = 0; i < input.length; i++){
            arr[i] = Integer.parseInt(input[i]);
        }
        System.out.println("Elements Before sorting:");
        for (int val: arr){
            System.out.print(val +" ");
        }

        sort(arr);

        System.out.println();
        System.out.println("Elements After sorting:");
        for (int val: arr){
            System.out.print(val +" ");
        }
    }
}