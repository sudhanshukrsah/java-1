import java.util.Scanner;
public class SumArrayRecursion {
    public static int sum(int[] arr, int idx) {
        if (idx == arr.length) return 0;
        return arr[idx] + sum(arr, idx + 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        sc.close();
        System.out.println("Sum: " + sum(arr, 0));
    }
}
