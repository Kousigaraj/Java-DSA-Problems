import java.util.Scanner;

class LinearSearch{
    public static int linearSearch(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        String str = read.nextLine();
        String[] str1 = str.trim().split("\\s+");
        int[] arr = new int[str1.length];
        for(int i=0;i<str1.length;i++){
            arr[i] = Integer.parseInt(str1[i]);
        }
        int target = read.nextInt();
        int ans = linearSearch(arr,target);
        if(ans == -1){
            System.out.println("Target not found");
        }else{
            System.out.println("Target found at index "+ans);
        }
    }
}