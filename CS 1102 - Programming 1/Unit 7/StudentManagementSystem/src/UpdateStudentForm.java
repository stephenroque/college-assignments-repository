import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UpdateStudentForm extends JPanel {
    private JTextField idField;
    private JTextField nameField;
    private JButton updateButton;

    public UpdateStudentForm() {
        setLayout(new GridLayout(3, 2));

        idField = new JTextField();
        nameField = new JTextField();
        updateButton = new JButton("Update Student");

        add(new JLabel("Student ID:"));
        add(idField);
        add(new JLabel("Name:"));
        add(nameField);
        add(updateButton);

        updateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String id = idField.getText();
                String name = nameField.getText();

                if (id.isEmpty() || name.isEmpty()) {
                    JOptionPane.showMessageDialog(UpdateStudentForm.this, "All fields must be filled out");
                } else {
                    Student student = DataStore.getStudent(id);
                    if (student != null) {
                        student.setName(name);
                        JOptionPane.showMessageDialog(UpdateStudentForm.this, "Student updated successfully");
                        idField.setText("");
                        nameField.setText("");
                    } else {
                        JOptionPane.showMessageDialog(UpdateStudentForm.this, "Student not found");
                    }
                }
            }
        });
    }
}
