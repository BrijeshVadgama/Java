
/**
 * palindrome_string
 */

import java.util.Scanner;

public class palindrome_string {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.nextLine();
        int i = 0, j = str.length() - 1, flag = 0;
        while (i < j && flag == 0) {
            if (str.charAt(i) != str.charAt(j)) {
                flag = 1;
                break;
            }
            i++;
            j--;
        }
        if (flag == 0) {
            System.out.println("String is Palindrome");
        } else {
            System.out.println("String is not Palindrome");
        }
        sc.close();
    }
}