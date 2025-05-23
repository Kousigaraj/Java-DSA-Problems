import java.util.Scanner;

public class CountVowelsConsonants {
    public static void countVowelsAndConsonants(String str){
        int vowel = 0;
        int consonant = 0;

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if (Character.isLetter(ch)) {
                switch(ch) {
                    case 'a': case 'e': case 'i': case 'o': case 'u':
                    case 'A': case 'E': case 'I': case 'O': case 'U':
                        vowel++;
                        break;
                    default:
                        consonant++;
                        break;
                }
            }
        }

        System.out.println("Vowels: " + vowel + ", Consonants: " + consonant);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        countVowelsAndConsonants(str);
    }
}
