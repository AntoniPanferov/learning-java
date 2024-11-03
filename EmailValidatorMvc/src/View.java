import javax.swing.*;
import java.awt.*;

public class View {
    private Controller controller;
    private final String title = "Email Validator";
    private final JFrame frmMain = new JFrame();
    private final Dimension frameSize = new Dimension(600, 200);
    private final JTextField txtInput = new JTextField(20);
    private final JLabel lblStatus = new JLabel();
    private final int statusDelay = 3000;
    private final Color red = new Color(208, 64, 64);
    private final Color green = new Color(64, 208, 64);

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
        controller.save(txtInput.getText());
    }

    public void showError(String message) {
        lblStatus.setForeground(red);
        updateStatus(message);
    }

    public void showSuccess(String message) {
        lblStatus.setForeground(green);
        updateStatus(message);
    }

    private void updateStatus(String message) {
        lblStatus.setText(message);
        Timer timer = new Timer(statusDelay, e -> hideMessageBox());
        timer.setRepeats(false);
        timer.start();
    }

    public void hideMessageBox() {
        lblStatus.setText("");
    }
}
