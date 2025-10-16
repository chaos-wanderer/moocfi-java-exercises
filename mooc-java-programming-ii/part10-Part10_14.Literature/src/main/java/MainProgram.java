
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Book> books = new ArrayList<>();

        // String input = "The Ringing Lullaby Book\n" + "0\n" +
        //     "The Exiting Transportation Vehicles\n" + "0\n" +
        //     "The Snowy Forest Calls\n" + "12\n" +
        //     "Litmanen 10\n" + "10\n" + "\n";

        // Scanner scan = new Scanner(input);

        while (true) {
            System.out.println("Input the name of the book, empty stops: ");
            String bookName = scanner.nextLine();

            if (bookName.isEmpty()) {
                break;
            }

            System.out.println("Input the age recommendation");
            int ageRecommendation = Integer.valueOf(scanner.nextLine());

            System.out.println();

            books.add(new Book(bookName, ageRecommendation));

        }
        
        System.out.println(books.size() + " books in total.\n");

        
        Comparator<Book> comparator = Comparator
                    .comparing(Book::getAgeRecommendation)
                    .thenComparing(Book::getName);

        Collections.sort(books, comparator);

        books.forEach(System.out::println);
    }



}
