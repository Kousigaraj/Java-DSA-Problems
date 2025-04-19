import java.util.Scanner;

class ReverseBasedOnLastDigit{
    public static void sort(String[] a){
        String temp;
        for(int i = 0 ; i < a.length; i++){
            for(int j = i + 1; j < a.length; j++){
                // Compare based on last digit
                if(Integer.parseInt(a[i]) % 10 > Integer.parseInt(a[j]) % 10){
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers separated by spaces:");
        String input = scanner.nextLine();
        String[] inputStrings = input.trim().split("\\s+");

        sort(inputStrings);

        System.out.println("Sorted based on last digit:");
        for(int i = 0; i < inputStrings.length; i++){
            System.out.print(inputStrings[i] + " ");
        }

        scanner.close();
    }
}