
/**
 * prime_number_range
 */

import java.util.Scanner;

public class prime_number_range {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Start Number: ");
        int s = sc.nextInt();
        System.out.print("Enter End Number: ");
        int e = sc.nextInt();
        int flag = 0;
        for (int i = s; i <= e; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag++;
                    break;
                } else {
                    flag = 0;
                }
            }
            if (flag == 0) {
                System.out.println(i);
            }
        }

        sc.close();
    }
}