import java.util.Scanner;

public class StopAtFive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter a number:");
            int number = Integer.valueOf(scanner.nextLine());
            if (number == 5) {
                break;
            }
        }
        System.out.println("You entered 5. Stopping the program.");
    }
}
