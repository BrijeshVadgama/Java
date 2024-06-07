
/**
 * count_uppercase
 */

import java.util.Scanner;

public class count_uppercase {

    public static void main(String[] args) {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String ch = sc.nextLine();
        for (int i = 0; i < ch.length(); i++) {
            if (ch.charAt(i) >= 'A' && ch.charAt(i) <= 'Z') {
                count++;
            }
        }
        System.out.println("Total Uppercase in String: " + count);
        sc.close();
    }
}