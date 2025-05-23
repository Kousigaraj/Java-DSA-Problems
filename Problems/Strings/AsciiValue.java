import  java.util.Scanner;

public class AsciiValue{
    public static void main(String[] args) {
        char ch;
        Scanner read = new Scanner(System.in);
        ch = read.next().charAt(0);
        System.out.println((int)ch);
    }
}