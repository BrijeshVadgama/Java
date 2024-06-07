
/**
 * sum_digit
 */

import java.util.Scanner;

public class sum_digit {

    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int no = sc.nextInt();
        while (no > 0) {
            sum = sum + no % 10;
            no = no / 10;
        }
        System.out.println("Sum of digit = " + sum);
        sc.close();
    }
}