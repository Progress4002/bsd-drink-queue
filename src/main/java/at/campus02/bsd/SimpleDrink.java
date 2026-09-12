package at.campus02.bsd;

/**
 * Class represents a simple drink consisting of a single liquid.
 * Implements the Drink interface for basic drink functionality.
 */
public class SimpleDrink extends Drink {
    /**
     * The single liquid ingredient in this drink.
     */
    protected Liquid l;

    /**
     * Creates a SimpleDrink object with given name and liquid.
     *
     * @param name name of the drink
     * @param l the liquid ingredient
     */
    public SimpleDrink(String name, Liquid l) {
        super(name);
        this.l = l;
    }

    /**
     * Returns volume of the liquid.
     *
     * @return the volume of drink in liter
     */
    @Override
    public double getVolume() {
        return l.getVolume();
    }

    /**
     * Returns alcohol volume percent of the liquid.
     *
     * @return alcohol volume percent
     */
    @Override
    public double getAlcoholPercent() {
        return l.getAlcoholPercent();
    }

    /**
     * Checks if the drink is alcoholic.
     *
     * @return true when alcohol percent is greater than 0, otherwise false
     */
    @Override
    public boolean isAlcoholic() {
        return l.getAlcoholPercent() > 0;
    }
}