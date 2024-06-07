
/**
 * prime_number
 */
import java.util.Scanner;

public class prime_number {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int no = sc.nextInt();
        int i = 1, flag = 0;
        while (i <= no) {
            if (no % i == 0) {
                flag++;
            }
            i++;
        }
        if (flag == 2) {
            System.out.println(no + " is Prime Number!");
        } else {
            System.out.println(no + " is not a Prime Number!");
        }
        sc.close();
    }
}