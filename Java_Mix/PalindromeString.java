import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // StringBuilder sb = new StringBuilder();
        System.out.print("Enter String To Reverse: ");
        String s = sc.nextLine();
        // sb.append(s);
        // sb.reverse();
        // System.out.println(sb);

        System.out.print("After reverse string is: ");
        for (int i = s.length() - 1; i >= 0; i--) {
            System.out.print(s.charAt(i));
        }

        sc.close();
    }
}
