import java.util.Scanner;
public class StringRotationCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String s1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String s2 = sc.nextLine();
        sc.close();
        if (s1.length() == s2.length() && (s1 + s1).contains(s2)) {
            System.out.println("Rotation: Yes");
        } else {
            System.out.println("Rotation: No");
        }
    }
}
