
public class AdvancedAstrology {

    public static void printStars(int number) {
        // part 1 of the exercise

        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        for (int i = 0; i < number; i++) {
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        for (int i = size; i > 0; i--) {
            printSpaces(i - 1);	

            printStars((size - i) + 1);
        }
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise

        // prints height
        // for (int i = height; i > 0; i--) {
        //     printSpaces(i - 1);

        //     // prints odd number of stars to produce a perfect triangle stars
        //     int triangleStars = (height - i + 1) * 2 - 1;
            
        //     printStars(triangleStars);
        // }

        // // prints base
        // for (int i = 0; i < 2; i++) {
        //     printSpaces(height - 2);
        //     printStars(3);
        // }




	// BETTER + BETTER + BETTER
        for (int i = 1; i <= height; i++) {
            printSpaces(height - i);

            // prints odd number of stars to produce a perfect triangle stars
            // int triangleStars = (height - i + 1) * 2 - 1;
            int triangleStars = (i * 2) - 1;
            
            printStars(triangleStars);
        }

        // prints base
        for (int i = 0; i < 2; i++) {
            printSpaces(height - 2);
            printStars(3);
        }


    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        christmasTree(4);
    }
}
