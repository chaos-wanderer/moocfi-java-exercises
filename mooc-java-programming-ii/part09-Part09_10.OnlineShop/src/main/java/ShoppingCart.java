import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
    private Map<String, Item> products;

    public ShoppingCart() {
        this.products = new HashMap<>();
    }

    public void add(String product, int price) {
        // approach 1:
        // Item existingItem = this.products.putIfAbsent(product, new Item(product, 1, price));

        // if (existingItem != null) {
        //     existingItem.increaseQuantity();
        // }


        // approach 2
        if (this.products.containsKey(product)) {
            this.products.get(product).increaseQuantity();
            
        } else {
            this.products.put(product, new Item(product, 1, price));
        }


        this.products.putIfAbsent(product, new Item(product, 1, price));
    }

    public int price() {
        int totalPrice = 0;
        for (Item item : products.values()) {
            totalPrice += item.price();
        }

        return totalPrice;
    }

    public void print() {
        for (Item item : products.values()) {
            System.out.println(item);
        }
    }
}
