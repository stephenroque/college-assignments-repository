import javax.swing.*;
import java.awt.*;

public class StudentManagementPanel extends JPanel {
    public StudentManagementPanel() {
        setLayout(new BorderLayout());
        StudentTableModel studentTableModel = new StudentTableModel();
        AddStudentForm addStudentForm = new AddStudentForm();

        add(addStudentForm, BorderLayout.NORTH);
        add(new JScrollPane(new JTable(studentTableModel)), BorderLayout.CENTER);
    }
}
