import javax.swing.JOptionPane;

public class GUI_Basics {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter your name: ");
        JOptionPane.showMessageDialog(null, "Hello " + name);
    }
}
