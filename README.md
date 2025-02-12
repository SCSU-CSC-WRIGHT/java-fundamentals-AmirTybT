[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/J-4pw2s6)
# java-fundamentals - Java vs Python Exercises

Welcome to your Java introduction exercises! This document provides you with coding refreshers and exercises to help you transition from Python to Java. We'll focus on the key differences and similarities between the two languages.

---

## Exercise 1: Hello, World!

### Python Example:
```python
print("Hello, World!")
```

### Java Task:
Write a Java program that prints "Hello, World!" to the console. Remember that Java is more verbose than Python.

**Hint**: Use the `System.out.println()` method.

### Expected Output:
```
Hello, World!
```

---

## Exercise 2: Variables and Data Types

### Python Example:
```python
x = 10
message = "The number is"
print(f"{message} {x}")
```

### Java Task:
Declare an integer variable `x` with the value 10 and a `String` variable `message` with the value "The number is". Then, print the message and value using Java syntax.

**Hint**: Java requires you to specify the data type for each variable.

### Expected Output:
```
The number is 10
```

---

## Exercise 3: If-Else Statements

### Python Example:
```python
number = 15
if number % 2 == 0:
    print("Even")
else:
    print("Odd")
```

### Java Task:
Write a Java program to check whether a number is even or odd. Use an `if-else` statement.

**Hint**: Use `if(condition) {}` in Java.

### Expected Output:
```
Odd
```

---

## Exercise 4: Loops

### Python Example:
```python
for i in range(5):
    print(i)
```

### Java Task:
Write a Java program that prints numbers from 0 to 4 using a `for` loop.

**Hint**: Java uses `for(initialization; condition; update)` syntax.

### Expected Output:
```
0
1
2
3
4
```

---

## Exercise 5: Methods

### Python Example:
```python
def greet(name):
    return f"Hello, {name}!"

print(greet("Alice"))
```

### Java Task:
Write a Java method named `greet` that takes a `String` parameter `name` and returns a greeting message. Call the method with the name "Alice" and print the result.

**Hint**: Java methods must specify a return type, such as `String`.

### Expected Output:
```
Hello, Alice!
```

---

## Exercise 6: Classes and Objects

### Python Example:
```python
class Person:
    def __init__(self, name):
        self.name = name

    def greet(self):
        return f"Hello, {self.name}!"

p = Person("Bob")
print(p.greet())
```

### Java Task:
Create a Java class named `Person` with a field `name` and a method `greet` that returns a greeting message. Instantiate the class with the name "Bob" and call the `greet` method.

**Hint**: Use a constructor to initialize the `name` field.

### Expected Output:
```
Hello, Bob!
```

---

## Exercise 7: Arrays vs Lists

### Python Example:
```python
numbers = [1, 2, 3, 4, 5]
for num in numbers:
    print(num)
```

### Java Task:
Create an array of integers in Java with the values `{1, 2, 3, 4, 5}` and print each element using a `for-each` loop.

**Hint**: Use the syntax `int[] numbers = {1, 2, 3, 4, 5};`.

### Expected Output:
```
1
2
3
4
5
```

---

## Exercise 8: Error Handling

### Python Example:
```python
try:
    result = 10 / 0
except ZeroDivisionError:
    print("Division by zero is not allowed.")
```

### Java Task:
Write a Java program that attempts to divide a number by zero and handles the exception with a `try-catch` block.

**Hint**: Use `try { } catch (Exception e) { }` in Java.

### Expected Output:
```
Division by zero is not allowed.
```

---

## Notes
- Java requires a `main` method as the entry point for the program: `public static void main(String[] args) {}`.
- Remember to include semicolons (`;`) at the end of each statement in Java.
- Java is statically typed, so you must declare variable types explicitly.

Good luck! 🚀
