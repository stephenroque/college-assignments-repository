/**
 * Represents a course and manages enrollment capacity.
 */
public class Course {
    private String courseCode;
    private String name;
    private int maxCapacity;
    private int enrolledStudents;

    private static int totalEnrolledStudents = 0;

    /**
     * Constructs a Course with the specified details.
     * 
     * @param courseCode  the course code
     * @param name        the course name
     * @param maxCapacity the maximum capacity
     */
    public Course(String courseCode, String name, int maxCapacity) {
        this.courseCode = courseCode;
        this.name = name;
        this.maxCapacity = maxCapacity;
        this.enrolledStudents = 0;
    }

    /**
     * Returns the course code.
     * 
     * @return the course code
     */
    public String getCourseCode() {
        return courseCode;
    }

    /**
     * Returns the course name.
     * 
     * @return the course name
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the maximum capacity of the course.
     * 
     * @return the maximum capacity
     */
    public int getMaxCapacity() {
        return maxCapacity;
    }

    /**
     * Returns the current number of enrolled students.
     * 
     * @return the current number of enrolled students
     */
    public int getEnrolledStudents() {
        return enrolledStudents;
    }

    /**
     * Increments the count of enrolled students if capacity allows.
     */
    public void incrementEnrolledStudents() {
        if (enrolledStudents < maxCapacity) {
            enrolledStudents++;
            totalEnrolledStudents++;
        }
    }

    /**
     * Returns the total number of students enrolled in all courses.
     * 
     * @return the total number of enrolled students
     */
    public static int getTotalEnrolledStudents() {
        return totalEnrolledStudents;
    }
}
