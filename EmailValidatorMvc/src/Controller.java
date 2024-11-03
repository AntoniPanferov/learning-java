import java.io.IOException;

public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void save(String eMail) {
        try {
            model.setEMail(eMail);
            model.save();
            view.showSuccess("E-Mail was successfully saved.");
        } catch (IOException e) {
            view.showError("E-Mail was not saved.");
        }
    }
}
