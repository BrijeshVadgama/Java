// W.A.P. to check given number is palindrome or not.

import java.util.Scanner;

public class Palindrome_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int no, temp, rev = 0;

        System.out.print("Enter Number: ");
        no = sc.nextInt();

        temp = no;

        while (no > 0) {
            rev = (rev * 10) + no % 10;
            no = no / 10;
        }

        if (temp == rev) {
            System.out.println(temp + " is Palindrome Number.!");
        } else {
            System.out.println(temp + " is not a Palindrome Number.!");
        }

        sc.close();
    }

}