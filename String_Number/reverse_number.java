
/**
 * reverse_number
 */

import java.util.Scanner;

public class reverse_number {

    public static void main(String[] args) {
        int rev = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int no = sc.nextInt();
        while (no > 0) {
            rev = (rev * 10) + no % 10;
            no = no / 10;
        }
        System.out.println("Reverse Number = " + rev);
        sc.close();
    }
}