
/**
 * reverse_string
 */

import java.util.Scanner;

public class reverse_string {

    public static void main(String[] args) {
        String res = "";
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String ch = sc.nextLine();
        for (int i = ch.length() - 1; i >= 0; i--) {
            res += ch.charAt(i);
        }
        System.out.println(res);
        sc.close();
    }
}