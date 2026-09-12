package at.campus02.bsd;

import java.util.List;
import java.util.ArrayList;

/**
 * Represents a cocktail consisting of multiple liquid ingredients.
 * Implements the Drink interface for complex drink functionality.
 */
public class Cocktail extends Drink {
    /**
     * List of liquid ingredients in this cocktail.
     */
    private List<Liquid> ingredients;

    /**
     * Creates a Cocktail with given name and list of ingredients.
     *
     * @param name name of the cocktail
     * @param ingredients list of liquid ingredients
     */
    public Cocktail(String name, List<Liquid> ingredients) {
        super(name);
        this.ingredients = new ArrayList<>(ingredients);
    }

    /**
     * Calculates and returns total volume of all ingredients.
     *
     * @return total volume in liters
     */
    @Override
    public double getVolume() {
        double total = 0;
        for (Liquid ingredient : ingredients) {
            total += ingredient.getVolume();
        }
        return total;
    }

    /**
     * Calculates and returns weighted average alcohol percentage.
     *
     * @return weighted average alcohol volume percent
     */
    @Override
    public double getAlcoholPercent() {
        double totalVolume = getVolume();
        if (totalVolume == 0) {
            return 0;
        }
        double totalAlcohol = 0;
        for (Liquid ingredient : ingredients) {
            totalAlcohol += ingredient.getVolume() * ingredient.getAlcoholPercent();
        }
        return totalAlcohol / totalVolume;
    }

    /**
     * Checks if the cocktail contains any alcoholic ingredients.
     *
     * @return true if any ingredient has alcohol percent > 0, otherwise false
     */
    @Override
    public boolean isAlcoholic() {
        for (Liquid ingredient : ingredients) {
            if (ingredient.getAlcoholPercent() > 0) {
                return true;
            }
        }
        return false;
    }

    /**
     * Returns the list of ingredients.
     *
     * @return unmodifiable list of liquid ingredients
     */
    public List<Liquid> getIngredients() {
        return new ArrayList<>(ingredients);
    }

    /**
     * Adds an ingredient to the cocktail.
     *
     * @param ingredient the liquid to add
     */
    public void addIngredient(Liquid ingredient) {
        ingredients.add(ingredient);
    }
}