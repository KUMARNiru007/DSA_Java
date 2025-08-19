public class first {

    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        // If we reach here, it means all digits were 9
        int[] newDigits = new int[digits.length + 1];
        newDigits[0] = 1;
        return newDigits;
    }

    public static void main(String[] args) {
        int[] digits = {1,2,5,9};
        int[] result = plusOne(digits);

        // print result
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
