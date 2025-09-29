
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        // int charCount = 0;

        // int sum = 0;
        // int count = 0;

        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> birthYears = new ArrayList<>();



        while (true) {
            String word = scanner.nextLine();

            if (word.isEmpty()) {
                break;
            }
            
            String[] arr = word.split(",");

            names.add(arr[0]);
            birthYears.add(Integer.valueOf(arr[1]));


            
        }

        String longestName = names.get(0);

        for (String n : names) {
            if (n.length() > longestName.length()) {
                    longestName = n;
            }
        }

        System.out.println("Longest name: " + longestName);

        int sum = 0;
        for (int b : birthYears) {
            sum+= b;
        }

        double avgOfBirthYears = (1.0 * sum / birthYears.size());
        System.out.println("Average of the birth years: " + avgOfBirthYears);


    }
}
