
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.valueOf(scanner.nextLine());
        int num2 = Integer.valueOf(scanner.nextLine());

        System.out.println(squareRootOfSum(num1, num2));



    }

    public static double squareRootOfSum(int num1, int num2) {
        int sum = num1 + num2;

        return Math.sqrt(sum);
    }
}
