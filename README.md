Below is a **clean, professional, GitHub-ready `README.md`** you can copy-paste directly into your repository.
It is written assuming **all examples are in separate Java classes with the same class names**, exactly as you described.

---

# 🔁 Java Recursion – Examples & Concepts

## 📌 Introduction

**Recursion** is a programming technique where a method **calls itself** to solve a problem by breaking it down into **smaller sub-problems** of the same type.

In Java, recursion is commonly used for:

* Mathematical computations
* Array and string processing
* Tree and graph traversal
* Divide-and-conquer algorithms
* Backtracking problems

This repository contains **clear, beginner-to-intermediate recursion examples**, written using **simple Java class structures** and **easy-to-understand logic**, making it ideal for:

* Learning recursion fundamentals
* Interview preparation
* Practicing problem-solving skills

---

## 🧠 Core Concept of Recursion

Every recursive method must have **two essential parts**:

### 1️⃣ Base Case

The condition that **stops recursion**.
Without it, the program will run forever and crash with a `StackOverflowError`.

### 2️⃣ Recursive Case

The part where the method **calls itself** with a **smaller input**.

### General Structure

```java
method(parameters) {
    if (baseCondition) {
        return result;
    }
    return method(modifiedParameters);
}
```

---

## 📂 What This Repository Contains

Each concept is implemented as a **separate Java class**.

### 🔢 Number-Based Recursion

| Class Name      | Description                      |
| --------------- | -------------------------------- |
| `PrintNumbers`  | Prints numbers from 1 to N       |
| `Factorial`     | Calculates factorial of a number |
| `Fibonacci`     | Generates Fibonacci sequence     |
| `Power`         | Calculates xⁿ using recursion    |
| `CountDigits`   | Counts digits in a number        |
| `SumOfDigits`   | Finds sum of digits              |
| `ReverseNumber` | Reverses an integer              |

---

### 🧵 String-Based Recursion

| Class Name   | Description                        |
| ------------ | ---------------------------------- |
| `Palindrome` | Checks if a string is a palindrome |

---

### 📦 Array-Based Recursion

| Class Name | Description                       |
| ---------- | --------------------------------- |
| `ArraySum` | Sums elements of an array         |
| `MaxArray` | Finds maximum element in an array |

---

## 🔍 How These Examples Work (Logic Explained)

### 📘 Factorial Logic

**Mathematical formula:**

```
n! = n × (n − 1)!
```

**Recursive breakdown:**

```
factorial(5)
→ 5 × factorial(4)
→ 5 × 4 × factorial(3)
→ ...
→ 1
```

---

### 📘 Fibonacci Logic

**Formula:**

```
fib(n) = fib(n − 1) + fib(n − 2)
```

Each number depends on the **previous two values**, which makes recursion a natural fit.

---

### 📘 Sum of Digits Logic

```
123 → (123 % 10) + sum(123 / 10)
     → 3 + sum(12)
     → 3 + 2 + 1
```

Uses:

* `%` to get last digit
* `/` to remove last digit

---

### 📘 Reverse Number Logic

```
rev = rev × 10 + (n % 10)
```

Moves digits from right to left using recursion.

---

### 📘 Palindrome Logic

* Compare first and last characters
* Move inward on each recursive call
* Stop when pointers meet or cross

---

### 📘 Array Processing Logic

Arrays are processed by:

* Passing an **index**
* Moving forward one element at a time
* Letting recursion handle traversal instead of loops

---

## 🧮 Mathematical Concepts Used

This repository reinforces:

* Division & Modulus (`/`, `%`)
* Multiplication and addition
* Decreasing problem size
* Mathematical induction concepts
* Stack-based execution (call stack)

---

## ⚠️ Important Recursion Tips (Interview-Critical)

### ✅ Best Practices

* Always define a **clear base case**
* Reduce input size on each call
* Use meaningful method parameters
* Understand **stack flow**, not just syntax

### ❌ Common Mistakes

* Missing base case → `StackOverflowError`
* Incorrect base condition
* Overusing recursion where iteration is simpler
* Ignoring time complexity (e.g., Fibonacci)

---

## 🚀 When to Use Recursion

✔ Tree traversal
✔ Divide-and-conquer problems
✔ Backtracking
✔ Mathematical definitions

🚫 Large loops with no clear termination
🚫 Performance-critical code without optimization

---

## 🎯 Learning Outcome

After completing this repository, you should be able to:

* Write recursive methods confidently
* Identify base and recursive cases
* Trace recursive calls using the call stack
* Apply recursion to real interview problems

---

## 📎 Recommended Next Steps

* Optimize recursion using **memoization**
* Learn **tail recursion**
* Practice **backtracking problems**
* Explore **tree recursion**

---

### ⭐ If you find this repository useful, consider starring it!

Happy coding 🚀
