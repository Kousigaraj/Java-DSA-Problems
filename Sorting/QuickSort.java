import java.util.Scanner;

class QuickSort {

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low-1;
        for(int j = low; j < high; j++){
            if(arr[j] < pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
        
        return i+1;
    }

    public static void sort(int[] arr, int low, int high) {
        if(low < high){
            int pivot = partition(arr, low, high);
            sort(arr, low, pivot-1);
            sort(arr, pivot + 1, high);
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
        sort(arr, 0, arr.length-1);
        System.out.println();
        System.out.println("Elements After sorting:");
        for(int val: arr){
            System.out.print(val + " ");
        }
    }
}