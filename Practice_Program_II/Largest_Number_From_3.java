// W.A.P. to find the largest number from given 3 numbers using conditional operator.

import java.util.Scanner;

public class Largest_Number_From_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2, n3;
        System.out.print("Enter Number 1: ");
        n1 = sc.nextInt();
        System.out.print("Enter Number 2: ");
        n2 = sc.nextInt();
        System.out.print("Enter Number 3: ");
        n3 = sc.nextInt();

        if (n1 > n2) {
            if (n1 > n3) {
                System.out.println(n1 + " is Large..");
            } else {
                System.out.println(n3 + " is Large..");
            }
        } else {
            if (n2 > n3) {
                System.out.println(n2 + " is Large..");
            } else {
                System.out.println(n3 + " is Large..");
            }
        }

        sc.close();
    }

}