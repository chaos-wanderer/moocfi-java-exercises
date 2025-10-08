import java.util.Scanner;

public class UserInterface {
    private TodoList todoList;
    private Scanner scanner;


    public UserInterface(TodoList todoList, Scanner scanner) {
        this.todoList = todoList;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            System.out.print("Command: ");
            String command = scanner.nextLine();

            if (command.equalsIgnoreCase("stop")) {
                break;
            }

            processCommand(command);
        }
    }

    private void processCommand(String command) {
        String lowerCaseCommand = command.toLowerCase();
        switch (lowerCaseCommand) {
            case "add":
                System.out.print("Task: ");
                String task = scanner.nextLine();
                this.todoList.add(task);
                break;
            case "list":
                this.todoList.print();
                break;
            case "remove":
                System.out.print("Which one is removed? ");
                int number = Integer.valueOf(scanner.nextLine());
                this.todoList.remove(number);
                break;
            case "completed":
                System.out.print("Which task was completed? ");
                int taskNumber = Integer.valueOf(scanner.nextLine());
                break;
            default: 
                System.out.println("Unknown command");
                break;
        }
    }


    
}
