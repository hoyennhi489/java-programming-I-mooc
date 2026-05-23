import java.util.ArrayList;

public class Hold {

    private int maxWeight;
    private ArrayList<Suitcase> suitcases;

    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
        this.suitcases = new ArrayList<>();
    }

    public void addSuitcase(Suitcase suitcase) {

        if (totalWeight() + suitcase.totalWeight() <= this.maxWeight) {
            this.suitcases.add(suitcase);
        }
    }

    public int totalWeight() {

        int sum = 0;

        for (Suitcase suitcase : this.suitcases) {
            sum += suitcase.totalWeight();
        }

        return sum;
    }

    public void printItems() {

        for (Suitcase suitcase : this.suitcases) {
            suitcase.printItems();
        }
    }

    public String toString() {

        int count = this.suitcases.size();
        int weight = totalWeight();

        if (count == 1) {
            return "1 suitcase (" + weight + " kg)";
        }

        return count + " suitcases (" + weight + " kg)";
    }
}