import java.util.HashMap;

public class DataStore {
    public static HashMap<String, Student> studentMap = new HashMap<>();
    public static HashMap<String, HashMap<String, String>> grades = new HashMap<>(); // studentID -> (course -> grade)

    public static void addStudent(Student student) {
        studentMap.put(student.getId(), student);
    }

    public static Student getStudent(String id) {
        return studentMap.get(id);
    }

    public static void assignGrade(String studentId, String course, String grade) {
        grades.computeIfAbsent(studentId, k -> new HashMap<>()).put(course, grade);
    }

    public static HashMap<String, String> getGrades(String studentId) {
        return grades.getOrDefault(studentId, new HashMap<>());
    }
}
