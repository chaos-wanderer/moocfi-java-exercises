
import java.util.Scanner;

public class LiquidContainers {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int firstContainer = 0;
        int secondContainer = 0;




        while (true) {

            System.out.println("First: " + firstContainer + "/100");
            System.out.println("Second: " + secondContainer + "/100");

            System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);

            switch (command) {
            case "add":

                if (amount < 0) {
                    break;
                }

                if (firstContainer + amount > 100) {
                    firstContainer = 100;
                    break;
                }

                firstContainer += amount;
                break;

                // firstContainer = Math.min(100, firstContainer + amount);
                // break;
            
            case "move":

                if (amount > firstContainer) {
                    amount = firstContainer;
                }
                
                firstContainer -= amount;

                if (firstContainer < 0) {
                    firstContainer = 0;
                }

                secondContainer += amount;

                if (secondContainer > 100) {
                    secondContainer = 100;
                }
                break;

                // int moved = Math.min(amount, firstContainer)
                // firstContainer -= moved;
                // secondContainer = Math.min(100, secondContainer + moved);
                // break;
            
            case "remove":
                if (amount > secondContainer) {
                    secondContainer = 0;
                    break;
                }

                secondContainer -= amount;
                break;

                // secondContainer = Math.max(0, secondContainer - amount);
                // break;
        }

        }
    }

    // public static void processCommand(String command, int amount) {

        

    // }

}
