public class Container {

    private int liquid;

    public Container() {
        this.liquid = 0;
    }

    public int contains() {
        return this.liquid;
    }

    public void add(int amount) {
        if (amount < 0) {
            return;
        }

        this.liquid = Math.min(100, this.liquid + amount);
    }

    public void remove(int amount) {
        if (amount < 0) {
            return;
        }

        this.liquid = Math.max(0, this.liquid - amount);
    }

    public void move(int amount, Container anotherContainer) {
        if (amount < 0) {
            return;
        }

        System.out.println("amount " + amount);
        System.out.println("another container amount" + anotherContainer.contains());

        int moved = Math.min(amount, this.liquid);

        this.liquid -= moved;

        anotherContainer.add(Math.min(100, anotherContainer.contains() + moved));
    }

    public String toString() {
        return (this.liquid + "/100");
    }
    
}
