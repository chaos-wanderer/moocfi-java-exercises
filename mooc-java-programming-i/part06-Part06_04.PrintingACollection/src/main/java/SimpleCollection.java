
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    @Override
    public String toString() {
        String printOutput = "The collection " + this.name;
        String outputElements = "";

        // for (String e : elements) {
        //     outputElements += e + "\n";
        // }

        for (int i = 0; i < elements.size(); i++) {
            if (i > 0) {
                outputElements += "\n";
            }

            outputElements += elements.get(i);
        }

        if (this.elements.size() == 1) {
            return (printOutput + " has 1 element:\n" + outputElements); 

        } else if (this.elements.size() > 1) {
            return printOutput + " has " + this.elements.size() + 
            " elements:\n" + outputElements;

        }
        
        // if the collection is empty
        return printOutput + " is empty.";
    }
    
}
