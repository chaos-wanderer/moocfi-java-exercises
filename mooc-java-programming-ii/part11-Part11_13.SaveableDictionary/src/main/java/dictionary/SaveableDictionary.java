package dictionary;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SaveableDictionary {
    private Map<String, String> fromFinnishToAnother;
    private Map<String, String> fromAnotherToFinnish;
    private String filename;

    public SaveableDictionary() {
        this.fromFinnishToAnother = new HashMap<>();
        this.fromAnotherToFinnish = new HashMap<>();
    }

    public SaveableDictionary(String file) {
        this();
        this.filename = file;
    }

    public boolean load() {
        try (Scanner fileReader = new Scanner(Paths.get(filename))) {
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();

                if (line.isEmpty() || !line.contains(":")) {
                    continue;
                }

                String[] parts = line.split(":");

                add(parts[0], parts[1]);
            }
        } catch (Exception e) {
            return false;
        }


        return true;
    }

    public void add(String words, String translation) {
        if (fromFinnishToAnother.containsKey(words) ||
            fromAnotherToFinnish.containsKey(words)) {
            return;
        }

        fromFinnishToAnother.put(words, translation);
        fromAnotherToFinnish.put(translation, words);

    }
    
    public String translate(String word) {
        if (fromAnotherToFinnish.containsKey(word)) {
            return fromAnotherToFinnish.get(word);
        }

        if (fromFinnishToAnother.containsKey(word)) {
            return fromFinnishToAnother.get(word);
        }

        return null;
    }

    public void delete(String word) {
        if (fromFinnishToAnother.containsKey(word)) {
            String translation = fromFinnishToAnother.get(word);
            fromFinnishToAnother.remove(word);
            fromAnotherToFinnish.remove(translation);

        } else if (fromAnotherToFinnish.containsKey(word)) {
            String translation = fromAnotherToFinnish.get(word);
            fromAnotherToFinnish.remove(word);
            fromFinnishToAnother.remove(translation);
        }
    }

    public boolean save() {
        try (PrintWriter writer = new PrintWriter(new FileWriter(filename))) {

            for (Map.Entry<String,String> entry : fromFinnishToAnother.entrySet()) {
                writer.println(entry.getKey() + ":" + entry.getValue());
            }

            return true;
        } catch (IOException e) {
            return false;
        }
    }



}
