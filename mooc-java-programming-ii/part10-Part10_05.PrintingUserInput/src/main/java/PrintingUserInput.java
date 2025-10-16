
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrintingUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> list = new ArrayList<>();
        System.out.println("Input numbers, type \"end\" to stop");
        while (true) {
            
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            list.add(input);
        }

        String allInput = list.stream()
            .reduce("", (previousStr, value) -> previousStr + value + "\n");
        System.out.println(allInput);

    }
}
