
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int oldest = 0;
        String nameOfOldest = "";
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
                nameOfOldest = name;
            }


        }

        System.out.println("Name of the oldest: " + nameOfOldest);


    }
}
