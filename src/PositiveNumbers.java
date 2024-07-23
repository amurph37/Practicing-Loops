import java.util.Scanner;

public class PositiveNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter a number:");
            int number = Integer.valueOf(scanner.nextLine());
            if (number == 0) {
                break;
            } else if (number < 0) {
                System.out.println("Your number must be positive.");
            } else {
                System.out.println("You entered: " + number);
            }
        }
        System.out.println("Program ended.");
    }
}
