import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingAFile {

    public static void main(String[] args) throws Exception {

        Scanner fileScanner = new Scanner(Paths.get("data.txt"));

        while (fileScanner.hasNextLine()) {
            System.out.println(fileScanner.nextLine());
        }
    }
}