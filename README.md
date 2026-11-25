# Object-Oriented Programming in Java

<p align="center">
  <img src="https://img.shields.io/badge/Java-Core%20Java-orange?style=for-the-badge&logo=openjdk&logoColor=white" />
  <img src="https://img.shields.io/badge/IDE-IntelliJ%20IDEA-black?style=for-the-badge&logo=intellijidea&logoColor=white" />
  <img src="https://img.shields.io/badge/Version%20Control-Git-F05032?style=for-the-badge&logo=git&logoColor=white" />
  <img src="https://img.shields.io/badge/Platform-GitHub-181717?style=for-the-badge&logo=github&logoColor=white" />
</p>

<p align="center">
  <b>A structured collection of Java programs, practical implementations, and examples exploring Object-Oriented Programming and Core Java.</b>
</p>

<p align="center">
  <a href="#-about-the-project">About</a> •
  <a href="#-core-concepts">Core Concepts</a> •
  <a href="#-topics-covered">Topics</a> •
  <a href="#-project-structure">Structure</a> •
  <a href="#-getting-started">Setup</a> •
  <a href="#-learning-roadmap">Roadmap</a>
</p>

---

## 📖 About the Project

**Object-Oriented Programming in Java** is a personal learning repository containing practical implementations of fundamental Java concepts and object-oriented programming principles.

The repository is designed around a topic-based structure. Each directory focuses on a particular concept and provides source-code examples that demonstrate its behaviour and implementation.

Instead of focusing only on theoretical definitions, the emphasis is on understanding concepts by writing, executing, modifying, and experimenting with Java programs.

The collection begins with fundamental programming constructs and progresses towards more advanced topics such as generics, collections, exception handling, file operations, and multithreading.

### Project Objectives

- Develop a strong understanding of Java syntax and programming fundamentals.
- Understand how classes and objects form the foundation of object-oriented programming.
- Explore the four fundamental pillars of OOP through practical examples.
- Learn how Java handles object relationships, inheritance, and dynamic method dispatch.
- Understand commonly used Java APIs and data structures.
- Practise writing modular, readable, and maintainable code.
- Build a foundation for advanced Java development and problem-solving.

## ✨ Repository Highlights

| Area | Highlights |
|---|---|
| Programming Language | Java |
| Learning Focus | Object-Oriented Programming and Core Java |
| Code Organization | Separate directories for individual concepts |
| Development Environment | IntelliJ IDEA |
| Version Control | Git and GitHub |
| Examples | Independent Java programs and demonstrations |
| Learning Style | Hands-on implementation and experimentation |

---

## 🧠 Core Concepts

Object-Oriented Programming is based on organizing software around objects that combine data and behaviour.

This repository explores the major principles of OOP through individual Java implementations.

### 1. Encapsulation

Encapsulation combines data and methods within a class while controlling access to internal state.

**Key concepts:**
- Private instance variables.
- Public getter and setter methods.
- Access modifiers.
- Data validation and controlled modification.

**Example:**

```java
class BankAccount {
    private double balance;

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }
}
```

### 2. Inheritance

Inheritance allows a class to acquire properties and behaviours from another class.

**Key concepts:**
- Parent and child classes.
- The `extends` keyword.
- Code reusability.
- Constructor chaining.
- The `super` keyword.

**Example:**

```java
class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}
```

### 3. Polymorphism

Polymorphism allows the same method interface or reference type to represent different behaviours.

**Key concepts:**
- Method overloading.
- Method overriding.
- Compile-time polymorphism.
- Runtime polymorphism.
- Dynamic method dispatch.

**Example:**

```java
class Vehicle {
    void drive() {
        System.out.println("Vehicle is moving");
    }
}

class Car extends Vehicle {
    @Override
    void drive() {
        System.out.println("Car is driving");
    }
}

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Car();
        vehicle.drive();
    }
}
```

**Output:**

```text
Car is driving
```

### 4. Abstraction

Abstraction exposes essential behaviour while hiding implementation details.

