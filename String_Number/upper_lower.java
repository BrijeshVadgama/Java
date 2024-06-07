
/**
 * upper_lower
 */

import java.util.Scanner;

public class upper_lower {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String input = sc.nextLine();

        String result = "";

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                result += Character.toLowerCase(ch);
            } else if (ch >= 'a' && ch <= 'z') {
                result += Character.toUpperCase(ch);
            }
        }

        System.out.println(result);
        sc.close();
    }
}
