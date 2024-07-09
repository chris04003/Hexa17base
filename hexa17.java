public class Base17ToDecimal {
    public static int base17ToDecimal(String base17) {
        int decimal = 0;
        int length = base17.length();

        for (int i = 0; i < length; i++) {
            char digit = base17.charAt(length - 1 - i);
            int value;

            if (Character.isDigit(digit)) {
                value = digit - '0';
            } else {
                value = 10 + (digit - 'A');
            }

            decimal += value * Math.pow(17, i);
        }

        return decimal;
    }

    public static void main(String[] args) {
        String base17Number = "1A3";
        int decimalNumber = base17ToDecimal(base17Number);
        System.out.println("Base-17 number " + base17Number + " is " + decimalNumber + " in decimal.");
    }
}
