import java.util.Scanner;
import java.util.HashMap;
public class CharFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        sc.close();
        HashMap<Character, Integer> freq = new HashMap<>();
        for (char c : input.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }
        System.out.println("Character frequency:");
        for (char c : freq.keySet()) {
            System.out.println(c + " = " + freq.get(c));
        }
    }
}
