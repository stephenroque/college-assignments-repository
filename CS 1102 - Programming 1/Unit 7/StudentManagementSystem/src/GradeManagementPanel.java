import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GradeManagementPanel extends JPanel {
    private JTextField studentIdField;
    private JTextField courseField;
    private JTextField gradeField;
    private JButton assignGradeButton;

    public GradeManagementPanel() {
        setLayout(new GridLayout(4, 2));

        studentIdField = new JTextField();
        courseField = new JTextField();
        gradeField = new JTextField();
        assignGradeButton = new JButton("Assign Grade");

        add(new JLabel("Student ID:"));
        add(studentIdField);
        add(new JLabel("Course:"));
        add(courseField);
        add(new JLabel("Grade:"));
        add(gradeField);
        add(assignGradeButton);

        assignGradeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String studentId = studentIdField.getText();
                String course = courseField.getText();
                String grade = gradeField.getText();

                if (studentId.isEmpty() || course.isEmpty() || grade.isEmpty()) {
                    JOptionPane.showMessageDialog(GradeManagementPanel.this, "All fields must be filled out");
                } else {
                    DataStore.assignGrade(studentId, course, grade);
                    JOptionPane.showMessageDialog(GradeManagementPanel.this, "Grade assigned successfully");
                    studentIdField.setText("");
                    courseField.setText("");
                    gradeField.setText("");
                }
            }
        });
    }
}
