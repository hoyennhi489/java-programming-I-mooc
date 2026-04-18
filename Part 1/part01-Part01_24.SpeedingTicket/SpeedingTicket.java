
import java.util.Scanner;

public class SpeedingTicket {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give speen: ");
        int number = Integer.valueOf(scanner.nextLine());

        if(number > 120){
            System.out.println("Speeding ticket!");
        }
    }
}
