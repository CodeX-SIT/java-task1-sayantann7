// q3.java - Literals, Increment/Decrement Operators, and Expressions Demo
// Complete the fill-in-the-blanks to demonstrate various Java concepts

public class q3 {
    public static void main(String[] args) {
        System.out.println("=== Java Literals and Operators Demo ===\n");
        
        // Part 1: Different types of literals
        System.out.println("=== Part 1: Literals Demo ===");
        
        // FILL HERE: Create an integer literal variable 'decimal' with value 42
        int decimal = 0; // Replace 0 with correct value
        
        // FILL HERE: Create a binary literal variable 'binary' with value 0b101010 (which is 42 in decimal)
        int binary = 0; // Replace 0 with correct binary literal
        
        // FILL HERE: Create an octal literal variable 'octal' with value 052 (which is 42 in decimal)  
        int octal = 0; // Replace 0 with correct octal literal
        
        // FILL HERE: Create a hexadecimal literal variable 'hex' with value 0x2A (which is 42 in decimal)
        int hex = 0; // Replace 0 with correct hexadecimal literal
        
        System.out.println("Decimal literal: " + decimal);
        System.out.println("Binary literal: " + binary);
        System.out.println("Octal literal: " + octal);
        System.out.println("Hexadecimal literal: " + hex);
        
        // FILL HERE: Create a float literal variable 'floatNum' with value 3.14f
        float floatNum = 0.0f; // Replace with correct value
        
        // FILL HERE: Create a double literal variable 'doubleNum' with value 2.718281828
        double doubleNum = 0.0; // Replace with correct value
        
        System.out.println("Float literal: " + floatNum);
        System.out.println("Double literal: " + doubleNum);
        
        // FILL HERE: Create a char literal variable 'letter' with value 'A'
        char letter = ' '; // Replace with correct character
        
        // FILL HERE: Create a char literal variable 'unicodeChar' with value '\u0041' (which is 'A')
        char unicodeChar = ' '; // Replace with correct unicode character
        
        System.out.println("Character literal: " + letter);
        System.out.println("Unicode character: " + unicodeChar);
        
        // FILL HERE: Create a boolean literal variable 'isTrue' with value true
        boolean isTrue = false; // Replace with correct value
        
        // FILL HERE: Create a String literal variable 'message' with value "Hello, Java!"
        String message = ""; // Replace with correct string
        
        System.out.println("Boolean literal: " + isTrue);
        System.out.println("String literal: " + message);
        
        System.out.println("\n=== Part 2: Increment/Decrement Operators ===");
        
        // FILL HERE: Create an integer variable 'counter' with initial value 10
        int counter = 0; // Replace with correct initial value
        
        System.out.println("Initial counter value: " + counter);
        
        // FILL HERE: Use post-increment (counter++) in the println statement
        System.out.println("Post-increment (counter++): " + counter); // Add post-increment operation
        System.out.println("Counter after post-increment: " + counter);
        
        // FILL HERE: Use pre-increment (++counter) in the println statement  
        System.out.println("Pre-increment (++counter): " + counter); // Add pre-increment operation
        System.out.println("Counter after pre-increment: " + counter);
        
        // FILL HERE: Use post-decrement (counter--) in the println statement
        System.out.println("Post-decrement (counter--): " + counter); // Add post-decrement operation
        System.out.println("Counter after post-decrement: " + counter);
        
        // FILL HERE: Use pre-decrement (--counter) in the println statement
        System.out.println("Pre-decrement (--counter): " + counter); // Add pre-decrement operation
        System.out.println("Counter after pre-decrement: " + counter);
        
        System.out.println("\n=== Part 3: Data Type of Expressions ===");
        
        // Variables for expression demonstrations
        int intVar = 5;
        double doubleVar = 2.5;
        float floatVar = 1.5f;
        char charVar = 'B';
        
        // Expression 1: int + int
        // FILL HERE: Create a variable 'result1' that stores intVar + 3 (determine the correct data type)
        int result1 = 0; // Replace with correct expression and fix data type if needed
        
        System.out.println("int + int = " + result1 + " (Type: int)");
        
        // Expression 2: int + double  
        // FILL HERE: Create a variable 'result2' that stores intVar + doubleVar (determine the correct data type)
        double result2 = 0.0; // Replace with correct expression and fix data type if needed
        
        System.out.println("int + double = " + result2 + " (Type: double)");
        
        // Expression 3: float + double
        // FILL HERE: Create a variable 'result3' that stores floatVar + doubleVar (determine the correct data type)
        double result3 = 0.0; // Replace with correct expression and fix data type if needed
        
        System.out.println("float + double = " + result3 + " (Type: double)");
        
        // Expression 4: char + int
        // FILL HERE: Create a variable 'result4' that stores charVar + intVar (determine the correct data type)
        int result4 = 0; // Replace with correct expression and fix data type if needed
        
        System.out.println("char + int = " + result4 + " (Type: int, 'B' has ASCII value 66)");
        
        System.out.println("\n=== Part 4: Operator Associativity ===");
        
        // Demonstrate left-to-right associativity with subtraction
        int a = 20, b = 10, c = 5;
        // FILL HERE: Calculate result5 = a - b - c (should be evaluated as (a - b) - c)
        int result5 = 0; // Replace with correct expression
        
        System.out.println("Left-to-right: " + a + " - " + b + " - " + c + " = " + result5);
        System.out.println("Evaluation: (" + a + " - " + b + ") - " + c + " = " + (a - b) + " - " + c + " = " + result5);
        
        // FILL HERE: Demonstrate right-to-left associativity with assignment
        int x = 0, y = 0, z = 0; // Replace this line with chained assignment x = y = z = 15
        
        System.out.println("Right-to-left assignment: x = y = z = 15");
        System.out.println("x = " + x + ", y = " + y + ", z = " + z);
    }
}