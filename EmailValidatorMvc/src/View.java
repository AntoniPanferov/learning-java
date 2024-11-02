import javax.swing.*;
import java.awt.*;

public class View {
    private Controller controller;
    private final String title = "Email Validator";
    private final JFrame frmMain = new JFrame();
    private final Dimension frameSize = new Dimension(600, 200);
    private final JTextField txtInput = new JTextField(20);
    private final JLabel lblStatus = new JLabel();

    public View() {
        createFrame();
        createGui();
    }

    private void createGui() {
        frmMain.add(createTopPanel(), BorderLayout.NORTH);
        frmMain.add(createBottomPanel());
        frmMain.setVisible(true);
    }

    private JPanel createTopPanel() {
        JButton btnSave = new JButton("Save");
        btnSave.addActionListener(e -> saveButtonClicked());

        JPanel panel = new JPanel();
        panel.add(new JLabel("Email:"));
        panel.add(txtInput);
        panel.add(btnSave);
        return panel;
    }

    private JPanel createBottomPanel() {
        JPanel panel = new JPanel();
        panel.add(new JLabel("Status:"));
        panel.add(lblStatus);
        return panel;
    }

    private void createFrame() {
        frmMain.setTitle(title);
        frmMain.setSize(frameSize);
        frmMain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frmMain.setLocationRelativeTo(null);
    }

    public void setController(Controller controller) {
        this.controller = controller;
    }

    public void saveButtonClicked() {

    }

    public void showError(String message) {

    }

    public void showSuccess(String message) {

    }

    public void hideMessageBox() {

    }
}
