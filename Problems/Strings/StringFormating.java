import java.util.Scanner;

class StringFormating{
    public static String format(String s, char c, int n) {
        int mid = s.length() / 2;
        String m = "";
        for (int i = 0; i < n; i++) {
            m += c;
        }
        return s.substring(0, mid) + m + s.substring(mid, s.length());
    }
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String s = read.nextLine();
        char c = read.next().charAt(0);
        int n = read.nextInt();
        System.out.println(format(s, c, n));
    }

}