# Design Patterns in Java

This repository contains examples of various design patterns implemented in Java. Design patterns are typical solutions to common problems in software design. Each pattern is like a blueprint that you can customize to solve a particular design problem in your code.

## Implemented Design Patterns

### 1. Factory Method Pattern

**Description:**
The Factory Method Design Pattern is a creational pattern that provides an interface for creating objects in a superclass, but allows subclasses to alter the type of objects that will be created. This pattern promotes loose coupling by eliminating the need to bind application-specific classes into the code. The client code interacts with the factory and the product interfaces, making it easier to introduce new types of products without modifying the client code.

**Example:**
In the `factory_method.java` file, we have implemented a notification system where different types of notifications (Email, SMS, Push) can be created using a factory method.

### 2. Adapter Pattern

**Description:**
The Adapter Design Pattern is a structural pattern that allows objects with incompatible interfaces to work together. It acts as a bridge between two incompatible interfaces by wrapping an existing class with a new interface. This pattern is particularly useful when integrating new components into an existing system without modifying the existing code.

**Example:**
In the `adapter.java` file, we have implemented an adapter that allows a modern audio player to be used as an MP3 player. This demonstrates how an advanced audio player can be adapted to work with an interface designed for a basic MP3 player.

### 3. Singleton Pattern

**Description:**
The Singleton Pattern ensures that a class has only one instance and provides a global point of access to it. This is useful when exactly one object is needed to coordinate actions across the system.

**Example:**
In the `singleton.java` file, we have implemented a configuration class that ensures only one instance of the configuration settings exists throughout the application. This is useful for managing global settings like themes.

## How to Run the Examples

Each design pattern example is contained within its own Java file. To run an example, compile and execute the `Main` class within the respective file. For instance, to run the Factory Method example:

```sh
javac design_patterns/factory_method.java
java design_patterns.Main
```
