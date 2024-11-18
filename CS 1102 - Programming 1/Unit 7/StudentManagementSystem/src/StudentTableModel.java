import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;

public class StudentTableModel extends AbstractTableModel {
    private String[] columnNames = {"ID", "Name"};
    private ArrayList<Student> students = new ArrayList<>();

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
        fireTableDataChanged();
    }

    @Override
    public int getRowCount() {
        return students.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Student student = students.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return student.getId();
            case 1:
                return student.getName();
            default:
                return null;
        }
    }
}
