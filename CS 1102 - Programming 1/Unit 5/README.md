# **Course Enrollment and Grade Management System**

## **Overview**

The **Course Enrollment and Grade Management System** is a Java-based application that allows administrators to manage courses, enroll students, assign grades, and calculate overall grades. The system is designed to simplify the enrollment process and grade management for educational institutions.

### **Features:**
- Add and manage courses.
- Enroll students in courses with automatic capacity checks.
- Assign grades to students for individual courses.
- Calculate the overall grade for students based on their enrolled courses.
- Command-line interface for administrators to interact with the system.

---

## **Project Structure**

The project consists of the following main classes:

1. **`Student.java`**: Represents a student and manages their enrollment in courses and grades.
2. **`Course.java`**: Represents a course and handles enrollment, capacity checks, and grade assignments.
3. **`CourseManagement.java`**: Manages the list of courses and students, providing methods to enroll students and calculate grades.
4. **`AdministratorInterface.java`**: Provides a command-line interface for administrators to interact with the system.

---

## **Class Descriptions**

### **Student**
- **Purpose**: Represents a student and manages their enrollment in courses and the grades they receive.
- **Key Methods**:
  - `enrollInCourse(Course course)`: Enroll a student in a course if space is available.
  - `assignGrade(Course course, double grade)`: Assign a grade to a student for a specific course.
  - `getEnrolledCourses()`: Returns a map of courses the student is enrolled in with their respective grades.

### **Course**
- **Purpose**: Represents a course and tracks its enrolled students, course code, name, and maximum capacity.
- **Key Methods**:
  - `incrementEnrolledStudents()`: Increases the count of enrolled students if the course capacity allows.
  - `getEnrolledStudents()`: Returns the current number of enrolled students.
  - `getMaxCapacity()`: Returns the maximum capacity of the course.
  - `getTotalEnrolledStudents()`: Returns the total number of enrolled students across all courses.

### **CourseManagement**
- **Purpose**: Manages all courses and students in the system.
- **Key Methods**:
  - `addCourse(String courseCode, String name, int maxCapacity)`: Adds a new course to the system.
  - `enrollStudent(Student student, Course course)`: Enrolls a student in a specified course.
  - `assignGrade(Student student, Course course, double grade)`: Assigns a grade to a student for a course.
  - `calculateOverallGrade(Student student)`: Calculates and returns the overall grade for a student based on their enrolled courses.
  
### **AdministratorInterface**
- **Purpose**: Provides a command-line interface for administrators to interact with the system.
- **Key Methods**:
  - `addNewCourse()`: Prompts the administrator to add a new course.
  - `enrollStudentInCourse()`: Prompts the administrator to enroll a student in a course.
  - `assignGradeToStudent()`: Allows the administrator to assign a grade to a student.
  - `calculateStudentOverallGrade()`: Calculates and displays the overall grade for a student.

---

## **How to Run**

### Prerequisites
- JDK 8 or higher.

### Steps
1. Clone the repository:
   ```bash
   git clone https://github.com/stephenroque/college-assignments-repository.git
   ```
2. Navigate to the project folder:
   ```bash
   cd college-assignments-repository/CS\ 1102\ -\ Programming\ 1/Unit\ 5/Course\ Enrollment\ and\ Grade\ Management\ System/src/
   ```

### **Setup**
1. Compile the Java files:
   ```bash
   javac *.java
   ```
2. Run the administrator interface:
   ```bash
   java AdministratorInterface
   ```

### **Running the Program**
Once you run the `AdministratorInterface`, the program will display a menu with the following options:
1. **Add a new course**: Prompts the administrator to add a new course (course code, name, and capacity).
2. **Enroll a student in a course**: Prompts the administrator to enroll a student (entering name, ID, and course code).
3. **Assign a grade to a student**: Prompts the administrator to assign a grade to a student for a specific course.
4. **Calculate overall grade for a student**: Prompts the administrator to calculate and display the overall grade for a student.
5. **Exit**: Exits the program.

### **Example Usage**
1. **Add a Course**:
   - Course Code: `CS101`
   - Course Name: `Introduction to Computer Science`
   - Maximum Capacity: `3`

2. **Enroll a Student**:
   - Student: `Alice`, ID: `S001`
   - Enroll in Course: `CS101`

3. **Assign Grades**:
   - Alice is assigned a grade of `85` for `CS101`.

4. **Calculate Overall Grade**:
   - The system calculates the overall grade for Alice based on all enrolled courses.

---

## **Design Details**

### **Data Structure**
- **Student**: A `Map` holds courses as keys and grades as values for each student.
- **Course**: A `List` of courses is managed by `CourseManagement`, where each course can enroll students up to its max capacity.

### **Error Handling**
- **Course Enrollment**: Prevents students from enrolling in full courses.
- **Grade Assignment**: Ensures grades are only assigned to students who are enrolled in the course.

---

## ⚠️ Disclaimer

- This repository is for **educational purposes only**. 
- Please do not use the content here to submit assignments as your own. Always adhere to your institution’s academic integrity policies. 

## 💡 About Me

Hi, I'm **Stephen Roque**, a passionate Computer Science student at the University of the People. I'm always looking to learn and collaborate on new projects. Check out my [GitHub profile](https://github.com/stephenroque) to see more of my projects and contributions. **Connect with me on my [LinkedIn profile](https://www.linkedin.com/in/stephenroque/)!**