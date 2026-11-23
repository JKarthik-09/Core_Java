package java_basics;

/**
 * ============================================================================
 * JAVA OUTPUT STREAM MASTERCLASS
 * ============================================================================
 * Purpose: A complete, beginner-friendly, yet developer-grade guide to displaying
 *          output in Java using `System.out` and `System.err`.
 *
 * How it works:
 * System.out -> Standard output stream (usually your console/screen).
 * System.err -> Standard error stream (used for error logs; often prints in red).
 * ============================================================================
 */
public class OutputStream {

    public static void main(String[] args) {

        System.out.println("=== 🖥️ JAVA OUTPUT STREAM MASTERCLASS ===\n");

        // --------------------------------------------------------------------
        // 1. THE BASICS: print() vs. println()
        // --------------------------------------------------------------------
        // print()   -> Prints text and keeps the cursor on the SAME line.
        // println() -> Prints text and moves the cursor to a NEW line ("print line").
        System.out.println("--- 1. print() vs println() ---");

        System.out.print("Loading ");
        System.out.print("modules");
        System.out.println("... Done!"); // Moves cursor to next line AFTER printing
        System.out.println("Welcome to Java Output!");

        // --------------------------------------------------------------------
        // 2. ESCAPE SEQUENCES (Special Formatting Characters)
        // --------------------------------------------------------------------
        // Backslash (\) tells Java the next character has a special meaning.
        // \n -> New line | \t -> Tab space | \" -> Double quote | \\ -> Backslash
        System.out.println("\n--- 2. Escape Sequences ---");

        System.out.println("Line 1\nLine 2");
        System.out.println("Column A\tColumn B\tColumn C");
        System.out.println("She said, \"Java is awesome!\"");
        System.out.println("File Path: C:\\Users\\Developer\\Java");

        // --------------------------------------------------------------------
        // 3. FORMATTED OUTPUT: printf() (Print Formatted)
        // --------------------------------------------------------------------
        // Placeholders (Format Specifiers):
        // %s -> String | %d -> Integer | %f -> Float/Double | %b -> Boolean | %n -> New Line
        System.out.println("\n--- 3. Formatted Output (printf) ---");

        String devName = "Aarav";
        int projects = 14;
        double rating = 4.8765;
        boolean isVerified = true;

        // %.2f rounds the decimal to 2 places!
        // Note: Always prefer %n over \n inside printf() for cross-platform compatibility.
        System.out.printf("Developer: %s | Projects: %d | Rating: %.2f/5.0 | Verified: %b%n",
                devName, projects, rating, isVerified);

        // --------------------------------------------------------------------
        // 4. PRO-LEVEL FEATURE: ALIGNMENT, PADDING & NUMBER FORMATTING
        // --------------------------------------------------------------------
        // %-15s -> Left-align text inside a 15-character wide box.
        // %10s  -> Right-align text inside a 10-character wide box.
        // %,d   -> Adds comma separators to large numbers (e.g., 1,000,000).
        // %04d  -> Pads numbers with leading zeros (e.g., 7 becomes 0007).
        System.out.println("\n--- 4. Building Clean Console Tables ---");

        System.out.println("--------------------------------------------------");
        System.out.printf("%-15s | %-10s | %15s%n", "LANGUAGE", "RANK", "SALARY (INR)");
        System.out.println("--------------------------------------------------");
        System.out.printf("%-15s | #%03d       | ₹%,13.2f%n", "Java", 1, 1450000.50);
        System.out.printf("%-15s | #%03d       | ₹%,13.2f%n", "Python", 2, 1320000.00);
        System.out.printf("%-15s | #%03d       | ₹%,13.2f%n", "JavaScript", 3, 1180000.75);
        System.out.println("--------------------------------------------------");

        // --------------------------------------------------------------------
        // 5. STORING FORMATTED TEXT: String.format()
        // --------------------------------------------------------------------
        // Want the power of printf(), but want to save it in a variable instead of printing?
        System.out.println("\n--- 5. Saving Formatted Strings ---");

        String badge = String.format("[ID-%04d] %s (Rating: %.1f)", 42, devName, rating);
        System.out.println("Generated Badge: " + badge);

        // --------------------------------------------------------------------
        // 6. STANDARD ERROR STREAM: System.err
        // --------------------------------------------------------------------
        // Developers separate normal output from error messages using System.err.
        // Most IDEs (IntelliJ, Eclipse, VS Code) highlight this output in RED.
        System.out.println("\n--- 6. Error Stream (System.err) ---");

        System.err.println("[ERROR] Simulated warning: Low memory detected!");
    }
}
