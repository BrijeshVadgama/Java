
/**
 * palindrome_number
 */

import java.util.Scanner;

public class palindrome_number {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int no = sc.nextInt();
        int rev = 0, temp = no;
        while (no > 0) {
            rev = (rev * 10) + no % 10;
            no = no / 10;
        }
        if (rev == temp) {
            System.out.println(temp + " Number is Palindrome!");
        } else {
            System.out.println(temp + " Number is not Palindrome!");
        }
        sc.close();
    }
}