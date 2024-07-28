public class BinaryToDecimal {
    public static void main(String[] args) {
        String binaryString = "1010.10";
        double decimal = binaryToDecimal(binaryString);
        System.out.println("Decimal value of " + binaryString + " is: " + decimal);
    }

    public static double binaryToDecimal(String binaryString) {
        String[] parts = binaryString.split("\\.");
        int integerPart = Integer.parseInt(parts[0], 2);
        double fractionalPart = 0;
        if (parts.length > 1) {
            String fraction = parts[1];
            for (int i = 0; i < fraction.length(); i++) {
                if (fraction.charAt(i) == '1') {
                    fractionalPart += 1 / Math.pow(2, i + 1);
                }
            }
        }
        return integerPart + fractionalPart;
    }
}
