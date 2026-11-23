package java_basics;

import java.util.Scanner;

/**
 * ============================================================================
 * JAVA INPUT STREAM MASTERCLASS
 * ============================================================================
 * Purpose: A complete, beginner-friendly, yet developer-grade guide to reading
 *          user input in Java using the `Scanner` class.
 *
 * How it works:
 * System.in  -> Raw byte stream from your keyboard.
 * Scanner    -> A translator that converts those raw bytes into Java data types
 *               (int, String, double, boolean, etc.).
 * ============================================================================
 */
public class Input {

    public static void main(String[] args) {

        // 1. INITIALIZATION
        // Connect the Scanner object to the standard keyboard input stream (System.in)
        Scanner sc = new Scanner(System.in);

        System.out.println("=== 🚀 DEVELOPER PROFILE BUILDER ===");
        System.out.println("Follow the prompts to test different Java input methods.\n");

        // --------------------------------------------------------------------
        // 2. READING SINGLE WORDS vs. FULL SENTENCES
        // --------------------------------------------------------------------
        // next() reads only until the first SPACE.
        System.out.print("1. Enter your First Name (single word): ");
        String firstName = sc.next();

        // CRITICAL CLEANUP: next() leaves the 'Enter' key (\n) in the buffer.
        // We call nextLine() here to clear the buffer before reading a full sentence.
        sc.nextLine();

        // nextLine() reads the entire line, including spaces, until you press Enter.
        System.out.print("2. Enter your Full Role/Title (e.g., Senior Java Dev): ");
        String jobTitle = sc.nextLine();

        // --------------------------------------------------------------------
        // 3. READING NUMBERS & BOOLEANS
        // --------------------------------------------------------------------
        System.out.print("3. Enter your Age (whole number): ");
        int age = sc.nextInt();

        System.out.print("4. Enter your Years of Experience (decimal allowed, e.g., 2.5): ");
        double experience = sc.nextDouble();

        System.out.print("5. Are you currently employed? (true / false): ");
        boolean isEmployed = sc.nextBoolean();

        // --------------------------------------------------------------------
        // 4. PRO-TIP: READING A SINGLE CHARACTER (char)
        // --------------------------------------------------------------------
        // Scanner does not have a nextChar() method!
        // Workaround: Read a word with next() and grab the character at index 0.
        System.out.print("6. Enter your skill grade (A, B, or C): ");
        char skillGrade = sc.next().charAt(0);

        // --------------------------------------------------------------------
        // 5. PRO-LEVEL FEATURE: SAFE INPUT VALIDATION (Preventing Crashes)
        // --------------------------------------------------------------------
        // What if a user types "abc" when Java expects an integer? It crashes (InputMismatchException).
        // Use `hasNextInt()` to check the input BEFORE reading it.
        System.out.print("7. Enter your lucky number (try typing a word to test safety!): ");
        int luckyNumber = 0;
        if (sc.hasNextInt()) {
            luckyNumber = sc.nextInt();
        } else {
            System.out.println("   [!] Notice: That wasn't a valid integer! Defaulting lucky number to 7.");
            sc.next(); // Clear the invalid text from the scanner
            luckyNumber = 7;
        }

        // --------------------------------------------------------------------
        // 6. FORMATTED OUTPUT (printf)
        // --------------------------------------------------------------------
        // Format Specifiers:
        // %s -> String | %d -> int | %.1f -> double (1 decimal place)
        // %b -> boolean | %c -> char | %n -> New Line (better than \n)
        System.out.println("\n==========================================");
        System.out.println("           📋 PROFILE SUMMARY             ");
        System.out.println("==========================================");
        System.out.printf("Name          : %s%n", firstName);
        System.out.printf("Role          : %s%n", jobTitle);
        System.out.printf("Age           : %d years old%n", age);
        System.out.printf("Experience    : %.1f years%n", experience);
        System.out.printf("Employed      : %b%n", isEmployed);
        System.out.printf("Skill Grade   : %c%n", skillGrade);
        System.out.printf("Lucky Number  : %d%n", luckyNumber);
        System.out.println("==========================================");

        // --------------------------------------------------------------------
        // 7. RESOURCE MANAGEMENT
        // --------------------------------------------------------------------
        // Always close the scanner when done to prevent memory/resource leaks.
        // Note: Only close it at the very end of your program, as closing it
        // also closes System.in permanently for the rest of the runtime.
        sc.close();
    }
}
