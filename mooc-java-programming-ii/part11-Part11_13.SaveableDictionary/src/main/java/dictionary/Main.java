package dictionary;

public class Main {
    public static void main(String[] args) {
        // You can test your dictionary here
        SaveableDictionary dictionary = new SaveableDictionary("words.txt");
dictionary.load();

dictionary.add("loyd", "che");
dictionary.add("che", "loyd");
dictionary.add("brandish", "wife");


// use the dictionary

dictionary.save();
    }
}
