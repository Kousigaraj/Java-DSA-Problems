import java.util.Scanner;

class BinarySearch {
    public static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target){
                return mid;
            }
            else if(nums[mid] < target){
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers separated by spaces:");
        String input = scanner.nextLine();
        String[] inputStrings = input.trim().split("\\s+");
        int[] arr = new int[inputStrings.length];
        for (int i = 0; i < inputStrings.length; i++) {
            arr[i] = Integer.parseInt(inputStrings[i]); 
        }
        System.out.println("Enter the target number:");
        int target = scanner.nextInt();

        int result = search(arr, target);
        if (result != -1) {
            System.out.println("Target found at index " + result);
        } else {
            System.out.println("Target not found in the array.");
        }
    }
}