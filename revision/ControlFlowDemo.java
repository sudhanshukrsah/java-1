public class ControlFlowDemo {
    public static void main(String[] args) {
        int num = 7;
        if (num > 5) {
            System.out.println("Greater than 5");
        } else {
            System.out.println("Not greater than 5");
        }
        for (int i = 1; i <= 3; i++) {
            System.out.println("For loop: " + i);
        }
        int j = 1;
        while (j <= 3) {
            System.out.println("While loop: " + j);
            j++;
        }
    }
}
