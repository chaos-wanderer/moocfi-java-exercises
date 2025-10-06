
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Searching {

    public static void main(String[] args) {
        // The program below is meant for testing the search algorithms you'll write
        Scanner scanner = new Scanner(System.in);
        // ArrayList<Book> books = new ArrayList<>();
        // System.out.println("How many books to create?");
        // int numberOfBooks = Integer.valueOf(scanner.nextLine());
        // for (int i = 0; i < numberOfBooks; i++) {
        //     books.add(new Book(i, "name for the book " + i));
        // }

        // System.out.println("Id of the book to search for?");
        // int idToSearchFor = Integer.valueOf(scanner.nextLine());

        // System.out.println("");
        // System.out.println("Searching with linear search:");
        // long start = System.currentTimeMillis();
        // int linearSearchId = linearSearch(books, idToSearchFor);
        // System.out.println("The search took " + (System.currentTimeMillis() - start) + " milliseconds.");
        // if (linearSearchId < 0) {
        //     System.out.println("Book not found");
        // } else {
        //     System.out.println("Found it! " + books.get(linearSearchId));
        // }

        // System.out.println("");

        // System.out.println("");
        // System.out.println("Seaching with binary search:");
        // start = System.currentTimeMillis();
        // int binarySearchId = binarySearch(books, idToSearchFor);
        // System.out.println("The search took " + (System.currentTimeMillis() - start) + " milliseconds.");
        // if (binarySearchId < 0) {
        //     System.out.println("Book not found");
        // } else {
        //     System.out.println("Found it! " + books.get(binarySearchId));
        // }

        Book b1 = new Book(101, "The Silent Forest");
        Book b2 = new Book(205, "Shadows of Time");
        Book b3 = new Book(309, "The Last Kingdom");
        Book b4 = new Book(412, "Echoes of Eternity");
        Book b5 = new Book(518, "The Crystal Dawn");
        Book b6 = new Book(624, "Whispers in the Wind");
        Book b7 = new Book(733, "Fragments of Light");
        Book b8 = new Book(845, "The Lost Horizon");
        Book b9 = new Book(957, "Beneath the Silver Moon");
        Book b10 = new Book(1063, "Tides of Destiny");

        ArrayList<Book> books = new ArrayList<>();

        books.add(b1);
        books.add(b2);
        books.add(b3);
        books.add(b4);
        books.add(b5);
        books.add(b6);
        books.add(b7);
        books.add(b8);
        books.add(b9);
        books.add(b10);

        // Verify
        for (Book b : books) {
            System.out.println(b);
        }

        System.out.print("Id of the book to search for? ");
        int id = Integer.valueOf(scanner.nextLine());

        System.out.println("ID: " + id + " is at index " + binarySearch(books, id));

        

    }

    public static int linearSearch(ArrayList<Book> books, int searchedId) {
        for (int i = 0; i < books.size(); i++) {
            int bookId = books.get(i).getId();

            if (bookId == searchedId) {
                return i;
            }
        }
        
        return -1;
    }

    public static int binarySearch(ArrayList<Book> books, long searchedId) {
        
        // ArrayList<Book> sortedBooks = sortArray(books);

        int begin = 0;
        // int end = sortedBooks.size() - 1;
        int end = books.size() - 1;

        while (begin <= end) {
            int middle = (end + begin) / 2;
            int i = middle;

            // int bookId = sortedBooks.get(i).getId();
            int bookId = books.get(i).getId();

            if (bookId == searchedId) {
                return i;
            }

            // if left-side indices are elminated
            if (bookId < searchedId) {
                begin = i + 1;

            // if right-side indices are eliminated
            } else if (bookId > searchedId) {
                end = i - 1;
            }

        }

        return -1;
    }

    // public static ArrayList<Book> sortArray(ArrayList<Book> books) {
    //     int smallestId = books.get(0).getId();
        
    //     for (int i = 0; i < books.size(); i++) {
    //         int bookId = books.get(i).getId();

    //         if (smallestId > bookId) {
    //             smallestId = bookId;
    //         }
    //     }

    //     return books;

    // }
}

