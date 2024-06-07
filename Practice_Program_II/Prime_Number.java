// W.A.P. to check given number is prime or not.

import java.util.Scanner;

public class Prime_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no;
        System.out.print("Enter Number: ");
        no = sc.nextInt();

        int i = 1, flag = 0;

        while (i <= no) {
            if (no % i == 0) {
                flag++;
            }
            i++;
        }

        if (flag == 2) {
            System.out.println(no + " is a Prime Number.!");
        } else {
            System.out.println(no + " is not a Prime Number.!");
        }
        sc.close();
    }

}