**Key concepts:**
- Abstract classes.
- Abstract methods.
- Interfaces.
- Implementation hiding.
- Designing common contracts.

**Example:**

```java
abstract class Shape {
    abstract double area();
}

class Circle extends Shape {
    double radius = 5;

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}
```

---

## 📚 Topics Covered

The repository contains examples across the following areas.

### A. Object-Oriented Programming

| Directory | What It Demonstrates |
|---|---|
| `Object` | Class members, object creation, and methods |
| `Constructor` | Initializing objects through constructors |
| `Overloaded Constructor` | Multiple constructor signatures |
| `GETTER SETTER Methods` | Encapsulation and controlled access |
| `Inheritance` | Extending classes and reusing behaviour |
| `Method Overriding` | Redefining inherited methods |
| `Polymorphism` | Different implementations through a common reference |
| `Runtime Polymorphism` | Dynamic method dispatch |
| `Abstraction` | Abstract classes and methods |
| `Interface` | Implementing multiple interfaces |
| `Aggregation` | Relationships between independently existing objects |
| `Composition` | Relationships involving object ownership |
| `Anonymous Class` | Creating anonymous class implementations |
| `Super` | Accessing parent-class constructors and members |
| `Static` | Class-level variables and methods |
| `toString Method` | Custom string representation of objects |

### B. Core Java and Collections

| Directory | What It Demonstrates |
|---|---|
| `Array of objects` | Storing multiple objects in an array |
| `Array List` | Dynamic collections using ArrayList |
| `HashMaps` | Key-value data storage with HashMap |
| `Generics` | Type-safe reusable classes and methods |
| `Wrapper Class` | Object representations of primitive types |
| `Enums` | Defining fixed sets of constants |
| `DateTime` | Working with Java date and time classes |

### C. Exception Handling and File Operations

| Directory | What It Demonstrates |
|---|---|
| `Exception Handling` | Handling runtime errors and exceptional conditions |
| `Read file` | Reading file contents using Java I/O |
| `Write files` | Writing data to external files |

### D. Multithreading and Timers

| Directory | What It Demonstrates |
|---|---|
| `MultiThreading` | Executing multiple threads |
| `Threading` | Thread creation and daemon threads |
| `TimerTasks` | Scheduling repeated tasks |
| `COUNTDOWN TIMER` | Implementing a countdown using timer functionality |

---

## 🗂️ Project Structure

The repository is organized into separate directories for better readability, navigation, and independent experimentation.

```text
ObjectOrientedProgramming/
│
├── Abstraction/
├── Aggregation/
├── Anonymous Class/
├── Array List/
├── Array of objects/
├── Composition/
├── Constructor/
├── COUNTDOWN TIMER/
├── DateTime/
├── Enums/
├── Exception Handling/
├── GETTER SETTER Methods/
├── Generics/
├── HashMaps/
├── Inheritance/
├── Interface/
├── Method Overriding/
├── MultiThreading/
├── Object/
├── Overloaded Constructor/
├── Polymorphism/
├── Read file/
├── Runtime Polymorphism/
├── Static/
├── Super/
├── Threading/
├── TimerTasks/
├── toString Method/
├── Wrapper Class/
└── Write files/
```

**Organization notes:**

- Each directory focuses on a particular Java concept.
- Source files are maintained close to the topic they demonstrate.
- Many directories contain their own `Main` class.
- Examples are intended to be explored and executed independently.

---

## 💻 Technology Stack

<p align="center">
  <img src="https://skillicons.dev/icons?i=java,idea,git,github,vscode" alt="Java, IntelliJ IDEA, Git, GitHub and VS Code" />
</p>

| Technology | Role |
|---|---|
| Java | Primary programming language |
| JDK | Compilation and runtime environment |
| IntelliJ IDEA | Primary IDE for development |
| Git | Source-code version control |
| GitHub | Repository hosting and collaboration |
| VS Code | Additional code editing environment |

### Development Environment

