# ☕ Object Oriented Programming in Java

<p align="center">
  <img src="https://img.shields.io/badge/Language-Java-orange?style=for-the-badge&logo=openjdk&logoColor=white" alt="Java"/>
  <img src="https://img.shields.io/badge/IDE-IntelliJ%20IDEA-000000?style=for-the-badge&logo=intellij-idea&logoColor=white" alt="IntelliJ IDEA"/>
  <img src="https://img.shields.io/badge/Focus-OOP%20%26%20Core%20Java-blue?style=for-the-badge&logo=java&logoColor=white" alt="OOP and Core Java"/>
  <img src="https://img.shields.io/badge/Status-Learning%20%26%20Practice-success?style=for-the-badge" alt="Learning and Practice"/>
</p>

<p align="center">
  <b>A collection of Java programs, practical examples, and concept-based implementations built while learning Core Java and Object-Oriented Programming.</b>
</p>

<p align="center">
  <a href="https://github.com/heyytrayamm/ObjectOrientedProgramming">Repository</a> •
  <a href="#-topics-covered">Topics</a> •
  <a href="#-getting-started">Getting Started</a> •
  <a href="#-learning-roadmap">Learning Roadmap</a>
</p>

---

## 📌 About This Repository

Welcome to my **Object Oriented Programming in Java** repository!

This repository documents my journey of learning Java, starting with fundamental programming concepts and gradually moving towards object-oriented principles and more advanced Core Java features.

It contains individual programs that demonstrate how Java concepts work through simple, practical examples. Each topic is organized into its own directory to make learning, revisiting, and experimenting with code easier.

### 🎯 Objectives

- Build a strong foundation in Java programming.
- Understand the four pillars of Object-Oriented Programming.
- Learn how objects interact with one another.
- Explore Java's built-in features and Collections Framework.
- Develop problem-solving and programming skills.
- Prepare for Java-based Data Structures and Algorithms (DSA).

---

## 🧠 Topics Covered

The repository covers a range of Java concepts, organized into learning categories.

### 1. Java & OOP Fundamentals

| Topic | Concepts |
|---|---|
| Object | Classes, objects, fields and methods |
| Constructors | Object initialization |
| Overloaded Constructor | Constructor overloading |
| Static | Static variables and shared class members |
| Getter & Setter Methods | Encapsulation and controlled access |
| `this` | Current object reference |
| `super` | Parent class reference |
| `toString()` | Object representation |

### 2. The Four Pillars of OOP

| Pillar | Topics |
|---|---|
| **Encapsulation** | Getters, setters and data hiding |
| **Inheritance** | Parent and child classes |
| **Polymorphism** | Method overriding and runtime polymorphism |
| **Abstraction** | Abstract classes and abstract methods |

### 3. Object Relationships & Advanced OOP

- **Aggregation** – Representing relationships between independent objects.
- **Composition** – Building objects using other objects as components.
- **Interfaces** – Defining contracts and implementing multiple interfaces.
- **Anonymous Classes** – Creating classes without explicitly declaring a named class.
- **Method Overriding** – Providing specialized implementations of inherited methods.
- **Arrays of Objects** – Managing multiple object instances.

### 4. Core Java Features

- Generics
- Wrapper Classes
- Enums
- ArrayList
- HashMap
- Exception Handling
- Date and Time API
- File Reading
- File Writing

### 5. Multithreading & Time-Based Programs

- Threads and Runnable
- Multithreading
- Thread execution and synchronization basics
- Daemon Threads
- Timer and TimerTask
- Countdown Timer

---

## 📂 Repository Structure

The repository is organized into separate directories, with each directory focusing on a particular Java concept.

```text
ObjectOrientedProgramming/
│
├── Abstraction/
├── Aggregation/
├── Anonymous Class/
├── Array List/
├── Array of objects/
├── COUNTDOWN TIMER/
├── Composition/
├── Constructor/
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
├── Write files/
│
├── .gitignore
└── README.md
```

