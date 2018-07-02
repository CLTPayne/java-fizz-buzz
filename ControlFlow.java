import java.util.Scanner;

public class ControlFlow {
    public static void main(String[] args) {
        System.out.println("Enter your name: ");
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();
        System.out.println("Your name is " + username);
        System.out.println("Enter your favourite number: ");
        String number = scanner.nextLine();
        System.out.println("Your favourite number is " + number);
        if (Integer.parseInt(number) % 3 == 0) {
            System.out.println(number + " is divisible by 3");
        }
        else if (Integer.parseInt(number) % 2 == 0) {
            System.out.println(number + " is an even number");
        }
    }
}
