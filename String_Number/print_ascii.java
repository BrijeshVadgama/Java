
/**
 * print_ascii
 */

import java.util.Scanner;

public class print_ascii {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Character: ");
        char ch = sc.next().charAt(0);
        int a = ch;
        System.out.println("ASCII Value of " + ch + " is: " + a);
        sc.close();
    }
}