package at.campus02.bsd;

import java.util.ArrayList;
import java.util.List;

public class Cocktail extends Drink {

    private final List<Liquid> liquids;

    public Cocktail(String name, List<Liquid> liquids) {
        super(name);
        this.liquids = new ArrayList<>(liquids);
    }

    @Override
    public double getVolume() {
        double volume = 0.0;

        for (Liquid liquid : liquids) {
            volume += liquid.getVolume();
        }

        return volume;
    }

    @Override
    public double getAlcoholPercent() {
        if (liquids.isEmpty()) {
            return 0.0;
        }

        double totalVolume = getVolume();

        if (totalVolume == 0.0) {
            return 0.0;
        }

        double alcoholVolume = 0.0;

        for (Liquid liquid : liquids) {
            alcoholVolume += liquid.getVolume()
                    * liquid.getAlcoholPercent() / 100.0;
        }

        return alcoholVolume / totalVolume * 100.0;
    }

    @Override
    public boolean isAlcoholic() {
        return getAlcoholPercent() > 0.0;
    }
}