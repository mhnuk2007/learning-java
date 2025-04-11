# 🚦 Control Structures in Java

Control structures determine the flow of a program. In Java, they are essential for making decisions, repeating actions, and selecting different paths of execution. Java provides several control structures, broadly categorized into **decision-making**, **looping**, and **branching** statements.

---

## 📍 1. Decision-Making Statements
These statements are used to execute a block of code based on a condition.

### 🔹 `if` Statement
Executes a block of code if a condition is `true`.

```java
int number = 10;
if (number > 0) {
    System.out.println("Positive number");
}
```

### 🔹 `if-else` Statement
Executes one block of code if the condition is `true`, otherwise executes another.

```java
int number = -5;
if (number >= 0) {
    System.out.println("Positive number");
} else {
    System.out.println("Negative number");
}
```

### 🔹 `if-else-if` Ladder
Tests multiple conditions sequentially.

```java
int number = 0;
if (number > 0) {
    System.out.println("Positive");
} else if (number < 0) {
    System.out.println("Negative");
} else {
    System.out.println("Zero");
}
```

### 🔹 `switch` Statement
Selects a block of code to execute based on the value of an expression.

```java
int day = 2;
switch (day) {
    case 1: System.out.println("Monday"); break;
    case 2: System.out.println("Tuesday"); break;
    default: System.out.println("Another day");
}
```

---

## 🔁 2. Looping Statements
Used to repeat a block of code multiple times.

### 🔹 `while` Loop
Executes code while the condition is `true`.

```java
int i = 1;
while (i <= 5) {
    System.out.println(i);
    i++;
}
```

### 🔹 `do-while` Loop
Executes code **at least once**, then repeats while the condition is `true`.

```java
int i = 1;
do {
    System.out.println(i);
    i++;
} while (i <= 5);
```

### 🔹 `for` Loop
Executes code a fixed number of times.

```java
for (int i = 1; i <= 5; i++) {
    System.out.println(i);
}
```

### 🔹 Enhanced `for-each` Loop
Used to iterate over arrays or collections.

```java
int[] numbers = {1, 2, 3, 4, 5};
for (int num : numbers) {
    System.out.println(num);
}
```

---

## 🧭 3. Branching Statements
Used to alter the normal flow of execution.

### 🔹 `break` Statement
Terminates the loop or switch statement.

```java
for (int i = 1; i <= 5; i++) {
    if (i == 3) break;
    System.out.println(i);
}
```

### 🔹 `continue` Statement
Skips the current iteration and moves to the next.

```java
for (int i = 1; i <= 5; i++) {
    if (i == 3) continue;
    System.out.println(i);
}
```

### 🔹 `return` Statement
Exits from the current method and optionally returns a value.

```java
public static int sum(int a, int b) {
    return a + b;
}
```

---

## 🧠 Summary
- Use `if`, `if-else`, `if-else-if`, and `switch` for decisions.
- Use `for`, `while`, `do-while`, and `for-each` for repetitions.
- Use `break`, `continue`, and `return` for flow control.

Control structures help build logic, manage complexity, and ensure your code is dynamic and responsive to various inputs and states.

---

✅ Make sure to practice writing examples for each structure to solidify your understanding!

