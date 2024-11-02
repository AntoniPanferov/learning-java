import java.util.ArrayList;

public class ExerciseGroup {
    private int id;
    private String name;

    public ExerciseGroup(int id, String name) throws IllegalArgumentException {
        if (name == null) {
            throw new IllegalArgumentException();
        }
        this.id = id;
        this.name = name;
    }

    public void output() {

    }
    public int getId() {
        return this.id;
    }
}