Programs in this repository are developed and maintained using Java and IntelliJ IDEA.

Java source files use the `.java` extension and can be compiled and executed using the JDK or through an IDE.

---

## ⚙️ Getting Started

Follow these steps to explore and execute the programs locally.

### Prerequisites

Before getting started, ensure you have:

- Java Development Kit (JDK) installed.
- IntelliJ IDEA or another Java-compatible IDE.
- Git installed and configured.
- Basic familiarity with Java syntax.

### 1. Clone the Repository

```bash
git clone https://github.com/heyytrayamm/ObjectOrientedProgramming.git
```

### 2. Navigate to the Project

```bash
cd ObjectOrientedProgramming
```

### 3. Open in IntelliJ IDEA

1. Launch IntelliJ IDEA.
2. Select **Open**.
3. Choose the cloned repository directory.
4. Allow IntelliJ IDEA to configure the project.
5. Select the Java file you want to explore.

### 4. Compile and Run from the Terminal

You can also compile an individual Java program using:

```bash
javac Main.java
java Main
```

Make sure you execute the commands from the directory containing the relevant source file.

> **Important:** The repository contains multiple independent examples, including multiple classes named `Main`. Compiling every Java file together may cause duplicate-class errors. Execute each example separately.

---

## 🛣️ Learning Roadmap

The repository is a continuously evolving collection of Java implementations.

### Completed Learning Areas

- [x] Java classes and objects
- [x] Constructors and constructor overloading
- [x] Encapsulation
- [x] Inheritance
- [x] Method overloading and overriding
- [x] Runtime polymorphism
- [x] Abstraction
- [x] Interfaces
- [x] Aggregation and composition
- [x] Static members
- [x] Arrays and ArrayList
- [x] HashMap and Generics
- [x] Wrapper classes and enums
- [x] Exception handling
- [x] File handling
- [x] Multithreading fundamentals
- [x] Timer-based programs

### Planned Exploration

- [ ] Advanced Collections Framework
- [ ] Lambda expressions
- [ ] Functional interfaces
- [ ] Stream API
- [ ] Advanced exception handling
- [ ] Synchronization and concurrency
- [ ] Java design principles
- [ ] Practical Java applications
- [ ] Small projects combining multiple OOP concepts

---

## 🔍 Code Quality and Future Improvements

As the repository grows, the following improvements are planned:

- Standardize Java naming conventions.
- Improve code formatting and consistency.
- Add explanatory comments where they improve understanding.
- Introduce input validation and robust exception handling.
- Improve file handling through configurable paths.
- Add more practical examples of object-oriented design.
- Organize larger examples into clearer project structures.
- Include small applications demonstrating real-world use cases.

---

## 🤝 Contributions and Feedback

This repository primarily serves as a personal learning and practice space.

However, constructive feedback and suggestions are always welcome.

If you identify an issue or have an improvement in mind:

1. Fork the repository.
2. Create a separate branch.
3. Make your changes.
4. Submit a pull request describing the improvement.

Suggestions that improve correctness, readability, and learning value are especially appreciated.

---

## 👨‍💻 Author

<p align="center">
  <img src="https://img.shields.io/badge/Developer-Trayam%20Roy-181717?style=for-the-badge&logo=github" />
</p>

<p align="center">
  <b>Trayam Roy</b><br/>
  B.Tech — Information Technology
</p>

<p align="center">
  <a href="https://github.com/heyytrayamm">
    <img src="https://img.shields.io/badge/GitHub-Profile-181717?style=for-the-badge&logo=github" />
  </a>
  <a href="https://github.com/heyytrayamm/ObjectOrientedProgramming">
    <img src="https://img.shields.io/badge/Repository-Source%20Code-blue?style=for-the-badge&logo=github" />
  </a>
</p>

---

<p align="center">
  <b>Learn by building. Understand by experimenting. Improve through consistency.</b>
</p>

<p align="center">
  <sub>Java • Object-Oriented Programming • Core Concepts • Continuous Learning</sub>
</p>
