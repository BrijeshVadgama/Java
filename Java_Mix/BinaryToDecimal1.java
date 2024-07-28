public class BinaryToDecimal1 {
    public static double cB2D(String b) {
        String[] p = b.split("\\.");
        String i = p[0];
        String f = p.length > 1 ? p[1] : "";

        int dI = Integer.parseInt(i, 2);

        double dF = 0.0;
        for (int j = 0; j < f.length(); j++) {
            if (f.charAt(j) == '1') {
                dF += 1.0 / (1 << (j + 1));
            }
        }

        return dI + dF;
    }

    public static void main(String[] args) {
        String b = "101.110";
        double d = cB2D(b);
        System.out.println("The decimal representation of the binary string " + b + " is " + d);
    }
}
