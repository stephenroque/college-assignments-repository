**Course Enrollment and Grade Management System**

**Project Overview**

The Course Enrollment and Grade Management System is designed to manage
student enrollment, grade assignment, and overall grade calculation for
a university. It includes functionalities to add courses, enroll
students, assign grades, and calculate overall grades through a
command-line interface for administrators.

**Class and Method Documentation**

**Student Class**

**Purpose:** Represents a student and manages their enrollment in
courses and grades.

**Instance Variables:**

-  **'private String name'**: The student\'s name.

-  **'private String id'**: The student\'s ID.

-  **'private Map\<Course, Double\> enrolledCourses'**: A map to store
    courses the student is enrolled in along with their grades.

**Methods:**

-  **'public Student(String name, String id)'**: Constructor to
    initialize the student\'s name and ID.

-  **'public String getName()'**: Returns the student\'s name.

-  **'public void setName(String name)'**: Sets the student\'s name.

-  **'public String getId()'**: Returns the student\'s ID.

-  **'public void setId(String id)'**: Sets the student\'s ID.

-  **'public void enrollInCourse(Course course)'**: Enrolls the student
    in a course if capacity allows.

-  **'public void assignGrade(Course course, double grade)'**: Assigns
    a grade to the student for a specific course.

-  **'public Map\<Course, Double\> getEnrolledCourses()'**: Returns the
    map of courses and grades the student is enrolled in.

**Course Class**

**Purpose:** Represents a course and manages enrollment capacity.

**Instance Variables:**

-  **'private String courseCode'**: The course code.

-  **'private String name'**: The course name.

-  **'private int maxCapacity'**: The maximum number of students that
    can enroll.

-  **'private int enrolledStudents'**: The current number of enrolled
    students.

**Static Variables:**

-  **'private static int totalEnrolledStudents'**: Tracks the total
    number of students enrolled in all courses.

**Methods:**

-  **'public Course(String courseCode, String name, int
    maxCapacity)'**: Constructor to initialize course details.

-  **'public String getCourseCode()'**: Returns the course code.

-  **'public String getName()'**: Returns the course name.

-  **'public int getMaxCapacity()'**: Returns the maximum capacity of
    the course.

-  **'public int getEnrolledStudents()'**: Returns the current number
    of enrolled students.

-  **'public void incrementEnrolledStudents()'**: Increments the count
    of enrolled students if capacity allows.

-  **'public static int getTotalEnrolledStudents()'**: Returns the
    total number of students enrolled in all courses.

**CourseManagement Class**

**Purpose:** Manages the list of courses and students, and provides
methods to add courses, enroll students, assign grades, and calculate
overall grades.

**Static Variables:**

-  **'private static List\<Course\> courses'**: List to store all
    courses.

-  **'private static List\<Student\> students'**: List to store all
    students.

**Methods:**

-  **'public static void addCourse(String courseCode, String name, int
    maxCapacity)'**: Adds a new course to the list.

-  **'public static void enrollStudent(Student student, Course
    course)'**: Enrolls a student in a course.

-  **'public static void assignGrade(Student student, Course course,
    double grade)'**: Assigns a grade to a student for a specific
    course.

-  **'public static double calculateOverallGrade(Student student)'**:
    Calculates and returns the overall grade for a student.

-  **'public static List\<Course\> getCourses()'**: Returns the list of
    courses.

-  **'public static List\<Student\> getStudents()'**: Returns the list
    of students.

-  **'public static void addStudent(Student student)'**: Adds a student
    to the list.

**Administrator Interface**

**Purpose:** Provides a command-line interface for administrators to
interact with the system.

**Methods:**

-  **'public static void main(String\[\] args)'**: Main method to run
    the interface.

-  **'private static void displayMenu()'**: Displays the main menu
    options.

-  **'private static void addNewCourse()'**: Prompts the administrator
    to add a new course.

-  **'private static void enrollStudentInCourse()'**: Prompts the
    administrator to enroll a student in a course.

-  **'private static void assignGradeToStudent()'**: Prompts the
    administrator to assign a grade to a student.

-  **'private static void calculateStudentOverallGrade()'**: Prompts
    the administrator to calculate a student\'s overall grade.

-  **'private static Course findCourseByCode(String courseCode)'**:
    Finds a course by its code.

-  **'private static Student findStudentById(String studentId)'**:
    Finds a student by their ID.

**Static Methods and Variables**

-  **Static Variables:**

    -  **'totalEnrolledStudents'** in**'Course'** class tracks the
        total number of enrolled students across all courses.

    -  **'courses'** and**'students'** in**'CourseManagement'** class
        maintain lists of all courses and students respectively.

-  **Static Methods:**

    -   Static methods in**'CourseManagement'** such as
       **'addCourse'**,**'enrollStudent'**,**'assignGrade'**, and
       **'calculateOverallGrade'** manipulate the static lists of
        courses and students, providing centralized control over the
        enrollment and grading process.

**Running the Program**

1.  Compile the Classes: Ensure you have all the classes (**'Student'**,
   **'Course'**,**'CourseManagement'**, and
   **'AdministratorInterface'**) in the same directory. Open a terminal
    and navigate to this directory.

2. **Compile the Classes**: Run the following commands:

-   javac Student.java

-   javac Course.java

-   javac CourseManagement.java

-   javac AdministratorInterface.java

3. **Run the Administrator Interface**: Execute the main program:

-   java AdministratorInterface

4. **Interact with the Interface:**

-   Follow the on-screen prompts to add courses, enroll students, assign
    grades, and calculate overall grades.

-   Input the required information when prompted.

-   Select the appropriate menu options by entering the corresponding
    number.