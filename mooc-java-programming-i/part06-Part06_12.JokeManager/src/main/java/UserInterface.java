import java.util.Scanner;
import java.util.ArrayList;

public class UserInterface {
    private Scanner scanner;
    private JokeManager jokeManager;

    public UserInterface(JokeManager jokeManager, Scanner scanner) {
        this.scanner = scanner;
        this.jokeManager = jokeManager;
    }

    public void start() {
        readCommands();

    }

    public void readCommands() {

        while (true) {
            System.out.println("Commands:");
            System.out.println("1 - add a joke");
            System.out.println("2 - draw a joke");
            System.out.println("3 - list jokes");
            System.out.println("X - stop");
            
            String command = scanner.nextLine();

            if (command.equalsIgnoreCase("x")) {
                break;
            }

            processCommand(command);

        }

    }

    private void processCommand(String command) {
        switch (command) {

            case "1":
                System.out.println("Write the joke to be added:");
                String joke = scanner.nextLine();
                this.jokeManager.addJoke(joke);
                break;

            case "2":
                System.out.println(this.jokeManager.drawJoke());
                break;
            
            case "3":
                System.out.println("Printing the jokes.");
                this.jokeManager.printJokes();

        }
    }

    
    /*
    private void printJokes() {
        
        ArrayList<String> jokeList = this.jokeManager.getJokes();

        for (String j : jokeList) {
            System.out.println(j);
        }

    }
    */
    

}
