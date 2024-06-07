// W.A.P. to print series 1, 3, 6, 10, 15, …

import java.util.Scanner;

public class Print_Series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no, i;

        System.out.print("Enter Number to Print Series: ");
        no = sc.nextInt();

        for (i = 1; i <= no; i++) {
            int n = i * (i + 1) / 2;
            System.out.print(n + " ");
            sc.close();
        }

    }

}