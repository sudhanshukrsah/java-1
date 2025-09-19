import java.util.Scanner;
public class ReverseWordsSentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();
        sc.close();
        String[] words = sentence.trim().split("\\s+");
        System.out.print("Reversed sentence: ");
        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i] + (i > 0 ? " " : ""));
        }
        System.out.println();
    }
}
