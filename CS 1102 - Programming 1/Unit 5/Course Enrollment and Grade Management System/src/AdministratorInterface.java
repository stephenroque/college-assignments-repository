import java.util.Scanner;

/**
 * Provides a command-line interface for administrators to interact with the
 * system.
 */
public class AdministratorInterface {
    private static Scanner scanner = new Scanner(System.in);

    /**
     * Main method to run the administrator interface.
     * 
     * @param args command line arguments
     */
    public static void main(String[] args) {
        while (true) {
            displayMenu();
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    addNewCourse();
                    break;
                case 2:
                    enrollStudentInCourse();
                    break;
                case 3:
                    assignGradeToStudent();
                    break;
                case 4:
                    calculateStudentOverallGrade();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    /**
     * Displays the main menu options.
     */
    private static void displayMenu() {
        System.out.println("\nCourse Enrollment and Grade Management System");
        System.out.println("1. Add a new course");
        System.out.println("2. Enroll a student in a course");
        System.out.println("3. Assign a grade to a student");
        System.out.println("4. Calculate overall course grade for a student");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
    }

    /**
     * Prompts the administrator to add a new course.
     */
    private static void addNewCourse() {
        System.out.print("Enter course code: ");
        String courseCode = scanner.nextLine();
        System.out.print("Enter course name: ");
        String name = scanner.nextLine();
        System.out.print("Enter maximum capacity: ");
        int maxCapacity = scanner.nextInt();
        scanner.nextLine(); // consume newline

        CourseManagement.addCourse(courseCode, name, maxCapacity);
        System.out.println("Course added successfully.");
    }

    /**
     * Prompts the administrator to enroll a student in a course.
     */
    private static void enrollStudentInCourse() {
        System.out.print("Enter student name: ");
        String studentName = scanner.nextLine();
        System.out.print("Enter student ID: ");
        String studentId = scanner.nextLine();

        Student student = new Student(studentName, studentId);
        CourseManagement.addStudent(student);

        System.out.print("Enter course code to enroll in: ");
        String courseCode = scanner.nextLine();

        Course course = findCourseByCode(courseCode);
        if (course != null) {
            CourseManagement.enrollStudent(student, course);
            System.out.println("Student enrolled successfully.");
        } else {
            System.out.println("Course not found.");
        }
    }

    /**
     * Prompts the administrator to assign a grade to a student for a course.
     */
    private static void assignGradeToStudent() {
        System.out.print("Enter student ID: ");
        String studentId = scanner.nextLine();
        Student student = findStudentById(studentId);

        if (student != null) {
            System.out.print("Enter course code: ");
            String courseCode = scanner.nextLine();
            Course course = findCourseByCode(courseCode);

            if (course != null) {
                System.out.print("Enter grade: ");
                double grade = scanner.nextDouble();
                scanner.nextLine(); // consume newline

                CourseManagement.assignGrade(student, course, grade);
                System.out.println("Grade assigned successfully.");
            } else {
                System.out.println("Course not found.");
            }
        } else {
            System.out.println("Student not found.");
        }
    }

    /**
     * Prompts the administrator to calculate the overall grade for a student.
     */
    private static void calculateStudentOverallGrade() {
        System.out.print("Enter student ID: ");
        String studentId = scanner.nextLine();
        Student student = findStudentById(studentId);

        if (student != null) {
            double overallGrade = CourseManagement.calculateOverallGrade(student);
            System.out.println("Overall grade for student " + student.getName() + ": " + overallGrade);
        } else {
            System.out.println("Student not found.");
        }
    }

    /**
     * Finds a course by its code.
     * 
     * @param courseCode the course code
     * @return the course, or null if not found
     */
    private static Course findCourseByCode(String courseCode) {
        for (Course course : CourseManagement.getCourses()) {
            if (course.getCourseCode().equals(courseCode)) {
                return course;
            }
        }
        return null;
    }

    /**
     * Finds a student by their ID.
     * 
     * @param studentId the student ID
     * @return the student, or null if not found
     */
    private static Student findStudentById(String studentId) {
        for (Student student : CourseManagement.getStudents()) {
            if (student.getId().equals(studentId)) {
                return student;
            }
        }
        return null;
    }
}
