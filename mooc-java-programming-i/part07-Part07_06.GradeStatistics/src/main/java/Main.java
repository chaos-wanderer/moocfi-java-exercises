import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PointRegister pointRegister = new PointRegister();

        UserInterface ui = new UserInterface(pointRegister, scanner);

        ui.start();
    }


}
