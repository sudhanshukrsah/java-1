import java.util.Scanner;
public class MergeSortedArraysNoExtraSpace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of first array: ");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("Enter " + n1 + " sorted integers:");
        for (int i = 0; i < n1; i++) arr1[i] = sc.nextInt();
        System.out.print("Enter size of second array: ");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        System.out.println("Enter " + n2 + " sorted integers:");
        for (int i = 0; i < n2; i++) arr2[i] = sc.nextInt();
        sc.close();
        // Merge in-place
        for (int i = 0; i < n1; i++) {
            if (arr1[i] > arr2[0]) {
                int temp = arr1[i];
                arr1[i] = arr2[0];
                arr2[0] = temp;
                // Move arr2[0] to correct position
                int first = arr2[0];
                int k;
                for (k = 1; k < n2 && arr2[k] < first; k++) {
                    arr2[k - 1] = arr2[k];
                }
                arr2[k - 1] = first;
            }
        }
        System.out.print("Merged array: ");
        for (int num : arr1) System.out.print(num + " ");
        for (int num : arr2) System.out.print(num + " ");
        System.out.println();
    }
}
