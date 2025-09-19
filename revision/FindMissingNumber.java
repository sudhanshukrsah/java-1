import java.util.Scanner;
public class FindMissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n (range 1 to n): ");
        int n = sc.nextInt();
        int[] arr = new int[n - 1];
        System.out.println("Enter " + (n - 1) + " integers:");
        int sum = 0;
        for (int i = 0; i < n - 1; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        sc.close();
        int total = n * (n + 1) / 2;
        int missing = total - sum;
        System.out.println("Missing number: " + missing);
    }
}
