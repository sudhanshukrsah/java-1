import java.util.Scanner;
public class AllSubsetsArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        sc.close();
        int total = 1 << n;
        System.out.println("All subsets:");
        for (int mask = 0; mask < total; mask++) {
            System.out.print("[");
            boolean first = true;
            for (int j = 0; j < n; j++) {
                if ((mask & (1 << j)) != 0) {
                    if (!first) System.out.print(", ");
                    System.out.print(arr[j]);
                    first = false;
                }
            }
            System.out.println("]");
        }
    }
}
