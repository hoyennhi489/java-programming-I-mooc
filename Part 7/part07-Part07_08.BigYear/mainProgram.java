import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        BirdDatabase database = new BirdDatabase();

        while (true) {
            System.out.print("? ");
            String command = scan.nextLine();

            if (command.equals("Quit")) {
                break;
            }

            if (command.equals("Add")) {
                System.out.print("Name: ");
                String name = scan.nextLine();

                System.out.print("Name in Latin: ");
                String latinName = scan.nextLine();

                database.add(name, latinName);

            } else if (command.equals("Observation")) {
                System.out.print("Bird? ");
                String name = scan.nextLine();

                database.addObservation(name);

            } else if (command.equals("All")) {
                database.printAll();

            } else if (command.equals("One")) {
                System.out.print("Bird? ");
                String name = scan.nextLine();

                database.printOne(name);
            }
        }
    }
}