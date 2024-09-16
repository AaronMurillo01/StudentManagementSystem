# --------------------------------------------
# Student Management System
# --------------------------------------------

# Project Overview
# The Student Management System is a simple Java console-based application that allows users to manage student records.
# This project demonstrates basic CRUD (Create, Read, Update, Delete) operations, allowing users to:
# - Add new students.
# - View all students.
# - Update student details.
# - Delete students.
# 
# This project is a good starting point for understanding object-oriented programming (OOP) principles in Java, 
# including encapsulation, constructors, and data manipulation using ArrayLists.

# Features:
# - Add a student by entering their ID, name, course, and grade.
# - View all students' details in the system.
# - Update student details (name, course, or grade) by searching via the student ID.
# - Delete a student from the system by their ID.
# - Simple and easy-to-use console interface.

# --------------------------------------------
# Folder Structure
# --------------------------------------------
# StudentManagementSystem/
# │
# ├── src/
# │   ├── Student.java
# │   └── StudentManagementSystem.java
# └── .vscode/           # Optional (for debugging in VSCode)
#     └── launch.json    # Optional (VSCode debugging config)

# --------------------------------------------
# Prerequisites
# --------------------------------------------
# Before running the application, ensure you have the following installed:
# - Java Development Kit (JDK): Download and install JDK (version 17 or later recommended).
# - You can check if it's installed using the command:
java -version

# - Text Editor or IDE: You can use any text editor or IDE.
#   Recommended: Visual Studio Code or IntelliJ IDEA.

# --------------------------------------------
# How to Run
# --------------------------------------------

# Step 1: Clone or Download the Project
# Clone the repository or download the project files into your local machine.

# Step 2: Compile the Java Files
# Open a terminal in the project folder (StudentManagementSystem/), navigate to the src/ directory, and compile the Java files:
cd src
javac Student.java StudentManagementSystem.java

# Step 3: Run the Application
# After compiling the files, run the program with the following command:
java StudentManagementSystem

# Step 4: Interact with the Program
# Once the application is running, a menu will be displayed. You can select any of the following options:
# - Add Student
# - View All Students
# - Update Student
# - Delete Student
# - Exit
# Follow the prompts to interact with the system.

# --------------------------------------------
# Future Enhancements (Optional)
# --------------------------------------------
# - Data Persistence: Save student data to a file (e.g., CSV, JSON) or database, so the data is retained after the application exits.
# - Input Validation: Add better validation to ensure that all inputs (e.g., ID, grade) are correctly formatted.
# - Graphical User Interface (GUI): Consider using JavaFX or Swing to build a graphical version of this application.
