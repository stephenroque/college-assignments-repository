import java.util.Scanner;

/**
 * A simple Student Record Management System.
 */
public class StudentRecordManagementSystem {
    // Static variables to store total number of students and the student list
    private static int totalStudents = 0;
    private static String[][] students = new String[100][4]; // Assuming a maximum of 100 students

    /**
     * Main method to run the Student Record Management System.
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Main menu loop
        while (true) {
            displayMenu();
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    addNewStudent(scanner);
                    break;
                case 2:
                    updateStudentInformation(scanner);
                    break;
                case 3:
                    viewStudentDetails(scanner);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }
        }
    }

    /**
     * Displays the main menu of the Student Record Management System.
     */
    private static void displayMenu() {
        System.out.println("\nStudent Record Management System");
        System.out.println("1. Add New Student");
        System.out.println("2. Update Student Information");
        System.out.println("3. View Student Details");
        System.out.println("4. Exit");
    }

    /**
     * Adds a new student to the system.
     * @param scanner Scanner object to read user input.
     */
    private static void addNewStudent(Scanner scanner) {
        System.out.println("\nAdding a New Student");

        // Input validation loop
        String name, id, age, grade;
        do {
            System.out.print("Enter student name: ");
            name = scanner.nextLine().trim();
            if (name.isEmpty()) {
                System.out.println("Name cannot be empty. Please enter a valid name.");
            }
        } while (name.isEmpty());

        do {
            System.out.print("Enter student ID (must be unique): ");
            id = scanner.nextLine().trim();
            if (id.isEmpty()) {
                System.out.println("ID cannot be empty. Please enter a valid ID.");
            } else if (isIdExists(id)) {
                System.out.println("ID already exists. Please enter a unique ID.");
            }
        } while (id.isEmpty() || isIdExists(id));

        do {
            System.out.print("Enter student age (numbers only): ");
            age = scanner.nextLine().trim();
            if (!age.matches("\\d+")) {
                System.out.println("Age must be a number. Please enter a valid age.");
            }
        } while (!age.matches("\\d+"));

        do {
            System.out.print("Enter student grade: ");
            grade = scanner.nextLine().trim();
            if (grade.isEmpty()) {
                System.out.println("Grade cannot be empty. Please enter a valid grade.");
            }
        } while (grade.isEmpty());

        // Add student to the system
        students[totalStudents][0] = name;
        students[totalStudents][1] = id;
        students[totalStudents][2] = age;
        students[totalStudents][3] = grade;

        totalStudents++;
        System.out.println("Student added successfully.");
    }

    /**
     * Updates information of an existing student.
     * @param scanner Scanner object to read user input.
     */
    private static void updateStudentInformation(Scanner scanner) {
        System.out.println("\nUpdating Student Information");
        System.out.print("Enter student ID: ");
        String id = scanner.nextLine();

        int index = findStudentIndex(id);
        if (index != -1) {
            System.out.print("Enter new student name (leave blank to keep '" + students[index][0] + "'): ");
            String name = scanner.nextLine().trim();
            if (!name.isEmpty()) {
                students[index][0] = name;
            }

            System.out.print("Enter new student age (leave blank to keep '" + students[index][2] + "'): ");
            String age = scanner.nextLine().trim();
            if (!age.isEmpty()) {
                if (!age.matches("\\d+")) {
                    System.out.println("Age must be a number. No changes were made.");
                } else {
                    students[index][2] = age;
                }
            }

            System.out.print("Enter new student grade (leave blank to keep '" + students[index][3] + "'): ");
            String grade = scanner.nextLine().trim();
            if (!grade.isEmpty()) {
                students[index][3] = grade;
            }

            System.out.println("Student information updated successfully.");
        } else {
            System.out.println("Student with ID " + id + " not found.");
        }
    }

    /**
     * Views details of an existing student.
     * @param scanner Scanner object to read user input.
     */
    private static void viewStudentDetails(Scanner scanner) {
        System.out.println("\nViewing Student Details");
        System.out.print("Enter student ID: ");
        String id = scanner.nextLine();

        int index = findStudentIndex(id);
        if (index != -1) {
            // Display student details
            System.out.println("Student Details:");
            System.out.println("Name: " + students[index][0]);
            System.out.println("ID: " + students[index][1]);
            System.out.println("Age: " + students[index][2]);
            System.out.println("Grade: " + students[index][3]);
        } else {
            System.out.println("Student with ID " + id + " not found.");
        }
    }

    /**
     * Checks if a given student ID already exists in the system.
     * @param id The student ID to check.
     * @return True if the ID exists, false otherwise.
     */
    private static boolean isIdExists(String id) {
        for (int i = 0; i < totalStudents; i++) {
            if (students[i][1].equals(id)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Finds the index of a student in the student list based on the student ID.
     * @param id The student ID to search for.
     * @return The index of the student if found, otherwise -1.
     */
    private static int findStudentIndex(String id) {
        for (int i = 0; i < totalStudents; i++) {
            if (students[i][1].equals(id)) {
                return i;
            }
        }
        return -1;
    }
}
