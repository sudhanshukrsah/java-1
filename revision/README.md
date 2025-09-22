# Java Core Concepts Revision

This folder contains Java programs for revision and practice, covering core concepts and common interview problems. Each problem includes a process approach, tips, and key concepts.

## Core Concepts
1. `VariablesDemo.java` - Demonstrates declaration and usage of different variable types (int, double, char, boolean, String).
   - Tip: Always initialize variables before use.
2. `OperatorsDemo.java` - Shows arithmetic, increment/decrement, and modulus operators.
   - Tip: Understand operator precedence for complex expressions.
3. `ControlFlowDemo.java` - Covers if-else, for loop, and while loop.
   - Tip: Use loops for repetitive tasks and conditions for decision making.
4. `ArrayDemo.java` - Introduces arrays and element access.
   - Tip: Arrays are zero-indexed; use length property for bounds.
5. `MethodDemo.java` - Explains method definition and calling.
   - Tip: Methods help organize code and enable reuse.
6. `ClassObjectDemo.java` - Shows class creation and object instantiation.
   - Tip: Use constructors to initialize object state.
7. `InheritanceDemo.java` - Demonstrates inheritance and method access.
   - Tip: Inheritance enables code reuse and hierarchy.
8. `PolymorphismDemo.java` - Explains method overriding and dynamic method dispatch.
   - Tip: Polymorphism allows flexible and extensible code.
9. `InterfaceDemo.java` - Shows interface implementation.
   - Tip: Interfaces define contracts for classes.
10. `ExceptionDemo.java` - Demonstrates try-catch for error handling.
   - Tip: Always handle exceptions to avoid program crashes.

## Common Problems & Interview Questions
11. `ReverseString.java` - Reverse a string using StringBuilder.
   - Approach: Read input, use StringBuilder's reverse method.
   - Tip: Strings are immutable; use StringBuilder for modifications.
12. `PalindromeNumber.java` - Check if a number reads the same backward.
   - Approach: Reverse the number and compare with original.
   - Tip: Use modulo and division to extract digits.
13. `FactorialRecursion.java` - Calculate factorial using recursion.
   - Approach: Base case for n <= 1, recursive call for n * factorial(n-1).
   - Tip: Recursion simplifies problems with repetitive structure.
14. `FibonacciSeries.java` - Print first n Fibonacci numbers.
   - Approach: Use loop to generate sequence.
   - Tip: First two terms are 0 and 1.
15. `LargestOfThree.java` - Find largest of three numbers.
   - Approach: Use if-else comparisons.
   - Tip: Compare each number with others.
16. `PrimeNumberCheck.java` - Check if a number is prime.
   - Approach: Check divisibility from 2 to sqrt(n).
   - Tip: 1 is not prime; only divisible by 1 and itself.
17. `CountVowels.java` - Count vowels in a string.
   - Approach: Iterate and check for 'a', 'e', 'i', 'o', 'u'.
   - Tip: Convert string to lowercase for uniformity.
18. `ArmstrongNumber.java` - Check if a number is Armstrong.
   - Approach: Sum each digit raised to the power of number of digits.
   - Tip: Use Math.pow for exponentiation.
19. `SumOfDigits.java` / `SumOfDigits2.java` - Sum digits of an integer.
   - Approach: Use modulo and division to extract and sum digits.
   - Tip: Loop until number becomes zero.
20. `ArraySorting.java` - Sort array using bubble sort.
   - Approach: Compare and swap adjacent elements.
   - Tip: Bubble sort is simple but not efficient for large arrays.
21. `SecondLargestInArray.java` - Find second largest element.
   - Approach: Track largest and second largest while iterating.
   - Tip: Handle duplicate values and edge cases.
22. `AnagramCheck.java` / `AnagramChecker.java` - Check if two strings are anagrams.
   - Approach: Sort and compare character arrays.
   - Tip: Remove spaces and convert to lowercase before checking.
23. `MatrixMultiplication.java` / `MatrixMultiplication2.java` - Multiply two matrices.
   - Approach: Use nested loops for multiplication.
   - Tip: Number of columns in first matrix must equal rows in second.
24. `CountWords.java` - Count words in a sentence.
   - Approach: Split string by whitespace.
   - Tip: Use trim and split("\\s+") for accurate count.
25. `PrimeNumbersRange.java` - Print all primes in a range.
   - Approach: Loop through range and check primality.
   - Tip: Optimize by checking up to sqrt(n).
26. `StudentManagement.java` - Student class with grade calculation.
   - Approach: Use class attributes and methods for logic.
   - Tip: Encapsulate logic in methods for clarity.
27. `WordFrequency.java` - Print frequency of each word in a sentence.
   - Approach: Use HashMap to count occurrences.
   - Tip: Convert to lowercase and split by whitespace.
28. `LargestOfThreeIfElse.java` - Find largest using if-else.
   - Approach: Compare each number using if-else blocks.
   - Tip: Use >= for equality cases.
29. `EvenOddCountArray.java` - Count even and odd numbers in array.
   - Approach: Iterate and use modulo to check parity.
   - Tip: Initialize counters for even and odd.
30. `TransposeMatrix.java` - Print transpose of a matrix.
   - Approach: Swap rows and columns while printing.
   - Tip: Use nested loops for traversal.
