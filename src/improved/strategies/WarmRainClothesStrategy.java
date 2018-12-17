package improved.strategies;

public class WarmRainClothesStrategy implements MyClothesStrategy {

    @Override
    public String getClothes() {
        return "dress and raincoat";
    }

    @Override
    public String getAccessories() {
        return "umbrella and hat";
    }
}

