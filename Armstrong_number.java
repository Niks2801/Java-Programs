import java.util.Scanner;

public class Armstrong_number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 100; i < 1000; i++) {
            if (isArmstrong(i)) {
                System.out.println(i + "");
            }
        }
    }

    private static boolean isArmstrong(int n) {
        int original = n;
        int sum = 0;
        int digits = (int) Math.log10(n) + 1;
        while (n > 0) {
            int rem = n % 10;
            sum += (int) Math.pow(rem, digits);
            n /= 10;
        }
        return sum == original;
    }
}