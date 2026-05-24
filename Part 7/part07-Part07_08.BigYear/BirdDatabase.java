import java.util.ArrayList;

public class BirdDatabase {

    private ArrayList<Bird> birds;

    public BirdDatabase() {
        this.birds = new ArrayList<>();
    }

    public void add(String name, String latinName) {
        this.birds.add(new Bird(name, latinName));
    }

    public Bird findBird(String name) {
        for (Bird bird : this.birds) {
            if (bird.getName().equals(name)) {
                return bird;
            }
        }

        return null;
    }

    public void addObservation(String name) {
        Bird bird = findBird(name);

        if (bird == null) {
            System.out.println("Not a bird!");
            return;
        }

        bird.addObservation();
    }

    public void printAll() {
        for (Bird bird : this.birds) {
            System.out.println(bird);
        }
    }

    public void printOne(String name) {
        Bird bird = findBird(name);

        if (bird != null) {
            System.out.println(bird);
        }
    }
}