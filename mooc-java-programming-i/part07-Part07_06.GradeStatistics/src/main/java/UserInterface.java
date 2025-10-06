import java.util.Scanner;

public class UserInterface {
    private PointRegister pointRegister;
    private Scanner scanner;

    public UserInterface(PointRegister pointRegister, Scanner scanner) {
        this.pointRegister = pointRegister;
        this.scanner = scanner;
    }

    

    public void start() {
        readCommand();
        printPointsStatistics();
    }

    private void readCommand() {
        System.out.println("Enter point totals, -1 stops:");
        while (true) {
            int num = Integer.valueOf(scanner.nextLine());
            if (num == -1) {
                break;
            }

            if (num < 0 || num > 100) {
                continue;
            }

            this.pointRegister.addPoint(num);
        }
    }

    public void printPointsStatistics() {
        System.out.println("Point average (all): " + pointRegister.averageOfPoints());

        double passingAvg = pointRegister.averageOfPassingPoints();
        System.out.println("Point average (passing): " + (passingAvg == -1 ? "-" : passingAvg));

        System.out.println("Pass percentage: " + pointRegister.passPercentage());

        System.out.println("Grade distribution:");
        System.out.println("5: " + printStars(pointRegister.numberOfGrades(5)));
        System.out.println("4: " + printStars(pointRegister.numberOfGrades(4)));
        System.out.println("3: " + printStars(pointRegister.numberOfGrades(3)));
        System.out.println("2: " + printStars(pointRegister.numberOfGrades(2)));
        System.out.println("1: " + printStars(pointRegister.numberOfGrades(1)));
        System.out.println("0: " + printStars(pointRegister.numberOfGrades(0)));
    }

    public static String printStars(int stars) {
        String star = "";

        for (int i = 0; i < stars; i++) {
            star += "*";
        }

        return star;
    }


    
}
