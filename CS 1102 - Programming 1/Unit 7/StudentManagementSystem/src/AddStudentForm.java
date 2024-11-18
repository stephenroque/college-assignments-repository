import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddStudentForm extends JPanel {
    private JTextField idField;
    private JTextField nameField;
    private JButton addButton;

    public AddStudentForm() {
        setLayout(new GridLayout(3, 2));

        idField = new JTextField();
        nameField = new JTextField();
        addButton = new JButton("Add Student");

        add(new JLabel("Student ID:"));
        add(idField);
        add(new JLabel("Name:"));
        add(nameField);
        add(addButton);

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String id = idField.getText();
                String name = nameField.getText();

                if (id.isEmpty() || name.isEmpty()) {
                    JOptionPane.showMessageDialog(AddStudentForm.this, "All fields must be filled out");
                } else {
                    Student student = new Student(id, name);
                    DataStore.addStudent(student);
                    JOptionPane.showMessageDialog(AddStudentForm.this, "Student added successfully");
                    idField.setText("");
                    nameField.setText("");
                }
            }
        });
    }
}
