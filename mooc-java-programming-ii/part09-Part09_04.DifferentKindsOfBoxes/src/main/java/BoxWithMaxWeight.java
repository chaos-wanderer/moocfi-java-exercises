import java.util.ArrayList;

public class BoxWithMaxWeight extends Box {
    private ArrayList<Item> items;
    private int maxCapacity;

    public BoxWithMaxWeight(int capacity) {
        this.maxCapacity = capacity;
        this.items = new ArrayList<>();
    }

    @Override
    public void add(Item item) {
        int weight = 0;

        for (Item i : items) {
            weight += i.getWeight();
        }

        if (!(item.getWeight() + weight > maxCapacity)) {
            this.items.add(item);
            weight += item.getWeight();
        }
    }

    public boolean isInBox(Item item) {
        return (items.contains(item));
    }
    
}
