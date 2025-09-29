
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("File:");
        String file = scan.nextLine();

        System.out.println("Team:");
        String team = scan.nextLine();

        scan.close();

        ArrayList<Team> teams = readFromFile(file, team);

        

        // System.out.println();

        Team found = null;

        for (Team t : teams) {
            if (t.getName().equalsIgnoreCase(team)) {
                found = t;
                break;
            }
        }

        if (found == null) {
            System.out.println("Team: N/A");
            System.out.println("Games: " + 0);
            System.out.println("Wins: " + 0);
            System.out.println("Losses: " + 0);
        } else {
            System.out.println("Team: " + found.getName());
            System.out.println("Games: " + found.getGames());
            System.out.println("Wins: " + found.getWins());
            System.out.println("Losses: " + found.getLoses());
        }

        // for (Team t : teams) {

        //     if (t.getName().equalsIgnoreCase(team)) {
                
        //         // System.out.println("Team: " + t.getName());
        //         System.out.println("Games: " + t.getGames());
        //         System.out.println("Wins: " + t.getWins());
        //         System.out.println("Losses: " + t.getLoses());
        //     }

        // }



    }

    public static ArrayList<Team> readFromFile(String file, String team) {

        ArrayList<Team> teams = new ArrayList<>();

        try (Scanner scanner = new Scanner(Paths.get(file))) {
            while (scanner.hasNextLine()) {

                String line = scanner.nextLine();

                if (line.isEmpty()) {
                    continue;
                }

                String[] parts = line.split(",");

                String team1 = parts[0];
                String team2 = parts[1];

                int team1Pts = Integer.valueOf(parts[2]);
                int team2Pts = Integer.valueOf(parts[3]);

                updateTeamStats(teams, team1, (team1Pts > team2Pts));
                updateTeamStats(teams, team2, (team2Pts > team1Pts));

                



                
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return teams;
    }

    public static void updateTeamStats(ArrayList<Team> teams, String teamName, boolean won) {

        for (Team t : teams) {
            if (t.getName().equalsIgnoreCase(teamName)) {
                t.recordGame(won);
                return;
            }
        }


        Team newTeam = new Team(teamName);
        newTeam.recordGame(won);
        teams.add(newTeam);

    }

}
