import java.util.Scanner;
import java.util.HashSet;
public class RemoveDuplicatesArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        HashSet<Integer> set = new HashSet<>();
        System.out.print("Array after removing duplicates: ");
        for (int num : arr) {
            if (set.add(num)) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }
}
