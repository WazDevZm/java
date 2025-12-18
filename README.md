# Java OOP Learning Repository

A comprehensive Java repository for learning and practicing Object-Oriented Programming (OOP) concepts.

## 📚 Repository Structure

### Main Files
- **Main.java** - Entry point demonstrating basic Java classes, constructors, and object instantiation

### OOP Learning Modules

This repository is organized into 10 progressive modules covering essential OOP concepts:

#### 01. Classes and Objects
Foundation of OOP - Creating classes, objects, and understanding their relationships.

#### 02. Encapsulation
Data hiding, access modifiers (private, public, protected), getters and setters.

#### 03. Inheritance
Extending classes, parent-child relationships, method overriding, and the `super` keyword.

#### 04. Polymorphism
Method overloading, method overriding, runtime and compile-time polymorphism.

#### 05. Abstraction
Abstract classes, abstract methods, and hiding implementation details.

#### 06. Interfaces
Interface definition, implementation, multiple inheritance through interfaces.

#### 07. Collections
Java Collection Framework - Lists, Sets, Maps, and their implementations.

#### 08. Exception Handling
Try-catch blocks, throw/throws, custom exceptions, and error management.

#### 09. Generics
Type parameters, generic classes, methods, and bounded types.

#### 10. Design Patterns
Common software design patterns and best practices in Java.

## 🚀 Getting Started

### Prerequisites
- Java Development Kit (JDK) 8 or higher
- A Java IDE (IntelliJ IDEA, Eclipse, VS Code, etc.)

### Running the Code

#### Compile Java file:
```bash
javac Main.java
```

#### Run Java program:
```bash
java Main
```

Or use the provided VS Code tasks:
- **Compile Java** - Compiles the current Java file
- **Run Java** - Compiles and runs the current Java file

## 📖 Current Examples

### Main.java
Demonstrates:
- Class definition (`Demo` class)
- Constructor usage
- Object instantiation
- Accessing object properties

```java
class Demo {
    int x;
    Demo() {
        x = 10;
    }
}

class Main {
    public static void main(String[] args) {
        Demo t1 = new Demo();
        System.out.println(t1.x); // Output: 10
    }
}
```

## 🎯 Learning Path

Follow the modules in numerical order for a structured learning experience:
1. Start with **Classes and Objects** to understand the basics
2. Progress through **Encapsulation** and **Inheritance**
3. Master **Polymorphism** and **Abstraction**
4. Learn **Interfaces** for flexible design
5. Explore **Collections** for data management
6. Handle errors with **Exception Handling**
7. Write reusable code with **Generics**
8. Apply **Design Patterns** for robust applications

## 🤝 Contributing

Feel free to add more examples and exercises to each module as you learn!

## 📝 License

This is a personal learning repository.

---
**Happy Coding! ☕**