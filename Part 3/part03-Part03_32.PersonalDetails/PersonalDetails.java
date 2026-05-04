
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> years = new ArrayList<>();

        while(true){
            String input = scanner.nextLine();

            if (input.equals("")) {
                break;
            }

            String[] parts = input.split(",");
            String name = parts[0];
            int year = Integer.valueOf(parts[1]);
            names.add(name);
            years.add(year);
        }

        String longestName = names.get(0);
        for (String name : names) {
            if (name.length() > longestName.length()) {
                longestName = name;
            }
        }

        int sum = 0;
        for (int year : years) {
            sum += year;
        }

        double average = (double) sum / years.size();

        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + average);
    }
}
