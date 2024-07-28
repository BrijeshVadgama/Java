import java.util.Scanner;

public class Distance {

    public static int countDistance(int num1, int num2) {
        int xorResult = num1 ^ num2;
        int distance = 0;
        while (xorResult != 0) {
            distance += xorResult & 1;
            xorResult >>= 1;
        }
        return distance;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        int distance = countDistance(num1, num2);
        System.out.println("The distance between " + num1 + " and " + num2 + " is " + distance + ".");

        scanner.close();
    }
}
