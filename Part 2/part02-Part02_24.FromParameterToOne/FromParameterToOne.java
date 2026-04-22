import java.util.Scanner;

public class FromParameterToOne {

    public static void main(String[] args) {
        printFromNumberToOne(5);
    }

    public static void printFromNumberToOne(int num){
        int i = num;

        while (i >= 1) {
            System.out.println(i);
            i--;
        }
    }
}
