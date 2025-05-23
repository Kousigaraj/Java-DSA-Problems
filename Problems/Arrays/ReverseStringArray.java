import java.util.Scanner;

class ReverseStringArray {
    public  static void reverse(char[] arr){
        int i = 0;
        int j = arr.length - 1;
        while(i < j){
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String input = read.nextLine();
        char[] arr = new char[input.length()];
        for(int i = 0; i < input.length(); i++){
            arr[i] = input.charAt(i);
        }
        reverse(arr);
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]);
        }
    }
} 
