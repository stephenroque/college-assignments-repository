# Student Management System

This project implements a **Student Management System** using Java Swing for the graphical user interface (GUI). It allows users to manage student records, enroll students in courses, assign grades, and view student details. The system stores student information, course enrollments, and grades in a simple in-memory data structure.

## Project Structure

### **Classes and Panels**

- **MainFrame**  
  The main window of the application, displaying a tabbed interface with sections for managing students, updating records, assigning grades, enrolling in courses, and viewing student details.

- **AddStudentForm**  
  A form panel to add a new student, including fields for the student's ID and name. Once the user fills out the form and clicks the "Add Student" button, the student's details are saved.

- **UpdateStudentForm**  
  A form for updating existing student details. Allows the user to modify the name of a student based on their ID.

- **GradeManagementPanel**  
  Allows administrators to assign grades to students in specific courses. The panel contains fields for student ID, course name, and grade.

- **CourseEnrollmentPanel**  
  A form for enrolling students in courses. It allows users to input a student ID and course name, and then enroll the student in that course with an initial grade of "Not Graded."

- **ViewStudentDetailsPanel**  
  Displays a table of all registered students, showing their IDs and names. This allows administrators to view all students in the system.

- **StudentManagementPanel**  
  A panel that combines the student addition form with a table of student records, allowing easy management and viewing of students.

- **StudentTableModel**  
  A custom table model for displaying student data in a JTable. It binds the student information to the table and supports dynamic updates.

- **ErrorHandlingUtility**  
  A utility class that provides a method for displaying error messages using `JOptionPane`.

- **DataStore**  
  A class for managing the student records and grades. It contains a map to store students by their ID and another map to store grades by student ID and course.

- **Enrollment**  
  A class that represents the relationship between a student, a course, and the assigned grade. It contains getter and setter methods for managing enrollment data.

- **EnrollmentController**  
  A controller class responsible for handling the enrollment logic, although its functionality is currently empty.

- **Student**  
  A class representing a student with an ID and name. This class provides getter and setter methods for these attributes.

- **Course**  
  A class representing a course with a name attribute.

## Features

1. **Add Student**  
   Users can add new students to the system by entering their ID and name. The system will validate that all fields are filled before adding the student.

2. **Update Student**  
   Allows users to update the name of an existing student by entering their ID and a new name. It will show an error message if the student ID is not found.

3. **Enroll Student in Course**  
   Students can be enrolled in courses by specifying their student ID and the course name. The system automatically assigns a grade of "Not Graded" upon enrollment.

4. **Assign Grades**  
   Administrators can assign grades to students for specific courses. The grade is stored in the system and can be updated.

5. **View Student Details**  
   A tab that displays a list of all students currently in the system with their ID and name, using a `JTable` for easy viewing.

6. **Error Handling**  
   If any form fields are left blank or the student is not found, appropriate error messages will be displayed.

## User Interface Overview

The user interface is based on a tabbed layout:

- **Add Student**: A form to add new students.
- **Update Student**: A form to update student information.
- **Assign Grades**: A form to assign grades to students.
- **Course Enrollment**: A form for enrolling students in courses.
- **View Student Details**: Displays a table of all students.

## How to Run

### Prerequisites
- JDK 8 or higher.

### Steps
1. Clone the repository:
   ```bash
   git clone https://github.com/stephenroque/college-assignments-repository.git
   ```
2. Navigate to the project folder:
   ```bash
   cd college-assignments-repository/CS\ 1102\ -\ Programming\ 1/Unit\ 7/StudentManagementSystem/src/
   ```

### **Setup**
1. Compile the Java files:
   ```bash
   javac *.java
   ```
2. Run the `StudentManagementSystem` class:
   ```bash
   java StudentManagementSystem
   ```

## Data Store

The system uses an in-memory data store represented by the `DataStore` class. This class uses:

- **studentMap**: A `HashMap` to store students by their ID.
- **grades**: A `HashMap` to store grades for students, with each student ID mapping to a nested map of course names and their corresponding grades.

## ⚠️ Disclaimer

- This repository is for **educational purposes only**. 
- Please do not use the content here to submit assignments as your own. Always adhere to your institution’s academic integrity policies. 

## 💡 About Me

Hi, I'm **Stephen Roque**, a passionate Computer Science student at the University of the People. I'm always looking to learn and collaborate on new projects. Check out my [GitHub profile](https://github.com/stephenroque) to see more of my projects and contributions. **Connect with me on my [LinkedIn profile](https://www.linkedin.com/in/stephenroque/)!**
