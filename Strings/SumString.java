import java.util.Scanner;

class SumString {
    public static int sum(int num){
        int sum = 0;
        while(num > 0){
            sum += num % 10;
            num = num / 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String input = read.nextLine();
        int num = Integer.parseInt(input);
        int result = sum(num);
        System.out.println(result);
    }
}