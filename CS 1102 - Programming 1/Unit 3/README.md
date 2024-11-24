# Student Record Management System

This Java-based Student Record Management System allows users to add new students, update student information, and view student details. It uses a simple console-based menu system to manage and interact with the student records.

## Features

- **Add New Student**: Add a new student to the system with validation checks for unique student IDs, valid age input, and non-empty fields.
- **Update Student Information**: Update details like name, age, or grade for existing students by their ID.
- **View Student Details**: View the complete details of a student using their unique student ID.
- **Data Validation**: Ensures proper input for student name, age, and grade, including checks for unique IDs and numeric age values.

## Program Overview

1. **Student Class Representation**: 
   - Student details (name, ID, age, and grade) are stored in a 2D array, where each student occupies a row.
   - Each student’s record consists of four fields: Name, ID, Age, and Grade.
   
2. **Main Menu**:
   - The system presents a menu with options:
     1. Add a new student.
     2. Update student information.
     3. View student details.
     4. Exit the program.

3. **User Input**:
   - The program uses the `Scanner` class to read input from the user, ensuring proper validation at each step.
   
4. **System Limitations**:
   - The system assumes a maximum of 100 students (due to the fixed array size).
   - It uses a 2D array (`students[][]`) to store the data, which can be extended to a more complex data structure like a database if needed.

## Example Output

```plaintext
Student Record Management System
1. Add New Student
2. Update Student Information
3. View Student Details
4. Exit
Enter your choice: 1

Adding a New Student
Enter student name: John Doe
Enter student ID (must be unique): S12345
Enter student age (numbers only): 20
Enter student grade: A
Student added successfully.

Student Record Management System
1. Add New Student
2. Update Student Information
3. View Student Details
4. Exit
Enter your choice: 3

Viewing Student Details
Enter student ID: S12345
Student Details:
Name: John Doe
ID: S12345
Age: 20
Grade: A
```

## Menu Options

1. **Add New Student**: 
   - Adds a new student with required fields: Name, ID (unique), Age (numeric), and Grade.
   
2. **Update Student Information**: 
   - Allows users to update a student's information such as name, age, or grade by entering their unique student ID.

3. **View Student Details**: 
   - Displays all details for a student based on their unique student ID.

4. **Exit**: 
   - Exits the program.

## How to Run

### Prerequisites
- Java Development Kit (JDK) installed.

### Steps
1. **Clone or Copy the Code**

2. **Compile the Java Program**:
   ```bash
   javac StudentRecordManagementSystem.java
   ```

3. **Run the Program**: After compiling, run the program with the following command:
   ```bash
   java StudentRecordManagementSystem
   ```

4. **Interact with the System**: Follow the on-screen menu options to add, update, view, or exit.

## Technologies Used

- **Java**: The program is written in Java and uses the `Scanner` class for user input and basic exception handling for input validation.

---

## ⚠️ Disclaimer

- This repository is for **educational purposes only**. 
- Please do not use the content here to submit assignments as your own. Always adhere to your institution’s academic integrity policies. 

## 💡 About Me

Hi, I'm **Stephen Roque**, a passionate Computer Science student at the University of the People. I'm always looking to learn and collaborate on new projects. Check out my [GitHub profile](https://github.com/stephenroque) to see more of my projects and contributions. **Connect with me on my [LinkedIn profile](https://www.linkedin.com/in/stephenroque/)!**