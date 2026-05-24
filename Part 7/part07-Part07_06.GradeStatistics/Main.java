import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sumAll = 0;
        int countAll = 0;

        int sumPassing = 0;
        int countPassing = 0;

        int grade5 = 0;
        int grade4 = 0;
        int grade3 = 0;
        int grade2 = 0;
        int grade1 = 0;
        int grade0 = 0;

        System.out.println("Enter point totals, -1 stops:");

        while (true) {
            int points = Integer.valueOf(scanner.nextLine());

            if (points == -1) {
                break;
            }

            if (points < 0 || points > 100) {
                continue;
            }

            sumAll += points;
            countAll++;

            if (points >= 50) {
                sumPassing += points;
                countPassing++;
            }

            if (points < 50) {
                grade0++;
            } else if (points < 60) {
                grade1++;
            } else if (points < 70) {
                grade2++;
            } else if (points < 80) {
                grade3++;
            } else if (points < 90) {
                grade4++;
            } else {
                grade5++;
            }
        }

        System.out.println("Point average (all): " + (1.0 * sumAll / countAll));

        if (countPassing == 0) {
            System.out.println("Point average (passing): -");
        } else {
            System.out.println("Point average (passing): " + (1.0 * sumPassing / countPassing));
        }

        System.out.println("Pass percentage: " + (100.0 * countPassing / countAll));

        System.out.println("Grade distribution:");
        printStars(5, grade5);
        printStars(4, grade4);
        printStars(3, grade3);
        printStars(2, grade2);
        printStars(1, grade1);
        printStars(0, grade0);
    }

    public static void printStars(int grade, int count) {
        System.out.print(grade + ": ");

        for (int i = 0; i < count; i++) {
            System.out.print("*");
        }

        System.out.println("");
    }
}