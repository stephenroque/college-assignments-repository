import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CourseEnrollmentPanel extends JPanel {
    private JTextField studentIdField;
    private JTextField courseField;
    private JButton enrollButton;

    public CourseEnrollmentPanel() {
        setLayout(new GridLayout(3, 2));

        studentIdField = new JTextField();
        courseField = new JTextField();
        enrollButton = new JButton("Enroll Student");

        add(new JLabel("Student ID:"));
        add(studentIdField);
        add(new JLabel("Course:"));
        add(courseField);
        add(enrollButton);

        enrollButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String studentId = studentIdField.getText();
                String course = courseField.getText();

                if (studentId.isEmpty() || course.isEmpty()) {
                    JOptionPane.showMessageDialog(CourseEnrollmentPanel.this, "All fields must be filled out");
                } else {
                    Student student = DataStore.getStudent(studentId);
                    if (student != null) {
                        DataStore.assignGrade(studentId, course, "Not Graded");
                        JOptionPane.showMessageDialog(CourseEnrollmentPanel.this, "Student enrolled in course successfully");
                        studentIdField.setText("");
                        courseField.setText("");
                    } else {
                        JOptionPane.showMessageDialog(CourseEnrollmentPanel.this, "Student not found");
                    }
                }
            }
        });
    }
}
