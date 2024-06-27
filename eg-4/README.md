## Student Tuition Management Program

This Java program demonstrates the use of object-oriented programming principles to manage student tuition details. It includes an abstract base class `Student` and two subclasses `Undergraduate` and `Graduate`, each with specific implementations for calculating tuition.

### Features

- **Abstract Class `Student`**: Defines common properties and methods for all student types.
- **Subclasses `Undergraduate` and `Graduate`**: Provide specific implementations for calculating tuition and displaying student details.
- **Polymorphism**: The program uses polymorphism to handle different types of students through a common interface.

### Classes Overview

1. **Student (Abstract Class)**
   - **Fields**:
     - `studentName` (String)
     - `studentID` (String)
   - **Constructor**:
     - Initializes `studentName` and `studentID`.
   - **Methods**:
     - `calcTuition()` (Abstract Method): To be implemented by subclasses.
     - `displayDetails()`: Displays student name and ID.
     - `getStudentName()`: Returns the student name.
     - `getStudentID()`: Returns the student ID.

2. **Undergraduate (Subclass of Student)**
   - **Fields**:
     - `creditHours` (int)
     - `tuition` (int)
   - **Constructor**:
     - Initializes `studentName`, `studentID`, and `creditHours`.
   - **Methods**:
     - `calcTuition()`: Calculates tuition based on credit hours.
     - `getTuition()`: Returns the tuition fee.
     - `displayDetails()`: Displays student details including tuition fee.

3. **Graduate (Subclass of Student)**
   - **Fields**:
     - `researchHours` (int)
     - `tuition` (int)
   - **Constructor**:
     - Initializes `studentName`, `studentID`, and `researchHours`.
   - **Methods**:
     - `calcTuition()`: Calculates tuition based on research hours.
     - `getTuition()`: Returns the tuition fee.
     - `displayDetails()`: Displays student details including tuition fee.

4. **Main Class**
   - **Functionality**:
     - Creates an array of `Student` objects, including instances of `Undergraduate` and `Graduate`.
     - Iterates through the array to calculate tuition and display details for each student.

### How to Run

1. **Compile the Program**: Use a Java compiler to compile the program files.
   ```bash
   javac Student.java Undergraduate.java Graduate.java Main.java
   ```

2. **Run the Program**: Execute the `Main` class.
   ```bash
   java Main
   ```

### Example Output

The program will produce an output similar to the following:

```
Student name: Bryant
Student ID: BN20394B
Credit hours: 150
Tuition fee: $45000

Student name: Elise
Student ID: EN30495C
Credit hours: 120
Tuition fee: $36000

Student name: Alex
Student ID: AX10394D
Research hours: 40
Tuition fee: $20000

Student name: Sophia
Student ID: SP50495E
Research hours: 50
Tuition fee: $25000
```

### Notes

- The program demonstrates key OOP principles: abstraction, inheritance, and polymorphism.
- Method overriding is used to provide specific implementations in the `Undergraduate` and `Graduate` classes.
- The `Main` class showcases how polymorphism allows the use of a common interface to handle different types of objects.

This program can be extended to include more student types, additional fields, and more complex tuition calculation logic as needed.