31. `StringRotationCheck.java` - Check if one string is a rotation of another.
   - Approach: Concatenate first string with itself and check if second is substring.
   - Tip: Lengths must be equal for rotation.

## Additional Array & String Utilities
32. `RemoveDuplicatesArray.java` - Remove duplicate elements while preserving first occurrences.
   - Approach: Use a HashSet to track seen values; print/add only unseen.
   - Tip: For in-place without extra space, you'd sort first then compress.
33. `PrimeNumberSimple.java` - Simpler prime check (duplicate concept reinforcement).
   - Approach: Trial division up to sqrt(n).
   - Tip: Reusable logic for other number theory problems.
34. `ReverseWordsSentence.java` - Reverse word order in a sentence.
   - Approach: Split on whitespace, iterate backwards.
   - Tip: Use `trim()` and `split("\\s+")` to normalize spaces.
35. `FindMissingNumber.java` - Find missing number in 1..n range.
   - Approach: Sum formula n(n+1)/2 minus sum of provided elements.
   - Tip: Works only when exactly one number is missing and no duplicates.
36. `SimpleCalculatorSwitch.java` - Basic arithmetic via switch.
   - Approach: Switch on operator char, guard division by zero.
   - Tip: Consider BigDecimal for precision in real apps.
37. `RotateArrayK.java` - Rotate array right by k.
   - Approach: Triple reverse method (reverse whole, part1, part2).
   - Tip: Always reduce k with k % n.
38. `CharFrequency.java` - Case-sensitive character frequencies.
   - Approach: HashMap<Character,Integer> counting.
   - Tip: For ordered output use LinkedHashMap or TreeMap.
39. `PangramCheck.java` - Determine if sentence uses all letters.
   - Approach: Boolean array of size 26.
   - Tip: Ignore non-letter characters.
40. `MergeSortedArraysNoExtraSpace.java` - Merge two sorted arrays in place.
   - Approach: Iterate first array; swap with first of second if larger, then insert that element into correct position in second.
   - Tip: For better efficiency use gap method (Shell-like) for O((n+m) log(n+m)).
41. `ReverseString.java` (earlier) + `StringRotationCheck.java` synergy.
   - Tip: Many string problems reduce to indexing & concatenation patterns.

## Data Structures Implementations
42. `LibraryManagement.java` - Simple library system with add/remove/search.
   - Approach: `ArrayList<Book>` storing objects; linear search for match.
   - Tip: Replace with Map / database for scalability.
43. `CustomLinkedList.java` - Singly linked list with insert, delete, display.
   - Approach: Maintain head; traverse to tail for append; adjust links to delete.
   - Tip: Track tail pointer to make inserts O(1).
44. `QueueUsingTwoStacks.java` - Queue semantics using two stacks.
   - Approach: Push to s1; on dequeue move to s2 when s2 empty.
   - Tip: Amortized O(1) per operation.

## Algorithms & Patterns
45. `SpiralMatrixTraversal.java` - Spiral order traversal of matrix.
   - Approach: Maintain four boundaries (top, bottom, left, right) and shrink.
   - Tip: Guard each phase with boundary checks.
46. `BalancedParentheses.java` - Validate bracket pairing.
   - Approach: Stack push opens; on close pop and match.
   - Tip: Early exit on mismatch to save time.
47. `FirstNonRepeatingChar.java` - First unique character.
   - Approach: Frequency map then second pass for order.
   - Tip: LinkedHashMap can combine order + counts in one traversal.
48. `AllSubsetsArray.java` - Power set of array.
   - Approach: Bit masking from 0..(2^n - 1).
   - Tip: For large n, recursion or pruning may be clearer but exponential time inevitable.
49. `SudokuValidator.java` - Validate Sudoku state (rows, cols, 3x3 blocks).
   - Approach: For each index track row/col/block seen numbers with boolean arrays.
   - Tip: Zeros treated as blanks (ignored) here.
50. `LongestPalindromicSubstring.java` - Expand-around-center approach.
   - Approach: For each index expand for odd and even centers; track max window.
   - Tip: O(n^2) time; Manacher's algorithm gives O(n).

## File I/O & Concurrency
51. `FileHandlingCount.java` - Count lines, words, characters from file.
   - Approach: BufferedReader line iteration, split words.
   - Tip: Consider counting bytes separately for encoding concerns.
52. `MultithreadingEvenOdd.java` - Two threads printing sequences.
   - Approach: Separate Thread subclasses without synchronization (order not guaranteed).
   - Tip: Use join()/synchronization if deterministic ordering required.

## Number Theory & Misc Reinforcement
53. `PrimeNumbersRange.java` (earlier) and `PrimeNumberSimple.java` illustrate range vs single-number validation.
   - Tip: For many queries, precompute primes via Sieve of Eratosthenes.

## How to Extend Further
- Add unit tests (e.g., JUnit) for algorithmic classes.
- Introduce generics for data structures (e.g., LinkedList<T>).
- Refactor repeated Scanner patterns into utility methods.
- Implement alternative algorithms (e.g., merge sort, quick sort, sieve, BFS/DFS graphs).

## How to Run

1. Open a terminal and navigate to this `revision` folder.
2. Compile any program, e.g.:
   ```shell
   javac VariablesDemo.java
   ```
3. Run the program:
   ```shell
   java VariablesDemo
   ```

Repeat for other files as needed. Replace `VariablesDemo` with the desired filename (without `.java`).
