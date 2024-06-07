
/**
 * count_lowercase
 */

import java.util.Scanner;

public class count_lowercase {

    public static void main(String[] args) {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String ch = sc.nextLine();
        for (int i = 0; i < ch.length(); i++) {
            if (ch.charAt(i) >= 'a' && ch.charAt(i) <= 'z') {
                count++;
            }
        }
        System.out.println("Total Lowercase in String is: " + count);
        sc.close();
    }
}