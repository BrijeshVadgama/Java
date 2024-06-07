
/**
 * remove_space
 */

import java.util.Scanner;

public class remove_space {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String ch = sc.nextLine();
        String ans = ch.replaceAll("\\s", "");
        System.out.println("After Removing Space: " + ans);
        sc.close();
    }
}