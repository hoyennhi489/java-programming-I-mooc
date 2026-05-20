
public class MainProgram {

    public static void main(String[] args) {
        // Test your counter here
        Counter counter = new Counter(10);

        counter.increase();
        System.out.println(counter.value());

        counter.increase(5);
        System.out.println(counter.value());

        counter.decrease(3);
        System.out.println(counter.value());
    }
}
