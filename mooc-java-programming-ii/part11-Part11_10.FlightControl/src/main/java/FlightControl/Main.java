package FlightControl;

import java.util.Scanner;

import FlightControl.logic.FlightControl;
import FlightControl.ui.TextUI;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FlightControl flightControl = new FlightControl();
        // Write the main program here. It is useful to create some classes of your own.

        TextUI ui = new TextUI(flightControl, scanner);
        ui.start();
    }
}
