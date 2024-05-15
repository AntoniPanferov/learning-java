import java.util.Random;
public class Dog {
    String name;

    public Dog() {
        String[] names = {"Bello", "Spike", "Doggy", "Wuffi", "Lassy", "Rocky", "Luna"};
        Random random = new Random();
        name = names[random.nextInt(names.length)];
    }

    public void bark() {
        System.out.println(String.format("Wuff, i am %s", name));
    }

    public String getName() {
        return name;
    }

}
