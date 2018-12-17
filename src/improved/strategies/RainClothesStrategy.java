package improved.strategies;

public class RainClothesStrategy implements MyClothesStrategy {

    @Override
    public String getClothes() {
        return "dress ans jacket";
    }

    @Override
    public String getAccessories() {
        return "umbrella";
    }
}

