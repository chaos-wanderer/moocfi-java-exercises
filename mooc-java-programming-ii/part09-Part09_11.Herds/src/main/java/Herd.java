import java.util.ArrayList;
import java.util.List;

public class Herd implements Movable {
    private List<Movable> movables;

    public Herd() {
        this.movables = new ArrayList<>();
    }

    public void addToHerd(Movable movable) {
        movables.add(movable);
    }

    public void move(int dx, int dy) {
        for (Movable movable : movables) {
            movable.move(dx, dy);
        }
    }



    public String toString() {
        String returnString = "";
        for (Movable movable : movables) {
            returnString += movable + "\n";
        }

        return returnString;
    }
}
