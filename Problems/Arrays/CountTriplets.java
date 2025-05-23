import java.util.Scanner;
class CountTriplets{
    public static int count(int[] arr, int n){
        int count = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                for(int k=j+1;k<arr.length;k++){
                    if(arr[i]*arr[j]*arr[k] == n)
                        count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        read.nextLine();
        String input = read.nextLine();
        String[] inputStrings = input.trim().split("\\s+");
        int[] arr = new int[inputStrings.length];
        for(int i=0;i<inputStrings.length;i++){
            arr[i] = Integer.parseInt(inputStrings[i]);
        }
        System.out.println(count(arr,n));
    }

}