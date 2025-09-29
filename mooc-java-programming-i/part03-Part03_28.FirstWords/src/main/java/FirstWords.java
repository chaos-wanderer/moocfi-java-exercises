
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String word = scanner.nextLine();

            if (word.isEmpty()) {
                break;
            }

            String[] arr = word.split(" ");

            System.out.println(arr[0]);
        }
    }
}
