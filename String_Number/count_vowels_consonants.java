
/**
 * count_vowels
 */
import java.util.Scanner;

public class count_vowels_consonants {

    public static void main(String[] args) {
        int v = 0, c = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String ch = sc.nextLine();
        for (int i = 0; i < ch.length(); i++) {
            if (ch.charAt(i) == 'A' || ch.charAt(i) == 'E' || ch.charAt(i) == 'I' || ch.charAt(i) == 'O'
                    || ch.charAt(i) == 'U' || ch.charAt(i) == 'a' || ch.charAt(i) == 'e' || ch.charAt(i) == 'i'
                    || ch.charAt(i) == 'o' || ch.charAt(i) == 'u') {
                v++;
            } else {
                c++;
            }
        }
        System.out.println("Total Vowels in String is: " + v);
        System.out.println("Total Consonants in String is: " + c);
        sc.close();
    }
}