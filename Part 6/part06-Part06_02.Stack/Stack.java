import java.util.ArrayList;

public class Stack {

    private ArrayList<String> values;

    public Stack() {
        this.values = new ArrayList<>();
    }

    public boolean isEmpty() {
        return this.values.isEmpty();
    }

    public void add(String value) {
        this.values.add(value);
    }

    public ArrayList<String> values() {
        return this.values;
    }

    public String take() {

        int lastIndex = this.values.size() - 1;

        String value = this.values.get(lastIndex);

        this.values.remove(lastIndex);

        return value;
    }
}