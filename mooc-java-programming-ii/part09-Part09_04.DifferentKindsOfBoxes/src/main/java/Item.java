
public class Item {

    private String name;
    private int weight;

    public Item(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public Item(String name) {
        this(name, 0);
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public boolean equals(Object object) {
        // if the variables are located in the same place, they're the same
        if (this == object) {
            return true;
        }

        // if comparedObject is not of type Item, the objects aren't the same
        if (!(object instanceof Item)) {
            return false;
        }

	
	//if (getClass() != obj.getClass())
            //return false;

        // let's convert the object to a Item-object
        Item compared = (Item) object;

        // if the instance variables of the objects are the same, so are the objects
        if (this.name.equals(compared.name)) {
            return true;
        }

        // otherwise, the objects aren't the same
        return false;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + name.hashCode();
        return result;
    }



}
