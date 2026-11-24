package java_basics;

/*
 * ============================================================================
 *                         JAVA OPERATORS MASTERCLASS
 * ============================================================================
 *
 * Purpose:
 * A beginner-friendly, yet developer-oriented guide to understanding
 * operators in Java, with practical examples of arithmetic operations.
 *
 * How it works:
 * Operands  -> Variables or values on which operations are performed.
 * Operators -> Special symbols that perform operations on operands.
 * Expressions -> Combinations of operands and operators that produce results.
 *
 * Example:
 * int result = 20 + 30;
 *
 * Here:
 * 20, 30  -> Operands
 * +       -> Operator
 * result  -> Variable storing the result
 *
 * ============================================================================
 *
 * TYPES OF OPERATORS IN JAVA:
 *
 * 1. Arithmetic Operators
 * 2. Assignment Operators
 * 3. Relational Operators
 * 4. Logical Operators
 * 5. Unary Operators
 * 6. Bitwise Operators
 * 7. Shift Operators
 * 8. Ternary Operator
 *
 * This program focuses on Arithmetic Operators.
 *
 * ============================================================================
 */

public class Operators {

    public static void main(String[] args) {

        System.out.println("=== JAVA ARITHMETIC OPERATORS MASTERCLASS ===\n");


        // --------------------------------------------------------------------
        // 1. VARIABLE INITIALIZATION
        // --------------------------------------------------------------------
        /*
         * Before performing operations, we need values on which the
         * operators can work.
         *
         * Here, we initialize two integer variables representing two points.
         *
         * int    -> Data type representing whole numbers.
         * point1 -> First operand with value 20.
         * point2 -> Second operand with value 30.
         *
         * These variables will be used throughout this program.
         */

        int point1 = 20;
        int point2 = 30;


        // --------------------------------------------------------------------
        // 2. ADDITION OPERATOR (+)
        // --------------------------------------------------------------------
        /*
         * PURPOSE:
         * Adds two operands and returns their sum.
         *
         * SYNTAX:
         * operand1 + operand2
         *
         * EXPRESSION:
         * point1 + point2
         *
         * CALCULATION:
         * 20 + 30 = 50
         *
         * The result is stored in total_distance.
         *
         * USE CASES:
         * - Adding numerical values.
         * - Calculating total marks.
         * - Combining distances.
         * - Calculating the total price of products.
         */

        int total_distance = point1 + point2;

        System.out.println("1. ADDITION");
        System.out.println("The Total Combined distance is : " + total_distance);


        // --------------------------------------------------------------------
        // 3. SUBTRACTION OPERATOR (-)
        // --------------------------------------------------------------------
        /*
         * PURPOSE:
         * Subtracts the second operand from the first operand.
         *
         * SYNTAX:
         * operand1 - operand2
         *
         * EXPRESSION:
         * point2 - point1
         *
         * CALCULATION:
         * 30 - 20 = 10
         *
         * The result is stored in distance_btw_points.
         *
         * IMPORTANT:
         * Subtraction is an order-dependent operation.
         *
         * 30 - 20 = 10
         * 20 - 30 = -10
         *
         * Changing the positions of operands changes the result.
         *
         * USE CASES:
         * - Finding the difference between two values.
         * - Calculating remaining balances.
         * - Finding changes in numerical measurements.
         */

        int distance_btw_points = point2 - point1;

        System.out.println("\n2. SUBTRACTION");
        System.out.println("The total distance between two points is : "
                + distance_btw_points);


        // --------------------------------------------------------------------
        // 4. MULTIPLICATION OPERATOR (*)
        // --------------------------------------------------------------------
        /*
         * PURPOSE:
         * Multiplies two operands and returns their product.
         *
         * SYNTAX:
         * operand1 * operand2
         *
         * EXPRESSION:
         * point2 * 2
         *
         * CALCULATION:
         * 30 * 2 = 60
         *
         * Here, we directly perform the operation inside println().
         *
         * Unlike addition and subtraction, we do not store the result
         * in a separate variable because we only need to display it.
         *
         * USE CASES:
         * - Calculating the area of a rectangle.
         * - Calculating the total cost of multiple items.
         * - Doubling or scaling numerical values.
         */

        System.out.println("\n3. MULTIPLICATION");
        System.out.println("The point 2 twice value is : " + (point2 * 2));


        // --------------------------------------------------------------------
        // 5. DIVISION OPERATOR (/)
        // --------------------------------------------------------------------
        /*
         * PURPOSE:
         * Divides one operand by another and returns the quotient.
         *
         * SYNTAX:
         * operand1 / operand2
         *
         * EXPRESSION:
         * point1 / 2
         *
         * CALCULATION:
         * 20 / 2 = 10
         *
         * IMPORTANT CONCEPT: INTEGER DIVISION
         *
         * When both operands are integers, Java performs integer division.
         * Any fractional portion is discarded.
         *
         * Example:
         *
         * int result = 5 / 2;
         *
         * Output:
         * 2
         *
         * The actual mathematical result is 2.5, but because both operands
         * are integers, Java produces an integer result of 2.
         *
         * To obtain a decimal result:
         *
         * double result = 5.0 / 2;
         *
         * Output:
         * 2.5
         *
         * IMPORTANT EDGE CASE:
         * Integer division by zero causes ArithmeticException.
         *
         * Example:
         * int result = 10 / 0;  // ArithmeticException
         *
         * USE CASES:
         * - Calculating averages.
         * - Splitting quantities.
         * - Finding ratios.
         * - Calculating half or fractional values.
         */

        System.out.println("\n4. DIVISION");
        System.out.println("The half distance of point 1 is : " + (point1 / 2));


        // --------------------------------------------------------------------
        // 6. MODULUS OPERATOR (%)
        // --------------------------------------------------------------------
        /*
         * PURPOSE:
         * Returns the remainder after dividing one operand by another.
         *
         * SYNTAX:
         * operand1 % operand2
         *
         * EXAMPLE:
         * 20 % 3
         *
         * CALCULATION:
         * 20 / 3 = 6 with remainder 2.
         *
         * RESULT:
         * 20 % 3 = 2
         *
         * IMPORTANT:
         * Division returns the quotient, whereas modulus returns the
         * remainder.
         *
         * PRACTICAL APPLICATION:
         *
         * Checking whether a number is even or odd.
         *
         * number % 2 == 0 -> Even number.
         * number % 2 != 0 -> Odd number.
         *
         * Example:
         *
         * int number = 20;
         *
         * if (number % 2 == 0) {
         *     System.out.println("Even Number");
         * }
         *
         * NOTE:
         * Modulus with a zero divisor also causes ArithmeticException
         * when working with integer operands.
         *
         * This section is explanatory and does not add new execution
         * statements to the original program.
         */


        // --------------------------------------------------------------------
        // 7. OPERATOR PRECEDENCE AND EXPRESSION EVALUATION
        // --------------------------------------------------------------------
        /*
         * PURPOSE:
         * Operator precedence determines the order in which operators
         * are evaluated within an expression.
         *
         * EXAMPLE 1:
         *
         * int result = 10 + 5 * 2;
         *
         * Java evaluates multiplication before addition.
         *
         * Step 1: 5 * 2 = 10
         * Step 2: 10 + 10 = 20
         *
         * RESULT: 20
         *
         * EXAMPLE 2:
         *
         * int result = (10 + 5) * 2;
         *
         * Parentheses have higher precedence.
         *
         * Step 1: 10 + 5 = 15
         * Step 2: 15 * 2 = 30
         *
         * RESULT: 30
         *
         * IMPORTANT:
         * Parentheses help make expressions easier to understand
         * and explicitly control evaluation order.
         *
         */


        // --------------------------------------------------------------------
        // 8. OPERATOR PRECEDENCE REFERENCE
        // --------------------------------------------------------------------
        /*
         * The following is a simplified precedence order.
         * Operators higher in the list are evaluated before lower ones.
         *
         * 1. Parentheses              ()
         * 2. Unary Operators          ++, --, !, +, -
         * 3. Multiplication/Division  *, /, %
         * 4. Addition/Subtraction     +, -
         * 5. Relational Operators     <, >, <=, >=
         * 6. Equality Operators       ==, !=
         * 7. Logical AND              &&
         * 8. Logical OR               ||
         * 9. Ternary Operator         ?:
         * 10. Assignment Operators    =, +=, -=, etc.
         *
         * NOTE:
         * Operators at the same precedence level generally follow
         * their specified associativity rules.
         */


        // --------------------------------------------------------------------
        // 9. FINAL SUMMARY
        // --------------------------------------------------------------------
        /*
         * ARITHMETIC OPERATORS:
         *
         * +  -> Addition       -> Adds operands.
         * -  -> Subtraction    -> Finds the difference.
         * *  -> Multiplication -> Calculates the product.
         * /  -> Division       -> Calculates the quotient.
         * %  -> Modulus        -> Calculates the remainder.
         *
         * IMPORTANT CONCEPTS:
         *
         * 1. Operators work on operands.
         * 2. Expressions produce values.
         * 3. Integer division discards fractional portions.
         * 4. Division by zero with integer operands causes an exception.
         * 5. Operator precedence determines evaluation order.
         * 6. Parentheses can control expression evaluation.
         *
         * ============================================================================
         * END OF JAVA ARITHMETIC OPERATORS MASTERCLASS
         * ============================================================================
         */

    }
}