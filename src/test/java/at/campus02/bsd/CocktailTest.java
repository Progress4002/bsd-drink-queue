package at.campus02.bsd;

import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

public class CocktailTest {

    @Test
    public void testCocktailConstructor() {
        List<Liquid> ingredients = new ArrayList<>();
        ingredients.add(new Liquid("Vodka", 0.04, 40));
        ingredients.add(new Liquid("Orange Juice", 0.16, 0));
        Cocktail cocktail = new Cocktail("Screwdriver", ingredients);
        assertEquals("Screwdriver", cocktail.getName());
    }

    @Test
    public void testGetVolume() {
        List<Liquid> ingredients = new ArrayList<>();
        ingredients.add(new Liquid("Vodka", 0.04, 40));
        ingredients.add(new Liquid("Orange Juice", 0.16, 0));
        Cocktail cocktail = new Cocktail("Screwdriver", ingredients);
        assertEquals(0.2, cocktail.getVolume(), 0.001);
    }

    @Test
    public void testGetAlcoholPercent() {
        List<Liquid> ingredients = new ArrayList<>();
        ingredients.add(new Liquid("Vodka", 0.04, 40));
        ingredients.add(new Liquid("Orange Juice", 0.16, 0));
        Cocktail cocktail = new Cocktail("Screwdriver", ingredients);
        assertEquals(8.0, cocktail.getAlcoholPercent(), 0.001);
    }

    @Test
    public void testIsAlcoholicTrue() {
        List<Liquid> ingredients = new ArrayList<>();
        ingredients.add(new Liquid("Vodka", 0.04, 40));
        ingredients.add(new Liquid("Orange Juice", 0.16, 0));
        Cocktail cocktail = new Cocktail("Screwdriver", ingredients);
        assertTrue(cocktail.isAlcoholic());
    }

    @Test
    public void testIsAlcoholicFalse() {
        List<Liquid> ingredients = new ArrayList<>();
        ingredients.add(new Liquid("Water", 0.2, 0));
        ingredients.add(new Liquid("Juice", 0.1, 0));
        Cocktail cocktail = new Cocktail("Mocktail", ingredients);
        assertFalse(cocktail.isAlcoholic());
    }

    @Test
    public void testGetIngredients() {
        List<Liquid> ingredients = new ArrayList<>();
        ingredients.add(new Liquid("Vodka", 0.04, 40));
        Cocktail cocktail = new Cocktail("Shot", ingredients);
        assertEquals(1, cocktail.getIngredients().size());
    }

    @Test
    public void testAddIngredient() {
        List<Liquid> ingredients = new ArrayList<>();
        ingredients.add(new Liquid("Vodka", 0.04, 40));
        Cocktail cocktail = new Cocktail("Drink", ingredients);
        cocktail.addIngredient(new Liquid("Juice", 0.1, 0));
        assertEquals(2, cocktail.getIngredients().size());
    }
}