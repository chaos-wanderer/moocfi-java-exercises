import java.util.ArrayList;

public class OneItemBox extends Box {
    private ArrayList<Item> oneItemOnly;

    public OneItemBox() {
        this.oneItemOnly = new ArrayList<>();
    }

    public void add(Item item) {
        if (this.oneItemOnly.size() < 1) {
            this.oneItemOnly.add(item);
        }
    }

    public boolean isInBox(Item item) {
        return (oneItemOnly.contains(item));
    }


    
}
