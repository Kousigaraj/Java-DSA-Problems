import java.util.Scanner;

class  RemoveDuplicates{
    public static int remove(int[] nums) {
        int k = 1;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] != nums[i-1]){
                nums[k] = nums[i];
                k++;
            }
        }
        return k;        
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers separated by spaces:");
        String input = scanner.nextLine();
        String[] inputStrings = input.trim().split("\\s+");
        int[] arr = new int[inputStrings.length];
        for(int i=0;i<inputStrings.length;i++){
            arr[i] = Integer.parseInt(inputStrings[i]);
        }
        int k = remove(arr);
        for(int i = 0; i < k; i++){
            System.out.print(arr[i] + " ");
        }
    } 
}