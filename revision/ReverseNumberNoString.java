import java.util.Scanner;
public class ReverseNumberNoString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
        sc.close();
        boolean negative = num < 0;
        int temp = Math.abs(num);
        long rev = 0; // use long to detect overflow
        while (temp != 0) {
            rev = rev * 10 + (temp % 10);
            temp /= 10;
        }
        if (negative) rev = -rev;
        // If you need to ensure it fits in int range
        if (rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE) {
            System.out.println("Reversed value overflows int range: " + rev);
        } else {
            System.out.println("Reversed number: " + (int)rev);
        }
    }
}
