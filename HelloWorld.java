// This is a simple Java program demonstrating basic syntax
public class HelloWorld {
    // main method: entry point of the program
    public static void main(String[] args) {
        String message = "Hello, World!";
        int year = 2025;
        System.out.println(message); // prints Hello, World!
        System.out.println("Year: " + year); // prints the year

        // Using a for loop
        for (int i = 1; i <= 3; i++) {
            System.out.println("Loop iteration: " + i);
        }

        // Using a method
        greet("Java Learner");
    }

    // Method definition
    public static void greet(String name) {
        System.out.println("Welcome, " + name + "!");
    }
}
