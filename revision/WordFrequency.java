import java.util.Scanner;
import java.util.HashMap;
public class WordFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine().toLowerCase();
        sc.close();
        String[] words = sentence.split("\\s+");
        HashMap<String, Integer> freq = new HashMap<>();
        for (String word : words) {
            freq.put(word, freq.getOrDefault(word, 0) + 1);
        }
        System.out.println("Word frequencies:");
        for (String word : freq.keySet()) {
            System.out.println(word + ": " + freq.get(word));
        }
    }
}
