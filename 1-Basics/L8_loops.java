import java.util.Scanner;

public class L8_loops {

    public static void main(String[] args) {

        // ! while loop = executes a block of code as long as a it's condition remains
        // true

        Scanner scanner = new Scanner(System.in);
        String name = "";

        while (name.isBlank()) {
            System.out.print("Enter your name: ");
            name = scanner.nextLine();
        }

        System.out.println("Hello " + name);

        // !for loop
        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
        }
        System.out.println("Happy new year!");

    }
}