> Each topic directory contains its own Java source files and, in many cases, a `Main.java` file that demonstrates the concept.

---

## 🚀 Getting Started

You can clone this repository and run the programs locally using IntelliJ IDEA or any Java-supported IDE.

### Prerequisites

Make sure you have:

- Java Development Kit (JDK) installed.
- IntelliJ IDEA, VS Code, or another Java IDE.
- Basic knowledge of programming fundamentals.

### 1. Clone the Repository

```bash
git clone https://github.com/heyytrayamm/ObjectOrientedProgramming.git
```

### 2. Navigate to the Project

```bash
cd ObjectOrientedProgramming
```

### 3. Open in IntelliJ IDEA

1. Open IntelliJ IDEA.
2. Select **Open Project**.
3. Choose the cloned `ObjectOrientedProgramming` directory.
4. Allow IntelliJ IDEA to configure the project.

### 4. Run a Program

1. Open the directory of the topic you want to explore.
2. Navigate to its `src` folder.
3. Open the corresponding Java file.
4. Run its `main()` method.

**Important:** Many directories contain classes with the same name, such as `Main`. Run each topic as an independent example rather than compiling every Java file in the repository together.

---

## 💻 Example

Here's a simple example of runtime polymorphism from the repository's learning concepts:

```java
class Animal {
    void speak() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void speak() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    void speak() {
        System.out.println("Cat meows");
    }
}

public class Main {
    public static void main(String[] args) {

        Animal animal;

        animal = new Dog();
        animal.speak();

        animal = new Cat();
        animal.speak();
    }
}
```

**Output:**

```text
Dog barks
Cat meows
```

This demonstrates how a parent-class reference can refer to different child-class objects and invoke their overridden methods at runtime.

---

## 🗺️ Learning Roadmap

The repository follows a progression from basic Java concepts towards more advanced programming topics.

- [x] Java classes and objects
- [x] Constructors and constructor overloading
- [x] Encapsulation
- [x] Inheritance
- [x] Polymorphism
- [x] Abstraction
- [x] Interfaces
- [x] Aggregation and composition
- [x] Generics and wrapper classes
- [x] Collections basics
- [x] Exception handling
- [x] File handling
- [x] Multithreading fundamentals
- [ ] Deeper Collections Framework practice
- [ ] Lambda expressions and Stream API
- [ ] Comparable and Comparator
- [ ] Custom exception development
- [ ] JDBC and database connectivity
- [ ] Unit testing with JUnit
- [ ] A complete Java OOP project

*The checklist reflects the topics represented in this repository and the planned areas for further practice.*

---

## 🛠️ Technologies & Tools

| Technology | Purpose |
|---|---|
| Java | Primary programming language |
| JDK | Java development and execution |
| IntelliJ IDEA | Code editor and development environment |
| Git | Version control |
| GitHub | Source code hosting and project management |

---

## 🌱 Future Improvements

This repository will continue evolving as I explore more of Java.

Some planned improvements include:

- Refactoring examples using better coding conventions.
- Improving encapsulation and access modifiers.
- Adding more practical examples of Collections.
- Exploring Java 8+ features such as Lambdas and Streams.
- Adding comments and explanations to complex implementations.
- Building larger applications that combine multiple OOP concepts.

---

## 🤝 Contributions & Feedback

This is primarily a personal learning repository, but suggestions, feedback, and improvements are always welcome!

If you find an issue or have an idea for improving an example, feel free to open an issue or submit a pull request.

---

## 👨‍💻 Author

**Trayam Roy**


<p>
  <a href="https://github.com/heyytrayamm">
    <img src="https://img.shields.io/badge/GitHub-heyytrayamm-181717?style=for-the-badge&logo=github" alt="GitHub Profile"/>
  </a>
</p>

---

<p align="center">
  <b>Learning by doing. Improving one program at a time. ☕</b>
</p>

<p align="center">
  <i>Made with curiosity and Java.</i>
</p>
