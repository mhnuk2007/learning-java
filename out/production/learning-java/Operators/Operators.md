# Operators in Java
In Java, operators are special symbols used to perform operations on variables and values. Java operators can be categorized based on their functionality.

Sure! Here's a more detailed breakdown of each operator in Java, with examples included to show how each one works:

### **1. Arithmetic Operators**

These operators perform mathematical calculations.

| Operator | Description                 | Example           |
|----------|-----------------------------|-------------------|
| `+`      | Addition                    | `a + b`           |
| `-`      | Subtraction                 | `a - b`           |
| `*`      | Multiplication              | `a * b`           |
| `/`      | Division                    | `a / b`           |
| `%`      | Modulus (remainder)         | `a % b`           |

**Example:**
```java
public class ArithmeticExample {
    public static void main(String[] args) {
        int a = 10, b = 5;
        System.out.println("Addition: " + (a + b));        // Output: 15
        System.out.println("Subtraction: " + (a - b));     // Output: 5
        System.out.println("Multiplication: " + (a * b));  // Output: 50
        System.out.println("Division: " + (a / b));        // Output: 2
        System.out.println("Modulus: " + (a % b));         // Output: 0
    }
}
```

---

### **2. Relational Operators**

These operators are used to compare two values.

| Operator | Description                     | Example           |
|----------|-----------------------------------|-------------------|
| `==`     | Equal to                         | `a == b`          |
| `!=`     | Not equal to                     | `a != b`          |
| `>`      | Greater than                     | `a > b`           |
| `<`      | Less than                        | `a < b`           |
| `>=`     | Greater than or equal to         | `a >= b`          |
| `<=`     | Less than or equal to            | `a <= b`          |

**Example:**
```java
public class RelationalExample {
    public static void main(String[] args) {
        int a = 10, b = 5;
        System.out.println("Is a equal to b? " + (a == b));    // Output: false
        System.out.println("Is a not equal to b? " + (a != b)); // Output: true
        System.out.println("Is a greater than b? " + (a > b));  // Output: true
        System.out.println("Is a less than b? " + (a < b));     // Output: false
        System.out.println("Is a greater than or equal to b? " + (a >= b)); // Output: true
    }
}
```

---

### **3. Logical Operators**

These operators are used to combine multiple conditions and return a boolean result (`true` or `false`).

| Operator | Description | Example              |
|----------|-------------|----------------------|
| `&&`     | Logical AND | `a > 5 && b < 10`    |
| `\|\|`   | Logical OR  | `a > 5 \|\| b < 10`  |
| `!`      | Logical NOT | `!(a > b)`           |

**Example:**
```java
public class LogicalExample {
    public static void main(String[] args) {
        int a = 10, b = 5;
        System.out.println("a > 5 AND b < 10: " + (a > 5 && b < 10));  // Output: true
        System.out.println("a > 5 OR b < 3: " + (a > 5 || b < 3));    // Output: true
        System.out.println("NOT (a > b): " + !(a > b));               // Output: false
    }
}
```

---

### **4. Assignment Operators**

These operators assign values to variables.

| Operator | Description                          | Example           |
|----------|--------------------------------------|-------------------|
| `=`      | Simple assignment                    | `a = 5`           |
| `+=`     | Add and assign                       | `a += 5` (same as `a = a + 5`) |
| `-=`     | Subtract and assign                  | `a -= 5` (same as `a = a - 5`) |
| `*=`     | Multiply and assign                  | `a *= 5` (same as `a = a * 5`) |
| `/=`     | Divide and assign                    | `a /= 5` (same as `a = a / 5`) |
| `%=`     | Modulus and assign                   | `a %= 5` (same as `a = a % 5`) |

**Example:**
```java
public class AssignmentExample {
    public static void main(String[] args) {
        int a = 10;
        a += 5; // a = a + 5
        System.out.println("a after a += 5: " + a);  // Output: 15
        a -= 3; // a = a - 3
        System.out.println("a after a -= 3: " + a);  // Output: 12
    }
}
```

---

### **5. Unary Operators**

Unary operators operate on a single operand.

| Operator | Description                     | Example           |
|----------|----------------------------------|-------------------|
| `+`      | Unary plus (positive value)      | `+a`              |
| `-`      | Unary minus (negates the value)  | `-a`              |
| `++`     | Increment (increases value by 1) | `a++` or `++a`    |
| `--`     | Decrement (decreases value by 1) | `a--` or `--a`    |
| `!`      | Logical NOT (inverts boolean)    | `!a`              |

**Example:**
```java
public class UnaryExample {
    public static void main(String[] args) {
        int a = 5;
        System.out.println("Pre-increment: " + ++a); // Output: 6
        System.out.println("Post-increment: " + a++); // Output: 6 (after this a becomes 7)
        System.out.println("Post-decrement: " + a--); // Output: 7 (after this a becomes 6)
        System.out.println("Not true: " + !(a > 5)); // Output: true
    }
}
```

---

### **6. Bitwise Operators**

Bitwise operators are used to perform operations on binary representations of numbers.

| Operator | Description                   | Example  |
|----------|-------------------------------|----------|
| `&`      | Bitwise AND                   | `a & b`  |
| `\|`     | Bitwise OR                    | `a \| b` |
| `^`      | Bitwise XOR                   | `a ^ b`  |
| `~`      | Bitwise NOT                   | `~a`     |
| `<<`     | Left shift                    | `a << 2` |
| `>>`     | Right shift                   | `a >> 2` |

**Example:**
```java
public class BitwiseExample {
    public static void main(String[] args) {
        int a = 5, b = 3;  // a = 0101, b = 0011 in binary
        System.out.println("a & b: " + (a & b));  // Output: 1 (0001)
        System.out.println("a | b: " + (a | b));  // Output: 7 (0111)
        System.out.println("a ^ b: " + (a ^ b));  // Output: 6 (0110)
        System.out.println("~a: " + ~a);          // Output: -6 (11111111111111111111111111111010 in 32-bit)
    }
}
```

---

### **7. Ternary Operator**

The ternary operator is a shorthand for `if-else`.

| Operator | Description                        | Example                  |
|----------|------------------------------------|--------------------------|
| `? :`    | Ternary operator (conditional)     | `(condition) ? expr1 : expr2` |

**Example:**
```java
public class TernaryExample {
    public static void main(String[] args) {
        int a = 10, b = 5;
        int result = (a > b) ? a : b;  // If a > b, result = a, else result = b
        System.out.println("The larger value is: " + result);  // Output: 10
    }
}
```

---

### **8. Instanceof Operator**

The `instanceof` operator checks if an object is an instance of a specific class.

| Operator   | Description                        | Example                  |
|------------|------------------------------------|--------------------------|
| `instanceof` | Tests if an object is an instance of a class | `object instanceof Class` |

**Example:**
```java
public class InstanceofExample {
    public static void main(String[] args) {
        String str = "Hello";
        System.out.println(str instanceof String);  // Output: true
    }
}
```

---


Understanding and mastering these operators is crucial for controlling the flow and logic of your programs. Each operator has its role, whether it's performing calculations, comparing values, making decisions

