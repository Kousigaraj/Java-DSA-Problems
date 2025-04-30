import java.util.Scanner;

class ValidPalindrome {
    public static  boolean isPalindrome(String s) {
        String rex = "[^a-zA-Z0-9]";
        String original = s.replaceAll(rex,"").toLowerCase();
        String reverse = "";
        for(int i = 0; i < original.length();i++){
            reverse = original.charAt(i) + reverse;
        }
        if(original.compareTo(reverse) == 0)
        return true;
        else
        return false;
    }
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String input = read.nextLine();
        System.out.println(isPalindrome(input));
    } 
}