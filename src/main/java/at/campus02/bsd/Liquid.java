package at.campus02.bsd;

/**
 * Represents a liquid ingredient used in drinks.
 * Contains information about name, volume, and alcohol percentage.
 */
public class Liquid {
    /**
     * Name of the liquid.
     */
    private String name;

    /**
     * Volume in liters.
     */
    private double volume;

    /**
     * Alcohol percentage (e.g. 42 for 42%).
     */
    private double alcoholPercent;

    /**
     * Creates a Liquid object with specified properties.
     *
     * @param name name of the liquid
     * @param volume volume in liters
     * @param alcoholPercent alcohol percentage (e.g. 42 for 42%)
     */
    public Liquid(String name, double volume, double alcoholPercent) {
        this.name = name;
        this.volume = volume;
        this.alcoholPercent = alcoholPercent;
    }

    /**
     * Returns the name of the liquid.
     *
     * @return the liquid name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the liquid.
     *
     * @param name the new liquid name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns the volume in liters.
     *
     * @return volume in liters
     */
    public double getVolume() {
        return volume;
    }

    /**
     * Sets the volume in liters.
     *
     * @param volume the new volume in liters
     */
    public void setVolume(double volume) {
        this.volume = volume;
    }

    /**
     * Returns the alcohol percentage.
     *
     * @return alcohol percentage (e.g. 42 for 42%)
     */
    public double getAlcoholPercent() {
        return alcoholPercent;
    }

    /**
     * Sets the alcohol percentage.
     *
     * @param alcoholPercent the new alcohol percentage (e.g. 42 for 42%)
     */
    public void setAlcoholPercent(double alcoholPercent) {
        this.alcoholPercent = alcoholPercent;
    }
}