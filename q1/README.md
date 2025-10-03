# Question 1: Basic Java Program Structure and Variables

## Objective

Complete the fill-in-the-blanks exercise in `q1.java` to demonstrate understanding of:
- Basic Java program structure
- Variable declarations and initialization
- Data types (int, double, char, boolean, String)
- Basic output using `System.out.println()`

## Instructions

1. Open `q1.java` and look for comments starting with `// FILL HERE:`
2. Replace each `// FILL HERE:` comment with the appropriate Java code
3. The program should compile and run without errors
4. Your output should match the expected output shown below

## What to Fill

You need to complete the following parts:

1. **Import statement**: Add the import for Scanner (even though not used in this question, it's good practice)
2. **Class declaration**: Create a proper class with the name `q1`
3. **Main method**: Write the correct main method signature
4. **Variable declarations**: Declare and initialize 5 variables of different data types
5. **Output statements**: Print the variables using `System.out.println()`
6. **Data type information**: Print the data type names for each variable

## Expected Output

When you run your completed program, it should produce exactly this output:

```
=== Student Information ===
Name: John Doe
Age: 25
Height: 5.8 feet
Grade: A
Is Student: true

=== Data Type Information ===
age is of type: int
height is of type: double
grade is of type: char
isStudent is of type: boolean
name is of type: String
```

## Hints

- Java class names should start with a capital letter, but for this exercise, use `q1` as specified
- The main method signature is: `public static void main(String[] args)`
- Use proper initialization syntax for each data type:
  - `int variable = value;`
  - `double variable = value;`
  - `char variable = 'value';` (single quotes)
  - `boolean variable = true/false;`
  - `String variable = "value";` (double quotes)
- For the data type information section, format your output as: `variableName is of type: dataType`

## Compilation and Execution

```bash
# Compile
javac q1.java

# Run
java q1
```

## Assessment Criteria

- [ ] Program compiles without errors
- [ ] All variables are properly declared and initialized
- [ ] Output matches the expected format exactly
- [ ] Proper use of Java naming conventions
- [ ] All "FILL HERE" comments are replaced with appropriate code