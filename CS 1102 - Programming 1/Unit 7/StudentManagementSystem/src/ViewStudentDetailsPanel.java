import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class ViewStudentDetailsPanel extends JPanel {
    private JTable studentTable;
    private StudentTableModel studentTableModel;

    public ViewStudentDetailsPanel() {
        setLayout(new BorderLayout());

        studentTableModel = new StudentTableModel();
        studentTable = new JTable(studentTableModel);

        JScrollPane scrollPane = new JScrollPane(studentTable);
        add(scrollPane, BorderLayout.CENTER);

        // Load students into the table model
        loadStudents();
    }

    private void loadStudents() {
        ArrayList<Student> students = new ArrayList<>(DataStore.studentMap.values());
        studentTableModel.setStudents(students);
    }
}
