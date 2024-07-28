
/**
 *    1
     1 1
    1 2 1
   1 3 3 1
  1 4 6 4 1
 * 
 */

import java.util.Scanner;

public class PascalPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int no = sc.nextInt();
        int spaces = no;
        int num = 1;
        for (int i = 0; i < no; i++) {
            for (int k = 0; k <= spaces; k++) {
                System.out.print(" ");
            }
            num = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(num + " ");
                num = num * (i - j) / (j + 1);
            }
            spaces--;
            System.out.println();
        }
        sc.close();
    }
}
