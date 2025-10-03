import java.util.ArrayList;
import java.util.Random;

public class JokeManager {
    private ArrayList<String> jokes;



    public JokeManager() {
        this.jokes = new ArrayList<>();
    }

    public void addJoke(String joke) {
        this.jokes.add(joke);
    }

    public String drawJoke() {
        if (this.jokes.isEmpty()) {
            return ("Jokes are in short supply.");
            
        }

        Random random = new Random();
        int randomIndex = random.nextInt(this.jokes.size());
        return (this.jokes.get(randomIndex));
    }

    public ArrayList<String> getJokes() {
        return jokes;
    }

    public void printJokes() {
        for (String j : this.jokes) {
            System.out.println(j);
        }
    }

    
    
}