// W.A.P. to check given number is odd or even using bitwise operator.

import java.util.Scanner;

public class Odd_Even_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no;

        System.out.print("Enter Number: ");
        no = sc.nextInt();

        if ((no & 1) == 0) {
            System.out.println(no + " is Even.!");
        } else {
            System.out.println(no + " is Odd.!");
        }

        sc.close();
    }

}
