import java.util.Iterator;
import java.util.LinkedList;

public class DogTeam {
    LinkedList<Dog> dogs;
    int dogsAmount = 20;
    public DogTeam() {
        for (int i = 0; i < dogsAmount; i++) {
            dogs.add(new Dog());
        }
    }

    public void barkAll() {
        for (Dog dog : dogs) {
            dog.bark();
        }
    }

    public void barkPartially() {
        int count = 0;
        for (Dog dog : dogs) {
            if (count % 2 == 0) dog.bark();
            count++;
        }
    }

    public void deletePartially() {
        Iterator<Dog> iterator = dogs.iterator();

        int count = 0;
        while (iterator.hasNext()) {
            if (count % 2 == 0) iterator.remove();
            count++;
        }
    }

    public void showParticipants() {
        for (Dog dog : dogs) {
            System.out.println(dog.getName());
        }
    }
}
