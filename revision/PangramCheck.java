import java.util.Scanner;
public class PangramCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine().toLowerCase();
        sc.close();
        boolean[] seen = new boolean[26];
        for (char c : sentence.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                seen[c - 'a'] = true;
            }
        }
        boolean isPangram = true;
        for (boolean b : seen) {
            if (!b) { isPangram = false; break; }
        }
        if (isPangram) {
            System.out.println("Pangram");
        } else {
            System.out.println("Not a pangram");
        }
    }
}
