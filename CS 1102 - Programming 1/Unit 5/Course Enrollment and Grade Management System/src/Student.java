import java.util.HashMap;
import java.util.Map;

/**
 * Represents a student and manages their enrollment in courses and grades.
 */
public class Student {
    private String name;
    private String id;
    private Map<Course, Double> enrolledCourses;

    /**
     * Constructs a Student with the specified name and ID.
     * 
     * @param name the student's name
     * @param id   the student's ID
     */
    public Student(String name, String id) {
        this.name = name;
        this.id = id;
        this.enrolledCourses = new HashMap<>();
    }

    /**
     * Returns the student's name.
     * 
     * @return the student's name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the student's name.
     * 
     * @param name the new name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns the student's ID.
     * 
     * @return the student's ID
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the student's ID.
     * 
     * @param id the new ID
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Enrolls the student in the specified course if capacity allows.
     * 
     * @param course the course to enroll in
     */
    public void enrollInCourse(Course course) {
        if (!enrolledCourses.containsKey(course) && course.getEnrolledStudents() < course.getMaxCapacity()) {
            enrolledCourses.put(course, -1.0); // Using -1.0 to represent an unassigned grade
            course.incrementEnrolledStudents();
        } else {
            System.out.println("Cannot enroll in course: " + course.getName());
        }
    }

    /**
     * Assigns a grade to the student for the specified course.
     * 
     * @param course the course
     * @param grade  the grade to assign
     */
    public void assignGrade(Course course, double grade) {
        if (enrolledCourses.containsKey(course)) {
            enrolledCourses.put(course, grade);
        } else {
            System.out.println("Student is not enrolled in course: " + course.getName());
        }
    }

    /**
     * Returns the map of courses and grades the student is enrolled in.
     * 
     * @return the map of courses and grades
     */
    public Map<Course, Double> getEnrolledCourses() {
        return enrolledCourses;
    }
}
