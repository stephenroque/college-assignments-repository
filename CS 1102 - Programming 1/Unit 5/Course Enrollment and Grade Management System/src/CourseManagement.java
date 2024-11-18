import java.util.ArrayList;
import java.util.List;

/**
 * Manages the list of courses and students, and provides methods to add courses,
 * enroll students, assign grades, and calculate overall grades.
 */
public class CourseManagement {
    private static List<Course> courses = new ArrayList<>();
    private static List<Student> students = new ArrayList<>();

    /**
     * Adds a new course to the list.
     * 
     * @param courseCode  the course code
     * @param name        the course name
     * @param maxCapacity the maximum capacity
     */
    public static void addCourse(String courseCode, String name, int maxCapacity) {
        courses.add(new Course(courseCode, name, maxCapacity));
    }

    /**
     * Enrolls a student in a course.
     * 
     * @param student the student
     * @param course  the course
     */
    public static void enrollStudent(Student student, Course course) {
        student.enrollInCourse(course);
    }

    /**
     * Assigns a grade to a student for a specific course.
     * 
     * @param student the student
     * @param course  the course
     * @param grade   the grade
     */
    public static void assignGrade(Student student, Course course, double grade) {
        student.assignGrade(course, grade);
    }

    /**
     * Calculates and returns the overall grade for a student.
     * 
     * @param student the student
     * @return the overall grade
     */
    public static double calculateOverallGrade(Student student) {
        double totalGrades = 0;
        int count = 0;
        for (double grade : student.getEnrolledCourses().values()) {
            if (grade != -1) { // Check if the grade is not unassigned
                totalGrades += grade;
                count++;
            }
        }
        return count == 0 ? 0 : totalGrades / count;
    }

    /**
     * Returns the list of courses.
     * 
     * @return the list of courses
     */
    public static List<Course> getCourses() {
        return courses;
    }

    /**
     * Returns the list of students.
     * 
     * @return the list of students
     */
    public static List<Student> getStudents() {
        return students;
    }

    /**
     * Adds a student to the list.
     * 
     * @param student the student
     */
    public static void addStudent(Student student) {
        students.add(student);
    }
}
