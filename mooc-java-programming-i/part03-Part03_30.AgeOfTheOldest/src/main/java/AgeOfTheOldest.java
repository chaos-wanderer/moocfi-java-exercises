
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int oldest = 0;
        while (true) {
            String word = scanner.nextLine();

            if (word.isEmpty()) {
                break;
            }
            
            String[] arr = word.split(",");

            String name = arr[0];
            int age = Integer.valueOf(arr[1]);

            if (age > oldest) {
                oldest = age;
            }


        }

        System.out.println("Age of the oldest: " + oldest);


    }
}
