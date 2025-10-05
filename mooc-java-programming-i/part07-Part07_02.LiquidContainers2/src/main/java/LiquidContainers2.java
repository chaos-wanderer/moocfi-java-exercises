
import java.util.Scanner;

public class LiquidContainers2 {
    static Container firstContainer = new Container();
    static Container secondContainer = new Container();
    

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        



        while (true) {
            System.out.println("First: " + firstContainer);
            System.out.println("Second: " + secondContainer);
            System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);

            processCommand(command, amount);

        }
    }

    private static void processCommand(String command, int amount) {
        switch (command) {
            case "add":
                firstContainer.add(amount);
                break;
            case "move":
                firstContainer.move(amount, secondContainer);
                break;
            case "remove":
                secondContainer.remove(amount);
                break;
            default:
                System.out.println("Unknown command");
                break;
        }
    }

}
