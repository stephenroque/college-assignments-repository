import javax.swing.*;
import java.awt.*;

public class ErrorHandlingUtility {
    public static void showErrorDialog(Component parent, String message) {
        JOptionPane.showMessageDialog(parent, message, "Error", JOptionPane.ERROR_MESSAGE);
    }
}
