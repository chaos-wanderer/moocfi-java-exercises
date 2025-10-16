
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // toteuta ohjelmasi tänne


        List<String> list = new ArrayList<>();
        System.out.println("Input numbers, type \"end\" to stop");
        while (true) {
            
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }

            list.add(input);
        }

        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String answer = scanner.nextLine();

        if (answer.equals("n")) {
            double avgOfNegNumbers = list.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .filter(n -> n < 0)
                .average()
                .getAsDouble();

            System.out.println("Average of the negative numbers: "+ avgOfNegNumbers);
        } else if (answer.equals("p")) {
            double avgOfPosNumbers = list.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .filter(n -> n > 0)
                .average()
                .getAsDouble();
            
            System.out.println("Average of the positive numbers: " + avgOfPosNumbers);
        } else {
            System.out.println("Invalid input.");
        }
    }
}
