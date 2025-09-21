import java.util.Scanner;
import java.util.Stack;
public class BalancedParentheses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter parentheses string: ");
        String s = sc.nextLine();
        sc.close();
        Stack<Character> stack = new Stack<>();
        boolean balanced = true;
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' || c == '}' || c == ']') {
                if (stack.isEmpty()) { balanced = false; break; }
                char top = stack.pop();
                if ((c == ')' && top != '(') ||
                    (c == '}' && top != '{') ||
                    (c == ']' && top != '[')) {
                    balanced = false; break;
                }
            }
        }
        if (!stack.isEmpty()) balanced = false;
        System.out.println(balanced ? "Balanced" : "Not Balanced");
    }
}
