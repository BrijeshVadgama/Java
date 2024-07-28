// W.A.P. to print odd numbers that are divisible by 7 but not divisible by 3 between 150 and 445.

import java.util.Scanner;

public class Divide_By_7_Not_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        for (i = 150; i < 445; i++) {
            if (i % 7 == 0 && i % 3 != 0) {
                System.out.print(i + " ");
            }
            sc.close();
        }
    }

}