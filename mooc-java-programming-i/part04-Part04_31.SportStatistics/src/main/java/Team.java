public class Team {
    private String name;
    private int games;
    private int wins;
    private int loses;

    public int getWins() {
        return wins;
    }

    public int getLoses() {
        return loses;
    }

    public Team(String name) {
        this.name = name;
        this.games = 0;
        this.wins = 0;
        this.loses = 0;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getGames() {
        return games;
    }
    public void setGames(int games) {
        this.games = games;
    }

    public void recordGame(boolean won) {
        games++;

        if (won) {
            wins++;
        } else {
            loses++;
        }

    }
    
    

}
