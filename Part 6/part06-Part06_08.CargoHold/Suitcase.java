import java.util.ArrayList;

public class Suitcase {

    private int maxWeight;
    private ArrayList<Item> items;

    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {

        if (totalWeight() + item.getWeight() <= this.maxWeight) {
            this.items.add(item);
        }
    }

    public int totalWeight() {

        int sum = 0;

        for (Item item : this.items) {
            sum += item.getWeight();
        }

        return sum;
    }

    public void printItems() {

        for (Item item : this.items) {
            System.out.println(item);
        }
    }

    public Item heaviestItem() {

        if (this.items.isEmpty()) {
            return null;
        }

        Item heaviest = this.items.get(0);

        for (Item item : this.items) {

            if (item.getWeight() > heaviest.getWeight()) {
                heaviest = item;
            }
        }

        return heaviest;
    }

    public String toString() {

        int count = this.items.size();
        int weight = totalWeight();

        if (count == 0) {
            return "no items (" + weight + " kg)";
        }

        if (count == 1) {
            return "1 item (" + weight + " kg)";
        }

        return count + " items (" + weight + " kg)";
    }
}