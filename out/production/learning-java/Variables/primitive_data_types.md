In Java, **primitive data types** are the most basic data types. These types are not objects and represent raw values, which makes them very efficient for performance. There are **8 primitive data types** in Java, each serving a unique purpose.

---

### 1. **Byte**
- **Size**: 1 byte (8 bits)
- **Default Value**: 0
- **Range**: -128 to 127
- **Description**: The `byte` data type is used to save memory in large arrays, where the memory savings are most needed. It’s also used to store binary data.

```java
byte a = 100;
```

### 2. **Short**
- **Size**: 2 bytes (16 bits)
- **Default Value**: 0
- **Range**: -32,768 to 32,767
- **Description**: The `short` data type is used to save memory in large arrays, similar to `byte`, but it allows a larger range of values.

```java
short s = 1000;
```

### 3. **Int**
- **Size**: 4 bytes (32 bits)
- **Default Value**: 0
- **Range**: -2^31 to 2^31 - 1 (-2,147,483,648 to 2,147,483,647)
- **Description**: The `int` data type is the most commonly used integer type. It is the default data type for integer values in Java.

```java
int x = 50000;
```

### 4. **Long**
- **Size**: 8 bytes (64 bits)
- **Default Value**: 0L
- **Range**: -2^63 to 2^63 - 1
- **Description**: The `long` data type is used when a wider range of values is needed. It’s often used for large numbers, such as those representing time in milliseconds.

```java
long l = 100000L;
```

### 5. **Float**
- **Size**: 4 bytes (32 bits)
- **Default Value**: 0.0f
- **Range**: 1.4E-45 to 3.4E+38 (approx)
- **Description**: The `float` data type is used for decimal values. It’s used when precision is less important but memory efficiency is critical.

```java
float f = 3.14f;
```

### 6. **Double**
- **Size**: 8 bytes (64 bits)
- **Default Value**: 0.0d
- **Range**: 4.9E-324 to 1.8E+308 (approx)
- **Description**: The `double` data type is used for decimal values with double precision. It’s the default choice for floating-point numbers.

```java
double d = 3.14159;
```

### 7. **Char**
- **Size**: 2 bytes (16 bits)
- **Default Value**: '\u0000' (null character)
- **Range**: 0 to 65,535 (0 to 2^16 - 1)
- **Description**: The `char` data type is used to store single characters or Unicode characters. It is represented using single quotes.

```java
char c = 'A';
```

### 8. **Boolean**
- **Size**: 1 bit (though it's not precisely defined in terms of memory size)
- **Default Value**: `false`
- **Description**: The `boolean` data type is used to store two possible values: `true` or `false`. It is used for logical operations and condition checking.

```java
boolean isJavaFun = true;
```

---

### **Summary of Java Primitive Data Types**

| Data Type   | Size       | Default Value | Range                                             | Example               |
|-------------|------------|---------------|---------------------------------------------------|-----------------------|
| `byte`      | 1 byte     | 0             | -128 to 127                                       | `byte b = 10;`        |
| `short`     | 2 bytes    | 0             | -32,768 to 32,767                                 | `short s = 1000;`     |
| `int`       | 4 bytes    | 0             | -2^31 to 2^31 - 1 (−2,147,483,648 to 2,147,483,647) | `int x = 10000;`      |
| `long`      | 8 bytes    | 0L            | -2^63 to 2^63 - 1                                 | `long l = 100000L;`   |
| `float`     | 4 bytes    | 0.0f          | 1.4E-45 to 3.4E+38 (approx)                      | `float f = 3.14f;`    |
| `double`    | 8 bytes    | 0.0d          | 4.9E-324 to 1.8E+308 (approx)                    | `double d = 3.14159;` |
| `char`      | 2 bytes    | '\u0000'      | 0 to 65,535                                       | `char c = 'A';`       |
| `boolean`   | 1 bit      | `false`       | `true` or `false`                                 | `boolean isActive = true;` |

---

### **Characteristics of Primitive Data Types**
1. **Default Values**: Primitive types have default values when they are declared but not initialized. For example, an `int` defaults to `0`, a `boolean` to `false`, and a `char` to the null character `'\u0000'`.

2. **Memory Efficiency**: Primitives are memory-efficient and used for performance-critical applications, as they consume less memory compared to objects.

3. **No Method Support**: Primitive data types are not objects and do not support methods or properties. Operations on primitive types are performed using operators (e.g., `+`, `-`, `*`, `/`).

4. **Value vs Reference**: When a primitive type is assigned to another variable, it holds the **value** directly. For example, `int a = 5; int b = a;` means that `b` gets a copy of `a`'s value.

---

### **Wrapper Classes**
Each primitive data type has a corresponding **wrapper class** in Java, which allows primitives to be treated as objects when needed. These wrapper classes are part of `java.lang` package and provide useful methods to manipulate primitive values.

| Primitive  | Wrapper Class |
|------------|---------------|
| `byte`     | `Byte`        |
| `short`    | `Short`       |
| `int`      | `Integer`     |
| `long`     | `Long`        |
| `float`    | `Float`       |
| `double`   | `Double`      |
| `char`     | `Character`   |
| `boolean`  | `Boolean`     |

Example of using a wrapper class:
```java
int num = 10;
Integer numObj = Integer.valueOf(num); // Converting int to Integer object
```

---

### **Common Operations on Primitive Data Types**

#### **Arithmetic Operations**
```java
int a = 10, b = 5;
int sum = a + b;      // 15
int difference = a - b; // 5
int product = a * b;   // 50
int quotient = a / b;  // 2
int remainder = a % b; // 0
```

#### **Casting (Type Conversion)**
- **Implicit casting (Widening)**: Converting a smaller type to a larger type.
```java
int x = 100;
long y = x;  // Implicit conversion from int to long
```
- **Explicit casting (Narrowing)**: Converting a larger type to a smaller type.
```java
double a = 3.14;
int b = (int) a;  // Explicit conversion from double to int
```

#### **Comparison Operations**
```java
int x = 10, y = 20;
boolean isEqual = (x == y);  // false
boolean isGreater = (x > y); // false
```

---

### **Example Program with Primitive Data Types**
```java
public class PrimitiveExample {
    public static void main(String[] args) {
        // Declaring and initializing variables
        byte a = 10;
        short b = 200;
        int c = 3000;
        long d = 50000L;
        float e = 3.14f;
        double f = 3.14159;
        char g = 'A';
        boolean h = true;

        // Performing arithmetic operations
        int sum = a + b;
        double product = f * e;

        // Printing values
        System.out.println("Byte value: " + a);
        System.out.println("Short value: " + b);
        System.out.println("Int value: " + c);
        System.out.println("Long value: " + d);
        System.out.println("Float value: " + e);
        System.out.println("Double value: " + f);
        System.out.println("Char value: " + g);
        System.out.println("Boolean value: " + h);
        System.out.println("Sum of a and b: " + sum);
        System.out.println("Product of f and e: " + product);
    }
}
```

---
**Primitive data types** in Java form the foundation for working with data. Understanding the sizes, ranges, and properties of these types is crucial for memory management and efficient coding. While they don't offer built-in methods like objects, they are extremely fast and efficient for handling raw data.