import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        int[] array = {3, 1, 5, 99, 3, 12};
        sort(array);
        System.out.println(Arrays.toString(array));

        String[] words = {"banana", "apple", "carrot"};
        sort(words);
        System.out.println(Arrays.toString(words));

        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(5);
        integers.add(2);
        integers.add(9);

        sortIntegers(integers);
        System.out.println(integers);

        ArrayList<String> strings = new ArrayList<>();
        strings.add("zebra");
        strings.add("apple");
        strings.add("monkey");

        sortStrings(strings);
        System.out.println(strings);
    }

    public static void sort(int[] array) {
        Arrays.sort(array);
    }

    public static void sort(String[] array) {
        Arrays.sort(array);
    }

    public static void sortIntegers(ArrayList<Integer> integers) {
        Collections.sort(integers);
    }

    public static void sortStrings(ArrayList<String> strings) {
        Collections.sort(strings);
    }
}