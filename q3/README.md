# Question 3: Literals, Operators, and Expressions

## Objective

Complete the fill-in-the-blanks exercise in `q3.java` to demonstrate understanding of:
- Different types of literals in Java (decimal, binary, octal, hexadecimal, float, double, char, boolean, String)
- Increment and decrement operators (++, --)
- Data types of expressions and automatic type promotion
- Operator associativity (left-to-right and right-to-left)

## Instructions

1. Open `q3.java` and look for comments starting with `// FILL HERE:`
2. Replace the placeholder values and complete the missing code
3. The program should compile and run without errors
4. Your output should match the expected output shown below

## What to Fill

You need to complete the following parts:

### Part 1: Literals
- **Decimal literal**: Replace `0` with `42`
- **Binary literal**: Replace `0` with `0b101010` (binary representation of 42)
- **Octal literal**: Replace `0` with `052` (octal representation of 42)
- **Hexadecimal literal**: Replace `0` with `0x2A` (hexadecimal representation of 42)
- **Float literal**: Replace `0.0f` with `3.14f`
- **Double literal**: Replace `0.0` with `2.718281828`
- **Character literal**: Replace `' '` with `'A'`
- **Unicode character**: Replace `' '` with `'\u0041'`
- **Boolean literal**: Replace `false` with `true`
- **String literal**: Replace `""` with `"Hello, Java!"`

### Part 2: Increment/Decrement Operators
- **Initialize counter**: Replace `0` with `10`
- **Post-increment**: Modify the println to use `counter++`
- **Pre-increment**: Modify the println to use `++counter`
- **Post-decrement**: Modify the println to use `counter--`
- **Pre-decrement**: Modify the println to use `--counter`

### Part 3: Expression Data Types
- **result1**: Replace `0` with `intVar + 3`
- **result2**: Replace `0.0` with `intVar + doubleVar`
- **result3**: Replace `0.0` with `floatVar + doubleVar`
- **result4**: Replace `0` with `charVar + intVar`

### Part 4: Operator Associativity
- **result5**: Replace `0` with `a - b - c`
- **Chained assignment**: Replace `int x = 0, y = 0, z = 0;` with `int x, y, z; x = y = z = 15;`

## Expected Output

When you run your completed program, it should produce exactly this output:

```
=== Java Literals and Operators Demo ===

=== Part 1: Literals Demo ===
Decimal literal: 42
Binary literal: 42
Octal literal: 42
Hexadecimal literal: 42
Float literal: 3.14
Double literal: 2.718281828
Character literal: A
Unicode character: A
Boolean literal: true
String literal: Hello, Java!

=== Part 2: Increment/Decrement Operators ===
Initial counter value: 10
Post-increment (counter++): 10
Counter after post-increment: 11
Pre-increment (++counter): 12
Counter after pre-increment: 12
Post-decrement (counter--): 12
Counter after post-decrement: 11
Pre-decrement (--counter): 10
Counter after pre-decrement: 10

=== Part 3: Data Type of Expressions ===
int + int = 8 (Type: int)
int + double = 7.5 (Type: double)
float + double = 4.0 (Type: double)
char + int = 71 (Type: int, 'B' has ASCII value 66)

=== Part 4: Operator Associativity ===
Left-to-right: 20 - 10 - 5 = 5
Evaluation: (20 - 10) - 5 = 10 - 5 = 5
Right-to-left assignment: x = y = z = 15
x = 15, y = 15, z = 15
```

## Key Concepts to Understand

### Literals
- **Decimal**: Standard base-10 numbers (42)
- **Binary**: Base-2 numbers prefixed with `0b` (0b101010)
- **Octal**: Base-8 numbers prefixed with `0` (052)
- **Hexadecimal**: Base-16 numbers prefixed with `0x` (0x2A)
- **Float**: Decimal numbers with `f` suffix (3.14f)
- **Double**: Default decimal numbers (2.718281828)
- **Character**: Single characters in single quotes ('A')
- **Unicode**: Characters using unicode escape (\u0041)

### Increment/Decrement Operators
- **Post-increment (var++)**: Returns current value, then increments
- **Pre-increment (++var)**: Increments first, then returns new value
- **Post-decrement (var--)**: Returns current value, then decrements
- **Pre-decrement (--var)**: Decrements first, then returns new value

### Expression Data Types
- **int + int = int**: Both operands are integers
- **int + double = double**: Result promoted to larger type
- **float + double = double**: Result promoted to larger type
- **char + int = int**: char converted to ASCII value, result is int

### Operator Associativity
- **Left-to-right**: Arithmetic operators like - are evaluated left to right
- **Right-to-left**: Assignment operators are evaluated right to left

## Assessment Criteria

- [ ] All literals are correctly written with proper syntax
- [ ] Increment/decrement operators work as expected
- [ ] Expression results match expected values and types
- [ ] Operator associativity is properly demonstrated
- [ ] Program compiles and runs without errors
- [ ] Output matches the expected format exactly

## Compilation and Execution

```bash
# Compile
javac q3.java

# Run
java q3
```