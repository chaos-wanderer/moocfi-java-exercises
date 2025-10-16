
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LiteracyComparison {
    
    public static void main(String[] args) {
        try {

            Files.lines(Paths.get("literacy.csv"))
                .map(row -> row.split(","))
                .filter(parts -> parts.length >= 5)
                .map(parts -> new LiteracyData(parts[3], Integer.valueOf(parts[4]), 
                    parts[2].replace("(%)", "").trim(), Double.valueOf(parts[5])))
                .sorted()
                .forEach(System.out::println);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}
