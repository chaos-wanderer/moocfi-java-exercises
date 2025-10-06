import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private ArrayList<Recipe> recipes;

    public UserInterface(Scanner scanner, ArrayList<Recipe> recipes) {
        this.scanner = scanner;
        this.recipes = recipes;
    }

    public void start() {
        readCommand();
    }

    private void readCommand() {
        System.out.print("File to read: ");
        String file = scanner.nextLine();
        readFile(file);

        while (true) {
            System.out.println("Commands:");
            System.out.println("list - lists the recipes");
            System.out.println("stop - stops the program:");
            System.out.println("find name - searches recipe by name");
            System.out.println("find cooking time - searches recipes by cooking time");
            System.out.println("find ingredient - searches recipes by ingredient");
            System.out.println("");
            System.out.print("Enter command: ");
            String command = scanner.nextLine();


            if (command.equals("stop")) {
                break;
            }


            processCommand(command);
        }


    }

    private void processCommand(String command) {


        if (command.equals("list")) {
            listRecipes();

        } else if (command.equals("find name")) {
            System.out.print("Searched word: ");
            String word = scanner.nextLine();

            findRecipeByName(word);

        } else if (command.equals("find cooking time")) {
            System.out.print("Max cooking time: ");
            int maxCookingTime = Integer.valueOf(scanner.nextLine());

            findRecipeByTime(maxCookingTime);

        } else if (command.equals("find ingredient")) {
            System.out.print("Ingredient: ");
            String ingredient = scanner.nextLine();

            findRecipeByIngredient(ingredient);
        }

        
    }

    private void readFile(String file) {
        try (Scanner scan = new Scanner(Paths.get(file))) {

            while (scan.hasNextLine()) {
                String recipeName = scan.nextLine();
                if (recipeName.isEmpty()) {
                    continue;
                }

                int cookingTime = Integer.valueOf(scan.nextLine());
                ArrayList<String> ingredients = new ArrayList<>();

                while (scan.hasNextLine()) {
                    String ingredient = scan.nextLine();

                    if (ingredient.isEmpty()) {
                        break;
                    }

                    ingredients.add(ingredient);
                }

                recipes.add(new Recipe(recipeName, cookingTime, ingredients));
            }

        } catch (Exception e) {
                System.out.println(e.getMessage());
        }
    }

    private void listRecipes() {

        System.out.println("Recipes:");
        for (Recipe r : recipes) {
            System.out.println(r);
        }
    }

    private void findRecipeByName(String name) {
        System.out.println("Recipes:");


        for (Recipe r : recipes) {
            if (r.getName().toLowerCase().contains(name)) {
                System.out.println(r);
            }
        }
    }

    private void findRecipeByTime(int time) {
        System.out.println("Recipes:");

        for (Recipe r : recipes) {
            if (r.getCookingTime() <= time) {
                System.out.println(r);
            }
        }

    }

    private void findRecipeByIngredient(String ingredient) {
        System.out.println("Recipes:");


        for (Recipe r : recipes) {
            if (r.getIngredients().contains(ingredient)) {
                System.out.println(r);
            }
        }
    }

    
}
