# Question 2: Simple Calculator with User Input and Operators

## Objective

Write a complete Java program that demonstrates:
- Getting user input using Scanner
- Arithmetic operators (+, -, *, /, %)
- Relational operators (>, <, >=, <=, ==, !=)
- Logical operators (&&, ||, !)
- Basic expressions and calculations

## Instructions

1. Open `q2.java` which contains only comments and starter guidance
2. Write a **complete Java program** from scratch
3. Follow the requirements specified below
4. Your program should compile and run, producing the expected output format

## Program Requirements

Your program should:

1. **Import** the Scanner class for user input
2. **Create** a class named `q2`
3. **Implement** the main method
4. **Prompt** the user to enter two numbers (can be integers or decimals)
5. **Read** the input using Scanner
6. **Perform** and display the following calculations:
   - Addition (num1 + num2)
   - Subtraction (num1 - num2)
   - Multiplication (num1 * num2)
   - Division (num1 / num2)
   - Modulus (num1 % num2) - only if both numbers are integers
7. **Demonstrate** relational operators by comparing the two numbers
8. **Show** logical operations using the comparison results

## Sample Input/Output

**Input:**
```
Enter first number: 15
Enter second number: 4
```

**Expected Output:**
```
=== Calculator Results ===
First Number: 15.0
Second Number: 4.0

=== Arithmetic Operations ===
Addition: 15.0 + 4.0 = 19.0
Subtraction: 15.0 - 4.0 = 11.0
Multiplication: 15.0 * 4.0 = 60.0
Division: 15.0 / 4.0 = 3.75
Modulus: 15 % 4 = 3

=== Relational Operations ===
15.0 > 4.0: true
15.0 < 4.0: false
15.0 >= 4.0: true
15.0 <= 4.0: false
15.0 == 4.0: false
15.0 != 4.0: true

=== Logical Operations ===
(15.0 > 4.0) && (15.0 != 4.0): true
(15.0 < 4.0) || (15.0 == 4.0): false
!(15.0 == 4.0): true
```

## Implementation Hints

1. **Scanner Setup:**
   ```java
   Scanner scanner = new Scanner(System.in);
   ```

2. **Reading Input:**
   ```java
   System.out.print("Enter first number: ");
   double num1 = scanner.nextDouble();
   ```

3. **Modulus Operation:**
   - Convert doubles to integers for modulus: `(int)num1 % (int)num2`

4. **Formatting Output:**
   - Use `System.out.println()` for formatted output
   - Show operations in the format: `operand1 operator operand2 = result`

5. **Logical Operations:**
   - Store relational results in boolean variables
   - Use these variables in logical operations

## Assessment Criteria

- [ ] Program compiles without errors
- [ ] Correct use of Scanner for user input
- [ ] All arithmetic operations implemented correctly
- [ ] All relational operators demonstrated
- [ ] Logical operators used properly
- [ ] Output format matches the expected format
- [ ] Proper handling of integer vs. double operations
- [ ] Code is well-organized and readable

## Compilation and Execution

```bash
# Compile
javac q2.java

# Run
java q2
```

## Additional Challenge (Optional)

If you finish early, try adding:
- Input validation (handle invalid input)
- Division by zero checking
- More complex expressions combining multiple operators