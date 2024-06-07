// W.A.P. to read n numbers in an array and print the sum of odd numbers & even numbers.

import java.util.Scanner;

public class Odd_Even_Sum_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int no, i, Ocount = 0, Ecount = 0;

        System.out.print("Enter how many elements do you want: ");
        no = sc.nextInt();

        int arr[] = new int[no];

        for (i = 0; i < arr.length; i++) {
            System.out.print("Enter Element " + (i + 1) + " : ");
            arr[i] = sc.nextInt();
        }

        for (i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                Ecount += arr[i];
            } else {
                Ocount += arr[i];
            }
        }

        System.out.println("Even: " + Ecount);
        System.out.println("Odd: " + Ocount);

        sc.close();
    }

}