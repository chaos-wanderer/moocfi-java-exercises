public class Archive {

    private String id;
    private String name;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Archive(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public boolean equals(Object compared) {
        // if the variables are located in the same position, they are equal
        if (this == compared) {
            return true;
        }

        // if the type of the compared object is not SimpleDate, the objects are not equal
        if (!(compared instanceof Archive)) {
            return false;
        }

        // convert the Object type compared object
        // into a SimpleDate type object called comparedSimpleDate
        Archive comparedArchive = (Archive) compared;

        // if the values of the object variables are the same, the objects are equal
        if (this.id.equals(comparedArchive.id)) {
            return true;
        }

        // otherwise the objects are not equal
        return false;
    }

    

    public String toString() {
        return (id + ": " + name);
    }

    
    
}
