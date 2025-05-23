import java.util.Scanner;

class SelectionSort {
    public static void sort(int[] arr) {
        int minIndex;
        for (int i = 0; i < arr.length - 1; i++){
            minIndex = i;
            for(int j = i + 1; j < arr.length; j++){
                if(arr[minIndex] > arr[j])
                    minIndex = j;
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
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