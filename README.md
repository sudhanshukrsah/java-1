# HelloWorld Java Program

This repository demonstrates core Java concepts for beginners and revision purposes. It includes:

- A detailed HelloWorld program with comments and multiple Java syntax features
- 10 revision programs covering variables, operators, control flow, arrays, methods, classes/objects, inheritance, polymorphism, interfaces, and exceptions (see `revision/README.md`)

## Java Documentary

Java is a high-level, object-oriented programming language developed by Sun Microsystems (now Oracle). It is platform-independent due to the Java Virtual Machine (JVM), which allows compiled Java code to run on any system with a JVM.

### Key Features
- **Object-Oriented:** Supports classes, objects, inheritance, polymorphism, encapsulation, and abstraction.
- **Platform Independent:** Write once, run anywhere (WORA) using JVM.
- **Robust:** Strong memory management, exception handling, and type checking.
- **Multithreaded:** Supports concurrent execution of two or more threads.
- **Secure:** Provides a secure environment for code execution.

### Basic Syntax
- Every Java application must have a `main` method as the entry point.
- Statements end with a semicolon `;`.
- Classes are defined using the `class` keyword.
- Comments can be single-line (`//`) or multi-line (`/* ... */`).

### Example: HelloWorld with Java Syntax Features

```java
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
```

## How to Run

1. Open a terminal and navigate to the `java-1` directory.
2. Compile the program:
   ```shell
   javac HelloWorld.java
   ```
3. Run the program:
   ```shell
   java HelloWorld
   ```

## Output
```
Hello, World!
Year: 2025
Loop iteration: 1
Loop iteration: 2
Loop iteration: 3
Welcome, Java Learner!
```
