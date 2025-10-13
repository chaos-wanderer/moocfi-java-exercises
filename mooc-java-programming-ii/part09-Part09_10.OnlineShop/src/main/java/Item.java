public class Item {
    private String name;
    private int quantity;
    private int price;

    public Item(String product, int qty, int unitPrice) {
        this.name = product;
        this.quantity = qty;
        this.price = unitPrice;
    }

    public int price() {
        return quantity * price;
    }

    public void increaseQuantity() {
        this.quantity += 1;
    }

    public String toString() {
        return (name + ": " + quantity);
    }

    
}
