### Problem: Student Management System

**Objective:**
Create a Java program to manage a list of students, where each student can be either an undergraduate or a graduate student. The program should include functionality to add students, display their details, and calculate their tuition fees.

**Instructions:**

1. **Create a Base Class for Students:**
   - Design an abstract class named `Student` with the following private fields: `name` (String) and `studentID` (String).
   - Implement a constructor in `Student` to initialize these properties.
   - Define an abstract method `calculateTuition()` in `Student` to calculate the tuition fee.
   - Implement a regular method `displayDetails()` that prints the student's name and student ID.
   - Provide getter methods for the `name` and `studentID` properties.

2. **Subclass Implementation:**
   - Create two subclasses of `Student`: `Undergraduate` and `Graduate`.
   - Each subclass should have an additional property `creditHours` (int) to store the number of credit hours the student is enrolled in.
   - Implement a constructor in each subclass to initialize all properties, including those from `Student`.
   - Override the `calculateTuition()` method in each subclass to calculate the tuition fee. For example:
     - Undergraduate students pay $300 per credit hour.
     - Graduate students pay $500 per credit hour.
   - Override the `displayDetails()` method in each subclass to also print the number of credit hours and the calculated tuition fee.

3. **Main Class Implementation:**
   - In the `Main` class, create an array or a list to store instances of `Undergraduate` and `Graduate` students.
   - Implement a method to add a new student to the list.
   - Implement a method to display the details of all students in the list.
   - Implement a method to calculate the total tuition fees for all students in the list.

### Requirements:
- Ensure the program demonstrates the use of inheritance and method overriding.
- Each subclass should provide its own implementation of the `calculateTuition()` method.
- The `displayDetails()` method should be used to print the common details of the students, while the subclass implementations should include specific details.

### Example Output:
Your program should produce output similar to the following when run:

```
Name: John Doe
Student ID: U123
Credit Hours: 15
Tuition Fee: $4500

Name: Jane Smith
Student ID: G456
Credit Hours: 9
Tuition Fee: $4500

Total Tuition Fees: $9000
```
