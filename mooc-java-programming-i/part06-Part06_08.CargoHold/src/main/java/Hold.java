import java.util.ArrayList;

public class Hold {
    private int maxWeight;
    private ArrayList<Suitcase> luggage;

    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
        this.luggage = new ArrayList<>();
        
    }

    public void addSuitcase(Suitcase suitcase) {
        if ((this.totalWeight() + suitcase.totalWeight()) > maxWeight) {
            return;
        }

        this.luggage.add(suitcase);
    }

    public int totalWeight() {
        int totalWeight = 0;

        for (Suitcase l : luggage) {
            totalWeight += l.totalWeight();
        }

        return totalWeight;

    }

    public String toString() {
        return (this.luggage.size() + " suitcases " + "(" + this.totalWeight() + " kg)");
    }

    public void printItems() {
        for (Suitcase s : luggage) {
            s.printItems();
        }
    }
    
}
