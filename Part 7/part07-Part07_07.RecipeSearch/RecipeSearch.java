import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Recipe> recipes = new ArrayList<>();

        System.out.print("File to read: ");
        String fileName = scanner.nextLine();

        try (Scanner fileScanner = new Scanner(new File(fileName))) {

            while (fileScanner.hasNextLine()) {

                String name = fileScanner.nextLine();

                if (name.isEmpty()) {
                    continue;
                }

                int cookingTime = Integer.valueOf(fileScanner.nextLine());

                Recipe recipe = new Recipe(name, cookingTime);

                while (fileScanner.hasNextLine()) {

                    String ingredient = fileScanner.nextLine();

                    if (ingredient.isEmpty()) {
                        break;
                    }

                    recipe.addIngredient(ingredient);
                }

                recipes.add(recipe);
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("");
        System.out.println("Commands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");

        while (true) {

            System.out.println("");
            System.out.print("Enter command: ");

            String command = scanner.nextLine();

            if (command.equals("stop")) {
                break;
            }

            if (command.equals("list")) {

                System.out.println("");
                System.out.println("Recipes:");

                for (Recipe recipe : recipes) {
                    System.out.println(recipe);
                }

            } else if (command.equals("find name")) {

                System.out.print("Searched word: ");
                String searchedWord = scanner.nextLine();

                System.out.println("");
                System.out.println("Recipes:");

                for (Recipe recipe : recipes) {

                    if (recipe.getName().contains(searchedWord)) {
                        System.out.println(recipe);
                    }
                }

            } else if (command.equals("find cooking time")) {

                System.out.print("Max cooking time: ");
                int maxTime = Integer.valueOf(scanner.nextLine());

                System.out.println("");
                System.out.println("Recipes:");

                for (Recipe recipe : recipes) {

                    if (recipe.getCookingTime() <= maxTime) {
                        System.out.println(recipe);
                    }
                }

            } else if (command.equals("find ingredient")) {

                System.out.print("Ingredient: ");
                String ingredient = scanner.nextLine();

                System.out.println("");
                System.out.println("Recipes:");

                for (Recipe recipe : recipes) {

                    if (recipe.hasIngredient(ingredient)) {
                        System.out.println(recipe);
                    }
                }
            }
        }
    }
}