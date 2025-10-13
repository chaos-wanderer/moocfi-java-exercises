import java.util.ArrayList;

public class ChangeHistory {
    private ArrayList<Double> history;
    
    public ChangeHistory() {
        this.history = new ArrayList<>();
    }

    public void add(double status) {
        history.add(status);
    }

    public void clear() {
        history.clear();
    }

    public String toString() {
        return (history.toString());
    }

    public double maxValue() {
        if (history.isEmpty()) {
            return 0;
        }

        double largest = history.get(0);
        for (int i = 0; i < history.size(); i++) {
            largest = Math.max(largest, history.get(i));
        }

        return largest;
    }

    public double minValue() {
        if (history.isEmpty()) {
            return 0;
        }

        double smallest = history.get(0);
        for (int i = 0; i < history.size(); i++) {
            smallest = Math.min(smallest, history.get(i));
        }

        return smallest;
    }

    public double average() {
        if (history.isEmpty()) {
            return 0;
        }

        double sum = 0;
        for (Double value : history) {
            sum += value;
        }

        return (sum / history.size());
    }

    
}
