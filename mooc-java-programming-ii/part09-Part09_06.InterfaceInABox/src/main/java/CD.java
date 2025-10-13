public class CD implements Packable {

    private String name;
    private String artist;
    private int year;
    private double weight;

    public CD(String name, String artist, int year) {
        this.name = name;
        this.artist = artist;
        this.year = year;
        this.weight = 0.1;
    }

    @Override
    public double weight() {
        return weight;
    }

    @Override
    public String toString() {
        return (name + ": " + artist + " (" + year + ")");
    }




}
