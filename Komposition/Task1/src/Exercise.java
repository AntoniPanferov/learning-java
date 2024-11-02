import java.util.ArrayList;
import java.util.Iterator;

public class Exercise {
    private int id;
    private String name;
    private ArrayList<ExerciseGroup> exerciseGroups;
    private int maxExerciseGroups;

    public Exercise(int id, String name, int maxExerciseGroups) throws IllegalArgumentException{
        if (name == null) {
            throw new IllegalArgumentException();
        }
        this.id = id;
        this.name = name;
        this.maxExerciseGroups = maxExerciseGroups;

        exerciseGroups = new ArrayList<>();

        addExerciseGroup(1, "First Group");




    }


    public void output() {

    }

    public void addExerciseGroup(int id, String name) {
        exerciseGroups.add(new ExerciseGroup(id, name));
    }

    public void deleteExerciseGroup(int id) {
        ExerciseGroup deleteExerciseGroup;
        Iterator<ExerciseGroup> iterator = exerciseGroups.iterator();
        while (iterator.hasNext()) {
            deleteExerciseGroup = iterator.next();
            if (deleteExerciseGroup.getId() == id) {
                iterator.remove();
                break;
            }
        }
    }
}
