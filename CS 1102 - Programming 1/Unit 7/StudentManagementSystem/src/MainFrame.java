import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    public MainFrame() {
        setTitle("Student Management System");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new BorderLayout());
        JTabbedPane tabbedPane = new JTabbedPane();

        tabbedPane.addTab("Add Student", new AddStudentForm());
        tabbedPane.addTab("Update Student", new UpdateStudentForm());
        tabbedPane.addTab("Assign Grades", new GradeManagementPanel());
        tabbedPane.addTab("Course Enrollment", new CourseEnrollmentPanel());
        tabbedPane.addTab("View Student Details", new ViewStudentDetailsPanel());

        add(tabbedPane, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }
}
