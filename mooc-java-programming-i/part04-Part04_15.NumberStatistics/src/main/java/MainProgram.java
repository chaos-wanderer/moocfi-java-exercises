
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Statistics statistics = new Statistics();
        Statistics statistics1 = new Statistics();
        Statistics statistics2 = new Statistics();
        
        System.out.println("Enter numbers:");
        
        while (true) {
            int num = Integer.valueOf(scanner.nextLine());
            if (num == -1) {
                break;
            }

            statistics.addNumber(num);

            if (num % 2 == 0) {
                statistics1.addNumber(num);
            } else {
                statistics2.addNumber(num);
            }
        }

        System.out.println("Sum: " + statistics.sum());
        System.out.println("Sum of even numbers: " + statistics1.sum());
        System.out.println("Sum of odd numbers: " + statistics2.sum());
    }
}
