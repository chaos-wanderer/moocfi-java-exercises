public class Book {

    private String name;
    private int ageRecommendation;

    public String getName() {
        return name;
    }

    public int getAgeRecommendation() {
        return ageRecommendation;
    }

    public Book(String name, int ageRecommendation) {
        this.name = name;
        this.ageRecommendation = ageRecommendation;
    }

    public String toString() {
        return (name + " (recommended for " + ageRecommendation + " year-olds or older)");
    }

    
    
}
