import java.util.HashMap;

public class Abbreviations {
    private HashMap<String, String> abbreviations;

    public Abbreviations() {
        this.abbreviations = new HashMap<>();
    }
    
    public void addAbbreviation(String abbreviation, String explanation) {
        String sanitizedAbbreviation = sanitizedString(abbreviation);

        if (this.abbreviations.containsKey(sanitizedAbbreviation)) {
            System.out.println("Abbreviation already exists!");
        } else {
            this.abbreviations.put(sanitizedAbbreviation, explanation);
        }
    }

    public String sanitizedString(String string) {
        if (string == null) {
            return "";
        }

        String sanitizedString = string.toLowerCase().trim();

        return sanitizedString;
    }

    public boolean hasAbbreviation(String abbreviation) {
        

        if (this.abbreviations.containsKey(sanitizedString(abbreviation))) {
            return true;
        }

        return false;
    }

    public String findExplanationFor(String abbreviation) {
        String sanitizedAbbreviation = sanitizedString(abbreviation);

        if (hasAbbreviation(sanitizedAbbreviation)) {
            return this.abbreviations.get(sanitizedAbbreviation);
        } else {
            return null;
        }
    }
    
}
