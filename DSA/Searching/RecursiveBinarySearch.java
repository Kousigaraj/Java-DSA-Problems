import java.util.Scanner;

class RecursiveBinarySearch {

    public static int search(int[] arr, int target, int left, int right) {
        if(left <= right){
            int mid = (left + right) / 2;
            if(arr[mid] == target)
                return mid;
            else if(arr[mid] < target)
                return search(arr, target, mid + 1, right);
            else
                return search(arr, target, left, mid - 1);   
        }
        return  -1;
    }
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.err.println("Enter numbers separated by spaces:");
        String input = read.nextLine();
        String[] inputStrings = input.trim().split("\\s+");
        int[] arr = new int[inputStrings.length];
        for (int i = 0; i < inputStrings.length; i++){
            arr[i] = Integer.parseInt(inputStrings[i]);
        }
        System.err.println("Enter the target number:");
        int target = read.nextInt();

        int result = search(arr, target, 0, arr.length - 1);

        if (result != -1) {
            System.out.println("Target found at index " + result);
        } else {
            System.out.println("Target not found in the array.");
        }
    }
}