)
📌 Project Description

The Zoo Animal Management System is a console-based Java application that simulates managing animals in a zoo.
The system allows the user to choose an animal, set and display its properties, and simulate its movement and eating behavior using Object-Oriented Programming (OOP) principles.

🎯 Project Objectives

Apply Object-Oriented Programming concepts in Java

Use Inheritance, Abstraction, Interfaces, and Polymorphism

Build a menu-driven console application

Practice handling user input using Scanner

🧩 Project Structure
ZooProject/
│
├── Main.java
├── Animal.java
├── Tiger.java
├── Dolphin.java
├── Penguin.java
├── Walk.java
├── Swim.java
├── Eat.java

🧠 OOP Concepts Used
🔹 Abstract Class

Animal

Represents a generic animal

Contains common properties such as name, age, height, and weight

Implements the Eat interface

🔹 Interfaces

Eat

Defines eating behavior for animals

Walk

Implemented by animals that can walk

Swim

Implemented by animals that can swim

🔹 Inheritance

Tiger, Dolphin, and Penguin inherit from the Animal class

🔹 Polymorphism

Each animal has its own implementation of movement and eating behavior

🐾 Supported Animals
🐯 Tiger

Properties:

Age

Height

Weight

Speed

Number of Stripes

Sound Level of Roar

Actions:

Walking

Eating

🐬 Dolphin

Properties:

Age

Height

Weight

Swimming Speed

Color

Actions:

Swimming

Eating

🐧 Penguin

Properties:

Age

Height

Weight

Swim Speed

Walk Speed

Swimming Status (true / false)

Actions:

Swimming or Walking (based on its state)

Eating

🖥️ How the Program Works

The user selects an animal from the Zoo Animal Menu

A second menu appears allowing the user to:

Set animal properties

Display animal properties

Display movement

Display eating behavior

The user can continue with the same animal or return to the main zoo menu

▶️ How to Run the Program

Open the project in any Java IDE (IntelliJ IDEA, Eclipse, or NetBeans)

Ensure all .java files are in the same package

Run Main.java

Follow the instructions shown in the console

🛠️ Technologies Used

Java

Object-Oriented Programming (OOP)

Scanner for user input

📌 Sample Menu Output
******* ZOO ANIMAL choice menu ******
1. Tiger
2. Dolphin
3. Penguin
Enter choice of animal:

📚 Learning Outcomes

Understand and apply abstract classes and interfaces

Implement real-life scenarios using OOP

Design a structured and maintainable Java application
