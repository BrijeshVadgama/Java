
/**
 * extract_alphabets_numbers
 */

import java.util.Scanner;

public class extract_alphabets_numbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.nextLine();
        System.out.println(str.replaceAll("[0-9]", ""));
        System.out.println(str.replaceAll("[^0-9]", ""));
        sc.close();
    }
}