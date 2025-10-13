import java.util.ArrayList;

public class Box implements Packable {
    private ArrayList<Packable> packables;
    private double maxCapacity;

    public Box(double maxCapacity) {
        this.packables = new ArrayList<>();
        this.maxCapacity = maxCapacity;
    }

    public void add(Packable packable) {
        if (!(packable.weight() + this.weight() > maxCapacity)) {
            this.packables.add(packable);
        }


    }

    public double weight() {
        double weight = 0;

        for (Packable packable : packables) {
            weight += packable.weight();
        }

        return weight;
    }
    
    @Override
    public String toString() {
        return ("Box: " + packables.size() + " items, total weight " + weight() + " kg");
    }
    

}
