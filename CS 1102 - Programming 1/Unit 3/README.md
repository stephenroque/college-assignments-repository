**Student Record Management System Documentation**

**Overview**

The Student Record Management System is a Java program designed to help
administrators efficiently manage student records. It provides
functionalities such as adding new students, updating student
information, and viewing student details.

**Features**

1. **Add New Student:** Allows administrators to add a new student to
    the system by providing the student\'s name, ID, age, and grade.

2. **Update Student Information**: Enables administrators to update the
    information of an existing student, including their name, age, and
    grade.

3. **View Student Details:** Allows administrators to view the details
    of a specific student by providing their student ID.

**Running the Program**

1. **Compile the Code:** Use a Java compiler to compile the
    'StudentRecordManagementSystem.java' file. Open a terminal or
    command prompt and navigate to the directory containing the Java
    file.

> javac StudentRecordManagementSystem.java

2. **Run the Program:** Execute the compiled Java file using the 'java'
    command.

> java StudentRecordManagementSystem

**Interacting with the Administrator Interface**

Once the program is running, you will be presented with the
administrator interface. Follow these steps to interact with the system:

1. **Main Menu:** The main menu will display the available options.

2. **Select an Option:** Enter a number between 1 and 4 to select an
    option from the menu. Each option corresponds to a specific
    functionality:

-  **Option 1:** Add a new student.

-  **Option 2:** Update information for an existing student.

-  **Option 3:** View details of a specific student.

-  **Option 4:** Exit the program.

3. **Adding a New Student:**

-   When choosing option 1, you\'ll be prompted to provide the following
    information for the new student:

    -   Student name

    -   Student ID (must be unique)

    -   Student age (numbers only)

    -   Student grade

-   Ensure that all fields are filled correctly. Empty fields or
    non-numeric values for age will result in error messages.

4. **Updating Student Information:**

-   To update a student\'s information (option 2), enter the student ID
    first.

-   You\'ll then be prompted to provide new information for the student,
    including name, age, and grade. Leave a field blank to retain the
    existing value for that attribute.

5. **Viewing Student Details:**

-   To view the details of a specific student (option 3), enter the
    student ID when prompted.

-   The program will display the student\'s name, ID, age, and grade if
    the student exists in the system.

**Error Handling**

The program includes error handling mechanisms to manage various
scenarios:

-  **Empty Fields:** Error messages will be displayed if any required
    field (such as name, ID, or grade) is left empty.

-  **Invalid Age:** If the provided age is not a valid number, an error
    message will be shown, and the administrator will be prompted to
    enter a valid age.

-  **Duplicate ID:** If a student ID already exists in the system, the
    administrator will be asked to enter a unique ID for the new
    student.