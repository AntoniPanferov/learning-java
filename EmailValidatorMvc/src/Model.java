import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Model {
    private String eMail;
    private final String fileName = "emails.txt";
    private final String eMailRegex = "[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+";

    public String getEMail() {
        return eMail;
    }

    public void setEMail(String eMail) throws IOException {
        if (eMail.matches(eMailRegex)) {
            this.eMail = eMail;
        } else {
            throw new IOException("E-Mail is invalid.");
        }
    }

    public void save() {
        try {
            FileWriter writer = new FileWriter(new File(System.getProperty("user.dir"), fileName), true);
            writer.write(String.format("%s\n", eMail));
            writer.close();
        } catch (IOException e) {
            System.out.println("Unable to write to the file.");
        }
    }
}
